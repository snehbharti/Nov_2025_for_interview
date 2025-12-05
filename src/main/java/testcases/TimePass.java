package testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimePass {

	@Test
	public void getCookiesData() {

		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://reddit.com");

		Set<Cookie> cookies = driver2.manage().getCookies();

		for (Cookie c : cookies) {
			System.out.println(c);
		}
//		        g_state={"i_l":0,"i_ll":1764087090600,"i_b":"keLDMxFQDnNWKv2OAWFkM0/tn3O7mPk9z16hmrNc4Ng"}; expires=Sun, 24 May 2026 16:11:30 GMT; path=/; domain=www.reddit.com; sameSite=Lax
//				session_tracker=cgrcnnieoekfcebpjk.0.1764087095661.Z0FBQUFBQnBKZFUzdkIzeEpEUW5lV1V5OVVuZzZGNkJuem1HZVVlRzVJZE5xeXlsWFVCVk9yeTd2Q1hUVjczRlZLcjdJbFRDUHpwRUxGNGw4TWR4SkFZUkIxZUZtaWI3RzRXUkEyZGlCTmw5c2VXTXI4T3diYW8wVldXZ1dacVdyTm1rc2txUnpMd3I; path=/; domain=.reddit.com;secure;; sameSite=None
//				csv=2; expires=Wed, 30 Dec 2026 16:11:28 GMT; path=/; domain=.reddit.com;secure;; sameSite=None
//				token_v2=eyJhbGciOiJSUzI1NiIsImtpZCI6IlNIQTI1NjpzS3dsMnlsV0VtMjVmcXhwTU40cWY4MXE2OWFFdWFyMnpLMUdhVGxjdWNZIiwidHlwIjoiSldUIn0.eyJzdWIiOiJsb2lkIiwiZXhwIjoxNzY0MTczNDg4LjQ0MjI2NiwiaWF0IjoxNzY0MDg3MDg4LjQ0MjI2NiwianRpIjoiVWVPNFlBekNYVW5Ed2xGLVdOMEdRX09LOXdNNU5nIiwiY2lkIjoiMFItV0FNaHVvby1NeVEiLCJsaWQiOiJ0Ml8yMnB6aG1kd2R3IiwibGNhIjoxNzY0MDg3MDg4NDQxLCJzY3AiOiJlSnhra2RHT3REQUloZC1GYTVfZ2Y1VV9tMDF0Y1lhc0xRYW9rM243RFZvY2s3MDdjRDRwSFA5REtvcUZEQ1pYZ3FuQUJGZ1RyVERCUnVUOW5MbTNnMmlOZTh0WXNabkNCRm13RkRya21MR3NpUVFtZUpJYXl4c21vSUxOeUZ5dXRHTk5MVDBRSnFoY01yZUZIcGMyb2JrYmk1NmRHRlc1ckR5b3NWZmwwdGpHRkxZbnhqY2JxdzJwdUM2bk1rbkxRdmtzWHZUak45VzM5dm16X1NhMEo4T0txdW1CM2hsSkNHNHNmcGltM2Q5VGs1NnRDeGExOTNxUTJ1ZDYzSzU5MWl3ME83ZWY2X2xySXhtWFkyaC1KdnQzMXktaEE0ODhMelBxQUVhczRVY1pkbVFkX2xVSFVMbWdKR01KNHRNSTVNcmwyMzhKdG12VHY4YnRFejk4TS1LbU5feldETlJ6Q2VMUXBfSDFHd0FBX184UTFlVFIiLCJmbG8iOjF9.L4gRHCTQDSeF3zL4pguuyI44UcYwSvI2pYURyEgZSpWcGNSgKCGeiZTYL50QjOTM0cjOlnyYmXoI4b9mOWZpzo1MiTFf8E9rMnhkKj8m4-GdZ32O4OajQw1tSUVrdUtRu-c9wB_LPXQ4rZlRDMxFfRiqROYlT2qC5wNlRNvb7sMtewUf44ljKFL_8Zp3mNVSVq6xQaLQzWBLqleMyGiyxWL28qxhJwKccGdhVIGNs7LRMw8npzTqv6kwZ2yPUelF1xcYV7CBWd81__nnRuI0fvP5AMEIuN0lIfmkpxY8wU92rlQaqm0wpgzI6PIJkFOs4kej1Q3tpSQVC7KeaQF6bQ; expires=Wed, 26 Nov 2025 16:11:28 GMT; path=/; domain=.reddit.com;secure;; sameSite=Lax
//				csrf_token=644fd34569e8d9d7d4137d2a004d22e0; path=/; domain=.reddit.com;secure;; sameSite=Strict
//				_gcl_au=1.1.1536582832.1764087090; expires=Mon, 23 Feb 2026 16:11:30 GMT; path=/; domain=.reddit.com; sameSite=Lax
//				edgebucket=VtOPqhJc25Dnep6q6b; expires=Wed, 30 Dec 2026 16:11:28 GMT; path=/; domain=.reddit.com;secure;; sameSite=Lax
//				loid=0000000022pzhmdwdw.2.1764087088441.Z0FBQUFBQnBKZFV3akJEeU53X016cm1mT3dpVklRT3hnYzNGaFdEWS1GamJfeXBuS2lxWDFoOGVsRzhGQUJyNDI4WWxvT1BzWXJCaXRCTXN5Tnd3WjRxT3k3U3l1aFNsUFdoMk1TVEhPRVNNckg4UGYzTmhBM25ERTlsTWs5TFdMblVUZmMzYzFiTWo; expires=Wed, 30 Dec 2026 16:11:28 GMT; path=/; domain=.reddit.com;secure;; sameSite=None
//

		for (Cookie c : cookies) {
			System.out.println(c.getDomain());
			System.out.println(c.getName());
			System.out.println(c.getPath());
			System.out.println(c.getSameSite());
			System.out.println(c.getValue());
			System.out.println(c.getExpiry());
		}
		
//		www.reddit.com
//		g_state
//		/
//		Lax
//		{"i_l":0,"i_ll":1764088927338,"i_b":"NDXO+wxoW7LjNsrVYVAKUfV49vKtRIGmRGC6yVnvGvI"}
//		Sun May 24 22:12:07 IST 2026
//		.reddit.com
//		session_tracker
//		/
//		None
//		jpfiqkarmdafrecqji.0.1764088927369.Z0FBQUFBQnBKZHhmNXlvQWtrSUFFSlFiU0VoUkF4RnBtTTEzVUlMdC0xWVo0eG1WdzVzYjlSLXZJUmMyakM4Y1ZxRW9aLTczZFFDV2JtQ01SZ1doamdTNXNYbU90MEJUQWZQTXR1aW9lMER3cmJkM2tneUFEVEVNLUVJdjRKR3NvZF9Bd3lpNWR0RHc
//		null
//		.reddit.com
//		csv
//		/
//		None
//		2
//		Wed Dec 30 22:12:05 IST 2026
//		.reddit.com
//		token_v2
//		/
//		Lax
//		eyJhbGciOiJSUzI1NiIsImtpZCI6IlNIQTI1NjpzS3dsMnlsV0VtMjVmcXhwTU40cWY4MXE2OWFFdWFyMnpLMUdhVGxjdWNZIiwidHlwIjoiSldUIn0.eyJzdWIiOiJsb2lkIiwiZXhwIjoxNzY0MTc1MzI1LjI3MzM4OCwiaWF0IjoxNzY0MDg4OTI1LjI3MzM4OCwianRpIjoiNldyb0d5TW1qcjMxSTJRZzNEakhMY3JHNUJCNThRIiwiY2lkIjoiMFItV0FNaHVvby1NeVEiLCJsaWQiOiJ0Ml8yMnExZTZubTE2IiwibGNhIjoxNzY0MDg4OTI1MjczLCJzY3AiOiJlSnhra2RHT3REQUloZC1GYTVfZ2Y1VV9tMDF0Y1lhc0xRYW9rM243RFZvY2s3MDdjRDRwSFA5REtvcUZEQ1pYZ3FuQUJGZ1RyVERCUnVUOW5MbTNnMmlOZTh0WXNabkNCRm13RkRya21MR3NpUVFtZUpJYXl4c21vSUxOeUZ5dXRHTk5MVDBRSnFoY01yZUZIcGMyb2JrYmk1NmRHRlc1ckR5b3NWZmwwdGpHRkxZbnhqY2JxdzJwdUM2bk1rbkxRdmtzWHZUak45VzM5dm16X1NhMEo4T0txdW1CM2hsSkNHNHNmcGltM2Q5VGs1NnRDeGExOTNxUTJ1ZDYzSzU5MWl3ME83ZWY2X2xySXhtWFkyaC1KdnQzMXktaEE0ODhMelBxQUVhczRVY1pkbVFkX2xVSFVMbWdKR01KNHRNSTVNcmwyMzhKdG12VHY4YnRFejk4TS1LbU5feldETlJ6Q2VMUXBfSDFHd0FBX184UTFlVFIiLCJmbG8iOjF9.IyQrIwRoT5O6726H54n94keCCaPmoiCoC70PfeELMwdKjDa4v2Km9A8FD4vRZN61siXLmYiyW45IJf60MdRJurPr0kVSaBfJ9YxwS3SMac9k5qY_46bw0Wt_rfIGWjQUOI4d6JjIm2iuxjH3lgbr7_41dEI_r0aunjKjb-mYA8AfR4GtBdl87bPVCSPYd2roIbpwWjA2rXUMt-zh6qdelVjh1mLWCyuvrCO-9UDO0clgdG9g7pGFJV0yqb2G8PGn_7w-JLUaoiEZu19BIfBKabECVWCxJxR3y9Xkte2hp-yaNvGkljQyEZyxIFww3VkbDzOTaaGTakBNWvAHTAAW-A
//		Wed Nov 26 22:12:05 IST 2025
//		.reddit.com
//		csrf_token
//		/
//		Strict
//		7ea8b9b04b77f2873e8548a7f66c2953
//		null
//		.reddit.com
//		_gcl_au
//		/
//		Lax
//		1.1.1601230178.1764088927
//		Mon Feb 23 22:12:06 IST 2026
//		.reddit.com
//		edgebucket
//		/
//		Lax
//		dRlOjzfm2c01CfaYwV
//		Wed Dec 30 22:12:05 IST 2026
//		.reddit.com
//		loid
//		/
//		None
//		0000000022q1e6nm16.2.1764088925273.Z0FBQUFBQnBKZHhkaU9xeWpQRGdMM2lCOTd0engwSFBienpKTTdpWDB1MmhYMGVjSEVKVTZCMkhLOVpsU1pmXzh5ZUk4MEhTTnFxX3pBRTN0NEM3cHN0THVWcEYzcGVoUkxhRFNSdFZYOEFPS1UwTE5nejlfTXBCM2d5SnQ4QjVmOFRkTWZZbUtfZ1M
//		Wed Dec 30 22:12:05 IST 2026

	
	}
}


