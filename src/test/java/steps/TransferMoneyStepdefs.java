package steps;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import objects.Account;
import org.junit.Assert;
import service.TransferService;
import base.BaseIntegrationTest;

import java.util.List;
import java.util.Map;

public class TransferMoneyStepdefs extends BaseIntegrationTest {

    @DataTableType
    public Account accountEntry(Map<String, String> entry) {

        Account account = new Account.Builder()
                .setAccId(entry.get("accId"))
                .setAmount(Double.parseDouble(entry.get("amount")))
                .build();
        context.accounts.putIfAbsent(entry.get("accPrefix"), account);

        return account;
    }


    @Given("user creates account(s):")
    public void createAccounts(List<Account> accounts) {
        for (Account acc : accounts) {
            System.out.println("Account with id = " + acc.getAccId() + " was created");
        }
    }

    @Given("user gets account {word} and compares values with:")
    public void getAccountAndCompareItWithExpectedValues(String accPrefix, Account expectedAccount) {
        Account receivedAccount = context.accounts.get(accPrefix);
        Assert.assertEquals(receivedAccount.getAmount(), expectedAccount.getAmount(), 0001);

        System.out.println("Received account id = " + receivedAccount.getAccId() + " and amount = " + receivedAccount.getAmount());
    }

    @Given("user transfers amount {int} from {word} to {word}")
    public void transferMoneyFromOneAccountToAnother(int amount, String accFromPrefix, String accToPrefix) {

        TransferService service = new TransferService();
        Account accFrom = context.accounts.get(accFromPrefix);
        Account accTo = context.accounts.get(accToPrefix);
        service.transfer(accFrom, accTo, amount);

        System.out.println("Amount " + amount + " was transfered from account id = " + accFrom.getAccId()
                + " to account id = " + accTo.getAccId());
    }

}
