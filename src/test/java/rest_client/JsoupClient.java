package rest_client;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class JsoupClient {

    public Document getDataByUrl(String url) throws IOException {
        return Jsoup.connect(url)
                .cookie("SESSIONID", "__ddg1=41ymRK8MIJswyO4aD2bJ; _gcl_au=1.1.843458215.1635460483; _ym_uid=1635460483201334675;" +
                        " _ym_d=1635460483; u=2oy0r7bm.cyu2i4.xuhutnwcl8g0; isCriteoSetNew=true; __" +
                        "gads=ID=90441816c22bbc39:T=1635460504:S=ALNI_MZfwmERp9G_OyhkucisWXqY1CvSyQ; buyer_location_id=637640; buyer_laas_location=637640;" +
                        " tmr_lvid=42b6c91863ab20f42f450c6fd03ad1dc; tmr_lvidTS=1635701333101; _fbp=fb.1.1635701333376.329361328; " +
                        "SEARCH_HISTORY_IDS=0%2C; _gid=GA1.2.146457467.1638047440; _ym_isad=2; v=1638138782; " +
                        "f=5.4d6587121516f11bb32428cf8e3c6b5047e1eada7172e06c47e1eada7172e06c47e1eada7172e06c47e1eada7172e06cb59320d6eb" +
                        "6303c1b59320d6eb6303c1b59320d6eb6303c147e1eada7172e06c8a38e2c5b3e08b898a38e2c5b3e08b890df103df0c26013a0df103df0c26013" +
                        "a2ebf3cb6fd35a0ac0df103df0c26013a8b1472fe2f9ba6b94bf3d8edfdd6175d7a4f9e17b6a8c78d831064c92d93c3903815369ae2d1a81d04dbc" +
                        "ad294c152cb0df103df0c26013aba0ac8037e2b74f9dc5322845a0cba1a2da10fb74cac1eab8b1472fe2f9ba6b91d6703cbe432bc2a71e7cb57bbc" +
                        "b8e0f2da10fb74cac1eab2da10fb74cac1eab3c02ea8f64acc0bd2ebf3cb6fd35a0ac20f3d16ad0b1c546b892c6c84ad16848a9b4102d42ade879dc" +
                        "b5a55b9498f642f8d62ba8b0956ff4cb5ec09fa5c57cfa2c5a8413db534ca27acbd005a9d1e52d23d9f5f1350376430f3f712b8d5a1bbedb94d2a9e66" +
                        "de4822ebf3cb6fd35a0ac0df103df0c26013a28a353c4323c7a3a140a384acbddd748def4bfa7658c3f1b3de19da9ed218fe23de19da9ed218fe2ddb88" +
                        "1eef125a8703b2a42e40573ac3cbc20fe175b332be7c6546f8c1505c8f7; ft=\"pMO5EaNgsxD9uEI4sPaeEOT8fgQWN6k9euXX0tHlQi/0tgzu8l2vG6ZAI" +
                        "QwRGxSrYFZ/l06xRbVMHS6BQefpIg1ic7FnNqEi9th2jfjr1N71knVU1DVvjC6cTg9kR/+4TorV+wgxIK36taXao+61jaR8oOxJqEe6Hr7DlGVVkehDAZKCV0R9" +
                        "23yE91Gm/otJ\"; luri=moskva; dfp_group=19; showedStoryIds=76-75-74-71-69-68-66-63-61-50-49; lastViewingTime=163813878858" +
                        "1; _ym_visorc=b; st=t%3AeyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJkYXRhIjoidko0TkJ5SlU2TElJTGRDY3VNTkdBZm5PRWwySzdtS01KZX" +
                        "BFMDh1VUFITHhoSEVaTDI4RkRtVU4vdnlyUERoYzBYVHN1SUlsRndBUzVKM0NqTUNWMmduOE5XalFHVzVlbzl2QVBLazI1T3FSR0xVblQxVUwxdU5HeW1FQ" +
                        "3JSVG1wT2VrcUFyM2pBc1MrZ2tRb2tNLzgyejIzNDVYZW9SazhyVENDS2cvSWJlcEtKaWRQNVo3cksxSUpsR2JNM1J6OTNXV2dsT1B5cDBxYy9nMHgzbG1z" +
                        "eEQyaGUrRXFqeHJBZGVzUkpwWHh4TkszWXRwdHpPbTdqanc2M21XeVJ2cCs1NWkycHNBcTNhLytheFFhRi9JRUEwL0ZsZlJZSGdFMUx1MkZadDRxRnE1SHJw" +
                        "RUd3UkhuaEJKeUJXYVE3T2JmY3R0Nmx6c2M4K052eGpaR0R3ckxxaVBpQzZSdE5udkwvVmw2aCs1UytGYmdmblNtR3ZjMU5odGlYbUFRcTU4d3ZrVHMzc3FsVH" +
                        "JUcWxpVytkS3crQ0FjSXpYSXRuMFpWakF6M29ydENMZmNZUU9VNk5hemhFb0ZQTmhRb2YvNitRK1dxcDFzRk9iVEpsdzYxOUZ2b2xnZHNsRE1rTFRrTFVUZ2l" +
                        "FVkt0eUxRV0F3SFdLOFVMVXZjY2JXaFlhTWZZOTQxRm9Ic3VWYytHeGZWN09lVURpMjJoNTI5cmJjaTBMN2pBTUZ5VXoxNUZqb3c1Qm1hVm83bjgxbmlnODhsO" +
                        "ThKUEJjR1dYdHFpSVhIbUJBamdTc1JNREZZNzMvNVBUbVJKdjcvSVpjcTFlNlVRd01UbVZDR3BsbUEraUs2OXZ6QWlEVHRuM00rQmVXRVFkVGE3T3FHVHVkUEk2" +
                        "TE85L1EzWFM1SUhHdXFZY0liRWNLMmJ4WEJST1kxTmxzOGhrS09vWE8zTlczSFVuSFFHaVVCVVhkZE9WS3JRdFJYbHVBT043WUVBaWt5bnhjSDZVdFE0NU9lVk1nd" +
                        "29uc3ZGdWdzc2l1ektMSVJmRzM3QllTeXFkSVViSXZrRHI4Q3RPSFpyaTBUbzk0SG5rMDc0Qit4RitJUCtmUnJqZWViYTJFUEtXazhkU0xaYkJCVE9yM2lnVG5uZUN" +
                        "qMzFqQ0N2MWg0OFhrSTlpYzE3VFpwSzJ2MkwyOFZzVUQ0ZERxWTEwUkliRGJSdlpIcWtnbEZxeFJ1VFJrckRvV20vTlhSSElqRlJXTFpFUkdCanJ5RHVhK3NvUXkvRT" +
                        "d2Z0VPNEtNQXFpbE1BVGZJaVVSWExsMmJIT0FGRng0OW9UWUplVjJWVWtsdWFhWjJIMnU3a0RaSlQrQ2ZXME44ZUZlM1pFcFFPbi9Ic1RlWTJ4Ynh5NmhJNjcyMEhMM0th" +
                        "clYxYWd4Y2haakFId1MvMHBtcjc3YlU5dXlrQzhpZnk0T2gxcWpnMWdHWmZaRTlmUFJMeWQ2NHdiOGNLWURTWkh4SmVBSTQ1ay9ESE5UVXhrK1J0RkNGdk9IMU1mQnVvVERJ" +
                        "MXZTMUJmd2h0NktnVjFQZ1VxTUdqL0lBempyRHNteVFJL3ZHWTlIUE5SekRiaz0iLCJpYXQiOjE2MzgxMzI5OTAsImV4cCI6MTYzOTM0MjU5MH0.7T88S1rF0CjN0w9b1GDCpR-" +
                        "AasTDLRY1w_mNUfPfsGY%26e%3AY8k%2BNz62pYDYaCgZuDybq0ZHMAsXf2IX8dmyXDQ3rRbz3TdN8Mt%2F9fmQa2KaNzNJPYiNDGdXGtVXd7pXfW4%2FAy%2FoRdtC6PBwfEZ8" +
                        "U0CDAHj0WUOlBvm9vHNmLvc4L%2FqtrsK8h90ipPRdvhbEuT6IarM%2B9V2Y1HKzvRy394hV28jEDyxPvVGpc%2BN0GM3k1zQzZ1Y%2FREBv5L6d4a6fr2QzaBnwhJRlWEphGr" +
                        "Ah1B%2BmCawwM1vRkylW2caawlAdFKnYe1v7FZKtd1H7xkZpHZefQ%2B2c4V0bu2HBshMnBjKXHSXVHn7g84YV0KxWq0oMCQO2.jrNBjC53tLznLOFp; sx=H4sIAAAAAAAC%2F" +
                        "1zOTZ7CIAxA8buw7iINNBBvAwH6Oa1KFXV%2BvfusunAu8H%2FvVwE7myUmRNTBS8udDdRRhzG0kDyqy696qot6ODNif39PZn1NxoUrzTLuvud5WDZPqlFJXVrSDrFDa45Gocbl" +
                        "pw6Pz1Jn52pfBZyDbZaTTMVCdJG8fQ23YQ1XY9xyt9sY4%2F3xvn%2BTDEejiIgkWspM3JEhTjYkzdF2IGIjn7JJtwqtL7HD51jaW9odTy7u8ET93P7Ngj0a5U3w2UXrJCO3bKz" +
                        "tIreBogijjf6UZ9a3sA0jDpPdc6FX%2B1l83T%2BzmPIzbl%2ByRjoalfqy3hZ%2BX2fo%2B%2BqKcbWCq6WcpEayCRBiELQiQJldzgBJu8ze69gJJLby75qPRmU2lHNsTQDx3CVv" +
                        "wJBnDBqi1hzOxPDSIjBM47pO%2B%2Bi9fwcsbEx4Xqmf12%2BZzHH8BQAA%2F%2F9iXLhUGAIAAA%3D%3D; abp=0; _ga_9E363E7BES=GS1.1.1638138786.13.1.1638138" +
                        "927.59; _ga=GA1.2.1850110172.1635460483; _dc_gtm_UA-2546784-1=1; cto_bundle=f8PKXl9ueWklMkZwWkhRMHk4ZHZHMzdRTTZMWndqbkdteTJFdTA4WjlaSUlQ" +
                        "NkpCeW5zWElWbHRQVFlibW92M2FiODg4UDZma3BiN1FvaEdMVHZQWGNyZE9ieEglMkJldEt1aFRvWkJPMUtvcU9LUlFIQUR1SSUyRnV5OWxJc1Q1UXFuNjd4b01FZkFDTENBNnVzN" +
                        "GZ6MWNGcmZPY2hJR0dqMGtjZHFkaTQ4SmtHd2dyM0c2MVZDMGliQVUxYzJXV0djOVVPUEp5b0E; tmr_detect=0%7C1638138930457; buyer_from_page=catalog; tmr_re" +
                        "qNum=189").get();
    }
}
