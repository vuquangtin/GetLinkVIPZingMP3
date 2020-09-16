package com.get.link.zingmp3.browser.useragent;

/**
 * 
 * @see http://useragentstring.com/pages/useragentstring.php?name=Chrome
 * @author EMAIL:vuquangtin@gmail.com , tel:01677443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/designpattern">https://github.com/vuquangtin/designpattern</a>
 *
 *
 */
public enum UserAgentEnum {
	/*
	 * Bạn đang sử dụng trình duyệt không được Facebook hỗ trợ, vì vậy, chúng
	 * tôi đã chuyển hướng bạn đến phiên bản đơn giản hơn để mang lại cho bạn
	 * trải nghiệm tốt nhất.
	 */
	CHROME_UBUNTU(
			"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 YaBrowser/17.1.0.2186 Yowser/2.5 Safari/537.36",
			null, OsType.LINUX, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), A126_BROWSER(
			"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; 126BROWSER; .NET CLR 2.0.50727; .NET CLR 3.0.4506.2152; .NET CLR 3.5.30729; .NET4.0C; .NET4.0E)",
			null, OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.UNCOMMON), A126_BROWSER_1(
			"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.2; WOW64; SV1; 126BROWSER; .NET CLR 2.0.50727)",
			null, OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.UNCOMMON), A126_BROWSER_2(
			"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/4.0; 126BROWSER; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0)",
			null, OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.UNCOMMON), A126_BROWSER_3(
			"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; Trident/4.0; 126BROWSER; .NET CLR 2.0.50727; .NET CLR 3.0.4506.2152; .NET CLR 3.5.30729; .NET4.0C; .NET4.0E)",
			null, OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.UNCOMMON), A1337BROWSER_31(
			"Mozilla/5.0 (Windows NT 6.1; rv:2.0.1) Gecko/20100101 1337Browser/3.1",
			"3.1", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.UNCOMMON), A1337BROWSER_V3(
			"Mozilla/5.0 (Windows NT 6.1; rv:2.0.1) Gecko/20100101 1337Browser_V3.1",
			"3.1", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.UNCOMMON), A200PLEASEBOT(
			"Mozilla/5.0 (compatible; 200PleaseBot/1.0; +http://www.200please.com/bot)",
			"1.0", null, HardwareType.SERVER, PopularutyType.AVERAGE), A360SPIDER(
			"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.102 Safari/537.36; 360Spider",
			null, null, HardwareType.SERVER, /* Nosupport */
			PopularutyType.AVERAGE), A3B_ROOMS_WEB_BROWSER(
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.8.1.11) Gecko/20071203 3B/3.11 Firefox/2.0.0.11 3B-Webview",
			null, OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.UNCOMMON), SAFARI_WINDOWS(
			"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.21 (KHTML, like Gecko) Mwendo/1.1.5 Safari/537.21",
			null, OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), SAFARI_MACOS(
			"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/601.7.7 (KHTML, like Gecko) Version/9.1.2 Safari/601.7.7",
			"9.1", OsType.MACOSX, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), SAFARI_MACOS_10_6_8(
			"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/534.59.10 (KHTML, like Gecko) Version/5.1.9 Safari/534.59.10",
			"5.1", OsType.MACOSX, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), SAFARI_IPAD_9(
			"Mozilla/5.0 (iPad; CPU OS 9_3_2 like Mac OS X) AppleWebKit/601.1.46 (KHTML, like Gecko) Version/9.0 Mobile/13F69 Safari/601.1",
			"9", OsType.IPAD, HardwareType.MOBILE, PopularutyType.VERY_COMMON), Chrome_41_0_2228_0(
			"Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36",
			"4.1", OsType.MACOSX, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Chrome_IOS(
			"Mozilla/5.0 (iPhone; CPU iPhone OS 10_3 like Mac OS X) AppleWebKit/602.1.50 (KHTML, like Gecko) CriOS/56.0.2924.75 Mobile/14E5239e Safari/602.1",
			"4.1", OsType.IOS, HardwareType.MOBILE, PopularutyType.VERY_COMMON), MOBILE_SAFARI_FOR_IOS(
			"Mozilla/5.0 (iPhone; CPU iPhone OS 10_3_1 like Mac OS X) AppleWebKit/603.1.30 (KHTML, like Gecko) Version/10.0 Mobile/14E304 Safari/602.1",
			"1.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MOBILE_Android_Browser(
			"Mozilla/5.0 (Linux; U; Android 4.4.2; en-us; SCH-I535 Build/KOT49H) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30",
			"1.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MOBILE_Chrome_Mobile(
			"Mozilla/5.0 (Linux; Android 7.0; SM-G930V Build/NRD90M) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.125 Mobile Safari/537.36",
			"1.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MOBILE_Opera_Mobile_Blink(
			"Mozilla/5.0 (Linux; Android 7.0; SM-A310F Build/NRD90M) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.91 Mobile Safari/537.36 OPR/42.7.2246.114996",
			"1.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MOBILE_Opera_Mobile_Presto(
			"Opera/9.80 (Android 4.1.2; Linux; Opera Mobi/ADR-1305251841) Presto/2.11.355 Version/12.10",
			"1.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MOBILE_Opera_Mini(
			"Opera/9.80 (J2ME/MIDP; Opera Mini/5.1.21214/28.2725; U; ru) Presto/2.8.119 Version/11.10",
			"1.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MOBILE_Opera_Mini_iOS_WebKit(
			"Mozilla/5.0 (iPhone; CPU iPhone OS 7_1_2 like Mac OS X) AppleWebKit/537.51.2 (KHTML, like Gecko) OPiOS/10.2.0.93022 Mobile/11D257 Safari/9537.53",
			"1.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MOBILE_Firefox_for_Android(
			"Mozilla/5.0 (Android 7.0; Mobile; rv:54.0) Gecko/54.0 Firefox/54.0",
			"1.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MOBILE_Firefox_for_iOS(
			"Mozilla/5.0 (iPhone; CPU iPhone OS 10_3_2 like Mac OS X) AppleWebKit/603.2.4 (KHTML, like Gecko) FxiOS/7.5b3349 Mobile/14F89 Safari/603.2.4",
			"1.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MOBILE_UC_Browser(
			"Mozilla/5.0 (Linux; U; Android 7.0; en-US; SM-G935F Build/NRD90M) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 UCBrowser/11.3.8.976 U3/0.8.0 Mobile Safari/534.30\" ",
			"1.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MOBILE_Dolphin(
			"Mozilla/5.0 (Linux; Android 6.0.1; SM-G920V Build/MMB29K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.98 Mobile Safari/537.36",
			"1.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MOBILE_Puffin_for_Android(
			"Mozilla/5.0 (Linux; Android 5.1.1; SM-N750K Build/LMY47X; ko-kr) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 Mobile Safari/537.36 Puffin/6.0.8.15804AP",
			"1.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MOBILE_Puffin_for_iOS(
			"Mozilla/5.0 (Linux; Android 5.1.1; SM-N750K Build/LMY47X; ko-kr) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 Mobile Safari/537.36 Puffin/6.0.8.15804AP",
			"1.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MOBILE_Samsung_Browser(
			"Mozilla/5.0 (Linux; Android 7.0; SAMSUNG SM-G955U Build/NRD90M) AppleWebKit/537.36 (KHTML, like Gecko) SamsungBrowser/5.4 Chrome/51.0.2704.106 Mobile Safari/537.36",
			"1.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MOBILE_Yandex_Browser(
			"Mozilla/5.0 (Linux; Android 6.0; Lenovo K50a40 Build/MRA58K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.137 YaBrowser/17.4.1.352.00 Mobile Safari/537.36",
			"1.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MOBILE_MIUI_Browser(
			"Mozilla/5.0 (Linux; U; Android 7.0; en-us; MI 5 Build/NRD90M) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/53.0.2785.146 Mobile Safari/537.36 XiaoMi/MiuiBrowser/9.0.3",
			"1.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MOBILE_IE_Mobile(
			"Mozilla/5.0 (compatible; MSIE 10.0; Windows Phone 8.0; Trident/6.0; IEMobile/10.0; ARM; Touch; Microsoft; Lumia 950)",
			"1.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MOBILE_Edge_Mobile(
			"Mozilla/5.0 (Windows Phone 10.0; Android 6.0.1; Microsoft; Lumia 950) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Mobile Safari/537.36 Edge/15.14977",
			"1.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MOBILE_BlackBerry_Browser(
			"Mozilla/5.0 (BB10; Kbd) AppleWebKit/537.35+ (KHTML, like Gecko) Version/10.3.3.2205 Mobile Safari/537.35+",
			"1.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MAC_Safari_10_1(
			"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/603.3.8 (KHTML, like Gecko) Version/10.1.2 Safari/603.3.8",
			"10.1", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MAC_Webkit_based_browser(
			"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_4) AppleWebKit/601.5.17 (KHTML, like Gecko)",
			"1.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MAC_Chrome_42(
			"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.90 Safari/537.36",
			"1.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MAC_Yandex_Browser_171(
			"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 YaBrowser/17.1.0.2186 Yowser/2.5 Safari/537.36",
			"17.1", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MAC_Chrome_61(
			"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36",
			"61", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MAC_Firefox_48(
			"Mozilla/5.0 (Macintosh; Intel Mac OS X 10.6; rv:48.0) Gecko/20100101 Firefox/48.0",
			"1.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MAC_MOBILE_Epiphany_3_8(
			"Mozilla/5.0 (Macintosh; ARM Mac OS X) AppleWebKit/538.15 (KHTML, like Gecko) Safari/538.15 Version/6.0 Raspbian/8.0 (1:3.8.2.0-0rpi27rpi1g) Epiphany/3.8.2",
			"3.8", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), MAC_Electron_Application_0_36(
			"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) electron-tutorial/1.0.0 Chrome/47.0.2526.110 Electron/0.36.7 Safari/537.36",
			"0.36", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Thunderbird_45_3(
			"Mozilla/5.0 (X11; Linux x86_64; rv:45.0) Gecko/20100101 Thunderbird/45.3.0",
			"45.3", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Chrome_44(
			"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36",
			"1.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Yandex_Browser_18_4(
			"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 YaBrowser/18.4.1.498.00 Safari/537.36",
			"18.4", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Chrome_63(
			"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.111 Safari/537.36 EdgA/41.0.0.1563",
			"63", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Chrome_68(
			"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3437.0 Safari/537.36",
			"68", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Chrome_99(
			"Mozilla/5.0 (X11 , linux x86_64) Chrome/99.99.99", "99",
			OsType.MOBILE, HardwareType.MOBILE, PopularutyType.VERY_COMMON), Linux_Chromium_69(
			"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/535.11 (KHTML, like Gecko) Ubuntu/11.10 Chromium/69.0.4453.96 Chrome/69.0.4453.96 Safari/537.36",
			"69", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Chromium_100(
			"Mozilla/100.11 (X11; Linux x86_64) AppleWebKit/X.11 (KHTML, like Gecko) Ubuntu/X.11 Chromium/100.11.1453.93 Chrome/100.0.1453.93 Safari/X.11",
			"100", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Chromium_1727(
			"Mozilla/175.0 (X11; Linux x86_64) AppleWebKit/17535.11 (KHTML, like Gecko) Ubuntu/1611.10 Chromium/1727.0.1453.93 Chrome/1727.0.1453.93 Safari/17537.36",
			"1727", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Comodo_Dragon_4_1(
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US) AppleWebKit/532.5 (KHTML, like Gecko) Comodo_Dragon/4.1.1.11 Chrome/4.1.249.1042 Safari/532.5",
			"4.1", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Covario_Spider_4(
			"Covario IDS/4.16 (Sabayon Linux 1.4; da;)", "4", OsType.MOBILE,
			HardwareType.MOBILE, PopularutyType.VERY_COMMON), Linux_cURL_7(
			"curl/7.19.7 (x86_64-unknown-linux-gnu) libcurl/7.19.7 NSS/3.12.6.2 zlib/1.2.3 libidn/1.18 libssh2/1.2.2",
			"7", OsType.MOBILE, HardwareType.MOBILE, PopularutyType.VERY_COMMON), Linux_Dillo_3(
			"Dillo/3.0.4 (SliTaz GNU/Linux)", "3", OsType.MOBILE,
			HardwareType.MOBILE, PopularutyType.VERY_COMMON), Linux_MOBILE_Dooble_1_56c(
			"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/538.1 (KHTML, like Gecko) Dooble/1.56c Safari/538.1",
			" 1.56c", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_MOBILE_Dragon(
			"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/534.34 (KHTML, like Gecko) DragonBrowser/0.0.1.ALPHA Safari/534.34",
			"", OsType.MOBILE, HardwareType.MOBILE, PopularutyType.VERY_COMMON), Linux_Electron_Application_1_8(
			"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Cypress/2.1.0 Chrome/59.0.3071.115 Electron/1.8.2 Safari/537.36",
			"1.8", OsType.Browser_In_App_Browser, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Electron_Application_2_0(
			"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) tv-electron/1.0.0 Chrome/61.0.3163.100 Electron/2.0.0-beta.3 Safari/537.36",
			"2.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_ELinks0_13(
			"ELinks/0.13.GIT (textmode; Linux 3.16.0-4-amd64 x86_64; 122x32-2)",
			"0.13", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Epiphany3_8(
			"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.32 (KHTML, like Gecko) Chromium/25.0.1349.2 Chrome/25.0.1349.2 Safari/537.32 Debian/unstable (3.8.2-3) Epiphany/3.8.2",
			"3.8", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Fennec_31(
			"Mozilla/5.0 (Wayland; Linux i686; rv:31.0) Gecko/20100101 Fennec/31.0",
			"31", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Firefox_65(
			"Mozilla/5.0 (X11; Linux i586; rv:31.0) Gecko/20100101 Firefox/65.0",
			"65", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Firefox_240(
			"Mozilla/5.0 (X11; Linux i686; rv:24.0) Gecko/20100101 Firefox/240.hotmail.com",
			"240", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Iceweasel_42(
			"Mozilla/5.0 (X11; Linux x86_64; rv:42.0) Gecko/20100101 Firefox/42.0 Iceweasel/42.0",
			"42", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Internet_Explorer_11(
			"Mozilla/5.0 (X11; Linux x86_64; Trident/7.0; rv:11.0) like Gecko",
			"11", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Internet_TV_Browser_2_2(
			"Opera/9.80 (Linux mips; U; InettvBrowser/2.2 (00014A;SonyDTV115;0002;0100) KDL22EX553; CC/UKR; ru) Presto/2.10.250 Version/11.60",
			"2.2", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Java_Runtime_Environment_1_8(
			"yacybot (/global; amd64 Linux 4.4.0-71-generic; java 1.8.0_121; Europe/en) http://yacy.net/bot.html",
			"1.8", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Java_Runtime_Environment_90(
			"yacybot (/global; amd64 Linux 4.10.0-38-generic; java 9-internal; Europe/pl) http://yacy.net/bot.html",
			"9.0", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_MOBILE_Konqueror_4_9(
			"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/534.34 (KHTML, like Gecko) konqueror/4.9.4 Safari/534.34",
			"4.9", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Light_50(
			"Mozilla/5.0 (X11; Fedora; Linux x86_64; rv:50.0) Gecko/20100101 Firefox/50.0 Lightning/5.1",
			"50", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Links_2_8(
			"Links (2.8; Linux 3.12-1-686-pae i686; GNU C 4.8.2; fb)", "2.8",
			OsType.MOBILE, HardwareType.MOBILE, PopularutyType.VERY_COMMON), Linux_MOBILE_Maxthon_9(
			"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/533.1 (KHTML, like Gecko) Maxthon/9.0.8.2 Safari/533.1",
			"9", OsType.MOBILE, HardwareType.MOBILE, PopularutyType.VERY_COMMON), Linux_Midori_11(
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US;) Gecko/23210830 midori/11.0",
			"11", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Minefield_4(
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:2.0a1pre) Gecko/2008060602 Minefield/4.0a1pre",
			"", OsType.MOBILE, HardwareType.MOBILE, PopularutyType.VERY_COMMON), Linux_Mosaic_27b6(
			"NCSA_Mosaic/2.7b6 (X11;Linux 3.17.7-200.fc20.x86_64 x86_64) libwww/2.12 modified",
			"2.7b6", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Naenara_3(
			"Mozilla/5.0 (X11; U; Linux i686; ko-KP; rv:1.9.1b4) Gecko/20130508 Fedora/1.9.1-2.5.rs3.0 NaenaraBrowser/3.5b4",
			"", OsType.MOBILE, HardwareType.MOBILE, PopularutyType.VERY_COMMON), Linux_MOBILE_NetCast(
			"Mozilla/5.0 (DirectFB; Linux i686) AppleWebKit/534.26+ (KHTML, like Gecko) Version/5.0 Safari/534.26+ LG Browser/5.00.00(+ TV set capa; (+ TV set capa; sw version, model name ; sw version; hw version); LG NetCast.TV-2013",
			"", OsType.MOBILE, HardwareType.MOBILE, PopularutyType.VERY_COMMON), Linux_MOBILE_NetCast_Large_Screen_TV(
			"Mozilla/5.0 (Linux; U) NetCast AppleWebKit/537.31 (KHTML, like Gecko) Safari/537.31 SmartTV/7.0",
			"", OsType.MOBILE, HardwareType.MOBILE, PopularutyType.VERY_COMMON), Linux_MOBILE_NetFront_3_4(
			"Mozilla/5.0 (Linux) AppleWebKit/533.3 (KHTML, like Gecko) WebkitBrowser/1.4 Safari/533.3 NetFront/3.4 (Custom3.04.1101.01201.)",
			"3.4", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_Netscape_Navigator_5(
			"Mozilla/5.0 (X11; Linux x86_64; rv:49.0) Gecko/20100101", "5",
			OsType.MOBILE, HardwareType.MOBILE, PopularutyType.VERY_COMMON), Linux_NetSurf_3_8(
			"NetSurf/3.8 (Linux)", "", OsType.MOBILE, HardwareType.MOBILE,
			PopularutyType.VERY_COMMON), Linux_MOBILE_NokiaBrowser85(
			"Mozilla/5.0 (Maemo; Linux; Jolla; Sailfish; Mobile) AppleWebKit/534.13 (KHTML, like Gecko) NokiaBrowser/8.5.0 Mobile Safari/534.13",
			"", OsType.MOBILE, HardwareType.MOBILE, PopularutyType.VERY_COMMON), Linux_Opera_89_9(
			"Mozilla/5.0 (X11; U; Linux i686; rv:212.7) (KHTML, like Gecko) OPR/89.9 Trident/212.7;",
			"", OsType.MOBILE, HardwareType.MOBILE, PopularutyType.VERY_COMMON), Linux_MOBILE_OperaMini77(
			"Opera/9.80 (Tizen; Opera Mini/7.7.17/65.213; U; en) Presto/2.12.423 Version/12.16",
			"", OsType.MOBILE, HardwareType.MOBILE, PopularutyType.VERY_COMMON), Linux_PaleMoon28(
			"Mozilla/5.0 (X11; Linux x86_64; rv:52.9) Gecko/20100101 Goanna/4.1 Firefox/52.9 PaleMoon/28.0.0a1",
			"", OsType.MOBILE, HardwareType.MOBILE, PopularutyType.VERY_COMMON), Linux_MOBILE_QTbasedbrowser(
			"Mozilla/5.0 (QtEmbedded; N; Linux) AppleWebKit/534.34 (KHTML, like Gecko) Qt/4.8.0 Safari/534.34",
			"", OsType.MOBILE, HardwareType.MOBILE, PopularutyType.VERY_COMMON), Linux_QupZilla22(
			"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) QupZilla/2.2.5 Chrome/61.0.3163.140 Safari/537.36",
			"", OsType.MOBILE, HardwareType.MOBILE, PopularutyType.VERY_COMMON), Linux_MOBILE_Rekonq24(
			"Mozilla/5.0 (X11; Linux i686) AppleWebKit/537.21 (KHTML, like Gecko) rekonq/2.4.2 Safari/537.21",
			"", OsType.MOBILE, HardwareType.MOBILE, PopularutyType.VERY_COMMON), Linux_MOBILE_RockMelt98(
			"Mozilla/5.0 (Linux; U; Rockmelt/9.8; id-en; LG-P500Build/FRFgl) AppleWebkit/533.0 (KHTML, likeGecko) Version/4.0 presto/2.8.89 mobilesafari/533.1 UNTRUSTED/1.0",
			"", OsType.MOBILE, HardwareType.MOBILE, PopularutyType.VERY_COMMON), Linux_MOBILE_Safari3(
			"Mozilla/5.0 (X11; 78; CentOS; US-en) AppleWebKit/527+ (KHTML, like Gecko) Bolt/0.862 Version/3.0 Safari/523.15",
			"", OsType.MOBILE, HardwareType.MOBILE, PopularutyType.VERY_COMMON), Linux_SamsungBrowser6(
			"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) SamsungBrowser/6.0 Chrome/56.0.2924.87 Safari/537.36",
			"", OsType.MOBILE, HardwareType.MOBILE, PopularutyType.VERY_COMMON), Windows_YandexBrowser186(
			"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.158 YaBrowser/18.6.0.1399 (beta) Yowser/2.5 Safari/537.36",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_YandexBrowser20(
			"Mozilla/5.0 (Windows NT 15.0; Win64; x64) AppleWebKit/637.36 (KHTML, like Gecko) Chrome/70.0.1599.12785 YaBrowser/20.12.1599.12785 Safari/637.36 HasBrowser/5.0",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_Wyzo36(
			"Mozilla/5.0 (Windows; U; Windows NT 6.1; en-US; rv:1.9.2.4) Gecko/20100520 FireDownload/2.0.1 Firefox/3.6.4 Wyzo/3.6.4.1 FireTorrent/2.0.1",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_Wget119(
			"Wget/1.19.4 (mingw32)", "", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_WeChat65(
			"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.95 Safari/537.36 MicroMessenger/6.5.2.501 NetType/WIFI WindowsWechat QBCore/3.43.691.400 QQBrowser/9.0.2524.400",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_WebViewbasedbrowser10(
			"Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.2; Win64; x64; Trident/6.0; .NET4.0C; .NET4.0E; .NET CLR 2.0.50727; .NET CLR 3.0.30729; .NET CLR 3.5.30729; Tablet PC 2.0; HRTS; H9P; Zoom 3.6.0; WebView/1.0)",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_WebViewbasedbrowser3(
			"Mozilla/5.0 (Windows NT 10.0; Win64; x64; WebView/3.0)", "",
			OsType.WINDOWS, HardwareType.COMPUTER, PopularutyType.VERY_COMMON), Windows_WeblinkPreview10(
			"Mozilla/5.0 (Windows NT 6.2.8250.0) AppleWebKit/533.3 (KHTML, like Gecko) YRCWeblinkPreview/1.0",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_Weblink15(
			"Mozilla/5.0 (Windows NT 6.2.9200.0;WOW64) AppleWebKit/537.15 (KHTML, like Gecko) Chrome/41.0 YRCWeblink/1.5.0 Safari/537.15",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_Webkitbasedbrowser(
			"Mozilla/5.0 (Windows NT 6.2; Win64; x64) AppleWebKit/602.1 (KHTML, like Gecko) Otter/0.9.99",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_Waterfox56(
			"Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:56.0) Gecko/20100101 Firefox/56.0.4 Waterfox/56.0.4",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_Vivaldi197(
			"Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.183 Safari/537.36 Vivaldi/1.97.1170.3",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_ValveSteamGameOverlay(
			"Mozilla/5.0 (Windows; U; Windows NT 6.2; en-US; Valve Steam GameOverlay/1443743337; ) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_MOBILE_UC_Browser95(
			"Nokia311/5.0 (03.81) Profile/MIDP-2.1 Configuration/CLDC-1.1 Mozilla/5.0 (Windows; U; Windows NT 6.0; id; Desktop) AppleWebKit/534.13 (KHTML, like Gecko) UCBrowser/9.5.0.449 UNTRUSTED/1.0",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_MOBILE_UC_Browser94(
			"Nokia302/5.0 (14.78) Profile/MIDP-2.1 Configuration/CLDC-1.1 Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; Desktop) AppleWebKit/534.13 (KHTML, like Gecko) UCBrowser/9.4.1.377",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_MOBILE_TheWorldBrowser(
			"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; TheWorld)",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_MOBILE_TencentTraveler4(
			"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; QQDownload 627; TencentTraveler 4.0; Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1) )",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_SRWareIron5(
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US) AppleWebKit/533.1 (KHTML, like Gecko) Iron/5.0.326.0 Chrome/5.0.326.0 Safari/533.1",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_SRWareIron44(
			"Mozilla/5.0 (Windows NT 6.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2350.0 Iron/44.0.2350.0 Safari/537.36",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_Songbird61(
			"Mozilla/5.0 (Windows; U; Windows NT 6.2; en-US; rv:1.9.2.3) Gecko/20101201 Philips-Songbird/6.1.2265 Songbird/1.11.1 (20120404152809)",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_SogouExplorer2X(
			"Mozilla/4.0 (compatible; MSIE 7.0; compatible; MSIE 7.0; Windows NT 5.1; Trident/4.0; SE 2.X MetaSr 1.0; SE 2.X MetaSr 1.0; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; InfoPath.3; .NET4.0C; .NET4.0E; .NET CLR 2.0.50727; SE 2.X MetaSr 1.0)",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_MOBILE_SlimBrowser7(
			"Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.3; Trident/4.0; SlimBrowser/7.00)",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_Sleipnir61(
			"Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.111 Safari/537.36 Sleipnir/6.1.5",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_SecondLife58(
			"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) (Chrome/58 (SecondLife/C64 Basic V2)) Chrome/49.0.2623.110 Safari/537.36",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_InternetExplorer11(
			"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.2; Win64; x64; Trident/7.0; .NET4.0E; .NET4.0C; Tablet PC 2.0; .NET CLR 3.5.30729; .NET CLR 2.0.50727; .NET CLR 3.0.30729; LCJB; ms-office)",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_Safari10(
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en) AppleWebKit/526.9 (KHTML, like Gecko) Version/10.0 Safari/526.8",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_QQBrowser10(
			"Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.26 Safari/537.36 Core/1.63.5383.400 QQBrowser/10.0.1313.400",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_ProEngineerWildfire(
			"Mozilla/5.0 (Windows NT 6.1; Win64; x64; Trident/7.0; MDDRJS; rv:11.0) like Gecko; Wildfire NoTrail; ProE-Datecode:3302016010)",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_PaleMoon273(
			"Mozilla/5.0 (Windows NT 6.3; rv:45.9) Gecko/20100101 Goanna/3.2 Firefox/45.9 PaleMoon/27.3.0",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_MOBILE_OperaMini9(
			"Opera/9.80 (Windows Phone; Opera Mini/9.0.0/37.7751; U; en) Presto/2.12.423 Version/12.16",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Windows_Opera51(
			"Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36 OPR/51.0.2830.55 (Edition Campaign 34)",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), ABrowse06(
			"Mozilla/5.0 (compatible; U; ABrowse 0.6; Syllable) AppleWebKit/420+ (KHTML, like Gecko)",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), MOBILE_Acoo_Browser(
			"Mozilla/5.0 (compatible; MSIE 8.0; Windows NT 6.0; Trident/4.0; Acoo Browser 1.98.744; .NET CLR 3.5.30729)",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), MOBILE_AmericaOnlineBrowser(
			"Mozilla/4.0 (compatible; MSIE 7.0; America Online Browser 1.1; Windows NT 5.1; (R1 1.5); .NET CLR 2.0.50727; InfoPath.1)",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), AmigaVoyager32(
			"AmigaVoyager/3.2 (AmigaOS/MC680x0)", "", OsType.WINDOWS,
			HardwareType.COMPUTER, PopularutyType.VERY_COMMON), AOL97(
			"Mozilla/4.0 (compatible; MSIE 8.0; AOL 9.7; AOLBuild 4343.27; Windows NT 5.1; Trident/4.0; .NET CLR 2.0.50727; .NET CLR 3.0.4506.2152; .NET CLR 3.5.30729)",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), MOBILE_Arora(
			"Mozilla/5.0 (X11; U; UNICOS lcLinux; en-US) Gecko/20140730 (KHTML, like Gecko, Safari/419.3) Arora/0.8.0",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), MOBILE_AvantBrowser(
			"Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; Trident/4.0; Avant Browser; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0)",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Beonex(
			"Mozilla/5.0 (Windows; U; WinNT; en; rv:1.0.2) Gecko/20030311 Beonex/0.8.2-stable",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), BonEcho(
			"Mozilla/5.0 (X11; U; Linux i686; nl; rv:1.8.1b2) Gecko/20060821 BonEcho/2.0b2 (Debian-1.99+2.0b2+dfsg-1)",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), BrowzarBrowzar(
			"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; Trident/4.0; .NET4.0C; .NET4.0E; .NET CLR 2.0.50727; .NET CLR 1.1.4322; .NET CLR 3.0.4506.2152; .NET CLR 3.5.30729; Browzar)",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Camino(
			"Mozilla/5.0 (Macintosh; U; PPC Mac OS X Mach-O; XH; rv:8.578.498) fr, Gecko/20121021 Camino/8.723+ (Firefox compatible)",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), MOBILE_Cheshire(
			"Mozilla/5.0 (Macintosh; U; PPC Mac OS X; en) AppleWebKit/419 (KHTML, like Gecko, Safari/419.3) Cheshire/1.0.ALPHA",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Classilla(
			"Mozilla/5.0 (Macintosh; U; PPC; en-US; mimic; rv:9.3.0) Gecko/20120117 Firefox/3.6.25 Classilla/CFM",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), CometBird(
			"Mozilla/5.0 (Windows; U; Windows NT 6.1; en-US; rv:1.9.2.3) Gecko/20100409 Firefox/3.6.3 CometBird/3.6.3",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Comodo_Dragon(
			"Mozilla/5.0 (Windows NT 6.2) AppleWebKit/535.7 (KHTML, like Gecko) Comodo_Dragon/16.1.1.0 Chrome/16.0.912.63 Safari/535.7",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Conkeror(
			"Mozilla/5.0 (X11; Linux x86_64; rv:10.0.11) Gecko/20100101 conkeror/1.0pre (Debian-1.0~~pre+git120527-1)",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), CrazyBrowser(
			"Mozilla/5.0 (compatible; MSIE 8.0; Windows NT 6.0; SV1; Crazy Browser 9.0.04)",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Cyberdog(
			"Cyberdog/2.0 (Macintosh; PPC)", "", OsType.WINDOWS,
			HardwareType.COMPUTER, PopularutyType.VERY_COMMON), DeepnetExplorer(
			"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; WOW64; Trident/4.0; Deepnet Explorer 1.5.3; Smart 2x2; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E)",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), DeskBrowse(
			"Mozilla/5.0 (Macintosh; U; PPC Mac OS X; pl-pl) AppleWebKit/312.8 (KHTML, like Gecko, Safari) DeskBrowse/1.0",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Edge(
			"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 Safari/537.36 Edge/12.246",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Elinks(
			"ELinks/0.9.3 (textmode; Linux 2.6.9-kanotix-8 i686; 127x41)", "",
			OsType.WINDOWS, HardwareType.COMPUTER, PopularutyType.VERY_COMMON), EnigmaFox(
			"Mozilla/5.0 (Windows; U; Windows NT 6.0; en-GB; rv:1.9.0.13) Gecko/2009073022 EnigmaFox/3.0.13",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Epiphany(
			"Mozilla/5.0 (X11; U; Linux x86_64; it-it) AppleWebKit/534.26+ (KHTML, like Gecko) Ubuntu/11.04 Epiphany/2.30.6",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Escape(
			"Mozilla/4.0 (compatible; MSIE 5.23; Macintosh; PPC) Escape 5.1.8",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Firebird(
			"Mozilla/5.0 (Windows; U; Windows NT 6.1; x64; fr; rv:1.9.2.13) Gecko/20101203 Firebird/3.6.13",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON), Firefox(
			"Mozilla/5.0 (Windows NT 6.1; WOW64; rv:40.0) Gecko/20100101 Firefox/40.1",
			"", OsType.WINDOWS, HardwareType.COMPUTER,
			PopularutyType.VERY_COMMON),
	// Windows_("","",OsType.WINDOWS, HardwareType.COMPUTER,
	// PopularutyType.VERY_COMMON),
	// Windows_("","",OsType.WINDOWS, HardwareType.COMPUTER,
	// PopularutyType.VERY_COMMON),
	;

	private String userAgent;
	private OsType os;
	private HardwareType hardwareType;
	private PopularutyType popularutyType;

	UserAgentEnum(String userAgent, String version, OsType os,
			HardwareType hardwareType, PopularutyType popularutyType) {
		this.setUserAgent(userAgent);
		this.setOs(os);
		this.setHardwareType(hardwareType);
		this.setPopularutyType(popularutyType);
	}

	/**
	 * @return the userAgent
	 */
	public String getUserAgent() {
		return userAgent;
	}

	/**
	 * @param userAgent
	 *            the userAgent to set
	 */
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	/**
	 * @return the os
	 */
	public OsType getOs() {
		return os;
	}

	/**
	 * @param os
	 *            the os to set
	 */
	public void setOs(OsType os) {
		this.os = os;
	}

	/**
	 * @return the hardwareType
	 */
	public HardwareType getHardwareType() {
		return hardwareType;
	}

	/**
	 * @param hardwareType
	 *            the hardwareType to set
	 */
	public void setHardwareType(HardwareType hardwareType) {
		this.hardwareType = hardwareType;
	}

	/**
	 * @return the popularutyType
	 */
	public PopularutyType getPopularutyType() {
		return popularutyType;
	}

	/**
	 * @param popularutyType
	 *            the popularutyType to set
	 */
	public void setPopularutyType(PopularutyType popularutyType) {
		this.popularutyType = popularutyType;
	}
}
