package io.gatling.demo

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class ShopSimulation extends Simulation {

  private val httpProtocol = http
    .baseUrl("https://fonts.googleapis.com")
    .inferHtmlResources(AllowList(), DenyList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""))

  private val uri09 = "https://www.emag.hu"

  val scn = scenario("Scenario Name") // A scenario is a chain of requests and pauses
    .exec(
      http("request_0")
        .get(uri09 + "/homepage"),
    )
    .exec(
      http("request_19")
        .get(uri09 + "/profile_async/rPekvNX.DvwNdBINfCwgSS9UU1gvblhNcEwyWm91Z3NZSzVtTUVxSmVtdU96dlpCdFdyT1R6R0NhL2pHYjJ6VDJnQnNFRERMeDB2c0hpQXY2QkpXSnY1ZkxOMFg0Z0ZxSmJBcVNMc0luZ1NkQzNqSVc4ZHQveGovajhld3htdS82S3Rwd2NDc1FpSlRucHZIRTNKLzhWaUIyNUZMckJJc3pVRGVFckNsVVpia1lKMDBKbE9aMituVEZWbG43YnpqSk52RE9uMjRMOWZxOGdETw__/o/?r=1652625974&c=40&sd=0"),
    )
    .exec(
      http("request_21")
        .get(uri09 + "/favorites/lists/type/emag/product_ids?source=front"),
    )
    .exec(
      http("request_61")
        .get(uri09 + "/matching-notifications"),
    )
    .exec(
      http("request_183")
        .get(uri09 + "/shop/apple?ref=hp_menu_quick-nav_7_3&type=link"),
    )
    .exec(
      http("request_198")
        .get(uri09 + "/profile_async/2MBGn4yIEkctxbauScXt2kd0b3Z5RmZsOFVjM3BYejR2MnFXSW9GL1pyRDE3bmMvR3RFRU1mSU5JRCtiMy91QmNSZ2Zwd3lyN3F0VVZMNkVSVkh6NVhZZXFETlRKN0QwYmQxdGVUWkk1VHJzMFhRNnpIYmttckRVVlF2cVdGaHE1WXR6d0V6dkx2Q1lhTWQ3MnhCQkNOUmxYVTVTSFIvbUhUR0lYWXlNUXE4K1NzY1VnSzJxQkpQWWlvbHVBa3VNSVVBVGNLYzRQaUI5WW1NMlVQWVU5cHh3WTFQTThmRFI2NUdoWXc9PQ__/o/?r=1652626073&c=12&sd=0"),
    )
    .exec(
      http("request_205")
        .get(uri09 + "/favorites/lists/type/emag/product_ids?source=front"),
    )
    .exec(
      http("request_241")
        .get(uri09 + "/matching-notifications"),
    )
    .exec(
      http("request_277")
        .get(uri09 + "/mobiltelefonok/brand/apple/vendor/emag/c?ref=shop_1382_column_banner_16203_1"),
    )
    .exec(
      http("request_330")
        .get(uri09 + "/profile_async/sm4tRfxGakoYxLeQT3oWN2NtYnlHZFpraWVMYU9OMWlzcU1PMUZQSVdUdEk0R2lkeG82VkpKQ0l6czUrZElHNkhPUmVaSmk3TjRmQXAzblJTdDhVYVNCYUNkakgxUUhrWTliM2dqb01EVWFEaC9QR01mNys4NnhlY0h1ZTNyTDZ1ZEczdlQxNEdOd0JtNVJGWkx2cmlpdHNFMW5uTFp4R1pjZFd5UmQ4bWx3SnJ5VnJvSjExdkEyL0xFNDNrWFZKVjBUWnBlNEIvcTh5WmJ5OFU5SHRmUnJLdFFiWUU1a1dqWllkMDdabVFEVGE0bHNRZjdzK3NIT082ZEU9/o/?r=1652626079&c=27&sd=0"),
    )
    .exec(
      http("request_331")
        .get(uri09 + "/favorites/lists/type/emag/product_ids?source=front"),
    )
    .exec(
      http("request_340")
        .get(uri09 + "/matching-notifications"),
    )
    .exec(
      http("request_412")
        .get(uri09 + "/apple-iphone-13-pro-max-mobiltelefon-kartyafuggetlen-128gb-5g-grafit-mll63hu-a/pd/DSH96PMBM/"),
    )
    .exec(
      http("request_463")
        .get(uri09 + "/profile_async/NHfxoAUrJzJmcDTD.4aw4jZoZHR4OWJrR0ZNWEdNNVJiRVNtTHdLUlZaaVRDVVh2N1JUVzNpK3pvUTB3aDZKaXNVSmQ0T2tQTklvRlJuQXFFemlYNDJSSlo4NHNhZHIxa01YMGdhS1RjV3hvWk9qclRaTHdoRWNUMGdNMFJrUC9uSStYd0J0dFNzemtSeVNwSUh6b3padWZ0OHZCRFE4VWRvTXN1M09yWUI2NXVnRThlOFFFZVFxa3M3aFpCMm9EYU1BSnVpUXFPTEo3QkJDT1NROGpPei92TlFnVVd1aGY4bGUzblhmVGp3NlFFenFVUGZnd2p4allZSnMwdGdpRk9KRXNnR3plbVJmNnFhamFvdnFySFBCNFhxZTMxaDBCdlpUQmJmdDZvQWlDSUZWRzlCenRQTVU1OTNVUE9zWkpMY0l6S3pNYkxaellLWVRl/o/?r=1652620119&c=13&sd=0"),
    )
    .exec(
      http("request_465")
        .get(uri09 + "/save-client-navigation-history/DSH96PMBM?json_response=1"),
    )
    .exec(
      http("request_466")
        .get(uri09 + "/favorites/lists/type/emag/product_ids?source=front"),
    )
    .exec(
      http("request_477")
        .get(uri09 + "/matching-notifications"),
    )
    .exec(
      http("request_501")
        .get(uri09 + "/product-feedback/apple-iphone-13-pro-max-mobiltelefon-kartyafuggetlen-128gb-5g-grafit-mll63hu-a/pd/DSH96PMBM/reviews/list?source_id=7&filters%5Bhas_picture%5D=1&page%5Boffset%5D=0&page%5Blimit%5D=10&sort%5Bcreated%5D=desc&display_mode=pictures"),
    )
    .exec(
      http("request_574")
        .get(uri09 + "/mobiltelefonok/brand/apple/vendor/emag/c?ref=shop_1382_column_banner_16203_1"),
    )

    .exec(
      http("request_596")
        .get(uri09 + "/favorites/lists/type/emag/product_ids?source=front"),
    )
    .exec(
      http("request_604")
        .get(uri09 + "/matching-notifications"),
    )
    .exec(
      http("request_687")
        .get(uri09 + "/apple-iphone-se-2022-mobiltelefon-kartyafuggetlen-64gb-5g-product-red-mmxh3hu-a/pd/DXTV6JMBM/"),
    )
    .exec(
      http("request_747")
        .get(uri09 + "/save-client-navigation-history/DXTV6JMBM?json_response=1"),
    )
    .exec(
      http("request_750")
        .get(uri09 + "/profile_async/sFFKeW9Hgoz9NdSVtnlaxXpoQ0NaK3dadjY1NFZ1QXB2QWVYeFYza0wvS1N5T2Q5blo2TGdwVno2dGZTdXFpMXRLMlg3M0g3RW9GU2MwMk1taTFZK0lpcTBKVWEwV2FtSFk4cmJOSmJXY3FCaFlycDhQVUdiSGxHMzYwL2dLMTUrRU1lVXdnK3lXNkVlejdqd2tnN2pFT0RNbDRFZ2NwdHNweS9SaXpOSzFiRWpkNTBiU2JVV01nUVppeDc2ckRSQmREa0hJYUZ2ZXJ0OFFXaEFRYjFBc096TkRHZktVSGNLQkhHNUJGcTVVbVliaDdzelMwQWYxczJSWWFqbFZucXYrNDBnSnhtL0x4ZVZ6NTM5MUQ4TUVlcktEY0JseWJSdjl5eitDdStzS2NVTkEvMVU0ZzFuaS9QY3U0PQ__/o/?r=1652621260&c=-5&sd=0"),
    )
    .exec(
      http("request_751")
        .get(uri09 + "/favorites/lists/type/emag/product_ids?source=front"),
    )
    .exec(
      http("request_757")
        .get(uri09 + "/multiple-offers/DXTV6JMBM?source_id=7&fields%5Bflags%5D=0&fields%5Bwarranties%5D=0&fields%5Boffer%5D%5Bvendor%5D%5Brating%5D=1&fields%5Boffer%5D%5Bvendor%5D%5Bmin_rating%5D=4&fields%5BshippingCost%5D=1&locality=6969&page%5Blimit%5D=1&page%5Boffset%5D=0"),
    )
    .exec(
      http("request_763")
        .get(uri09 + "/multiple-offers/DXTV6JMBM?source_id=7&fields%5Bflags%5D=0&fields%5Bwarranties%5D=0&fields%5Boffer%5D%5Bvendor%5D%5Brating%5D=1&fields%5Boffer%5D%5Bvendor%5D%5Bmin_rating%5D=4&fields%5BshippingCost%5D=1&locality=6969&page%5Blimit%5D=1&page%5Boffset%5D=0"),
    )
    .exec(
      http("request_772")
        .get(uri09 + "/delivery-estimate?source_id=7&has_tax=1&return_recommended_pickup=0&products%5B0%5D%5Boffer_id%5D=91402233&products%5B0%5D%5Bquantity%5D=1&products%5B0%5D%5BfullPrice%5D=194990&products%5B0%5D%5Bprice%5D=194990&products%5B0%5D%5Bbuyback%5D=false&source=product&request_no=1&courier_types%5Bdefault%5D=best_time&courier_types%5Bscheduled_delivery%5D=all_times&courier_types%5Bsame_day%5D=all_times&localities%5B%5D=6969&delivery_points%5B%5D=c61786bd-6506-11ea-91aa-fa163e4fe5b7&insured_value=194990&total_value=194990&is_estimate_active=1"),
    )
    .exec(
        http("request_277")
        .get(uri09 + "/mobiltelefonok/brand/apple/vendor/emag/c?ref=shop_1382_column_banner_16203_1"),
    )
    .exec(
      http("request_829")
        .get(uri09 + "/profile_async/sm4tRfxGakoYxLeQT3oWN2NtYnlHZFpraWVMYU9OMWlzcU1PMUZQSVdUdEk0R2lkeG82VkpKQ0l6czUrZElHNkhPUmVaSmk3TjRmQXAzblJTdDhVYVNCYUNkakgxUUhrWTliM2dqb01EVWFEaC9QR01mNys4NnhlY0h1ZTNyTDZ1ZEczdlQxNEdOd0JtNVJGWkx2cmlpdHNFMW5uTFp4R1pjZFd5UmQ4bWx3SnJ5VnJvSjExdkEyL0xFNDNrWFZKVjBUWnBlNEIvcTh5WmJ5OFU5SHRmUnJLdFFiWUU1a1dqWllkMDdabVFEVGE0bHNRZjdzK3NIT082ZEU9/o/?r=1652626079&c=27&sd=0"),
    )
    .exec(
      http("request_832")
        .get(uri09 + "/favorites/lists/type/emag/product_ids?source=front"),
    )
    .exec(
      http("request_841")
        .get(uri09 + "/matching-notifications"),
    )
    .exec(
      http("request_915")
        .get(uri09 + "/apple-iphone-13-pro-mobiltelefon-kartyafuggetlen-256gb-5g-alpesi-zold-mne33hu-a/pd/D7TV6JMBM/"),
    )
    .exec(
      http("request_956")
        .get(uri09 + "/profile_async/skP0AR16L3lyH4TaH-b0cTNCSXdQdFVBd0s4dmRZZ05xUlRLZ1BObzdCcmNreGFRYlFOcTZ1Sm5HdG1veFQzeXFSS2pEaWNkWlZDSkFnOTVLS2xRRHpBYm02M0NKTTJ5dEt2elVvMERzYVlaUkU0RFhvekJPM2NrVFJ6REl6bGx5REx3QmRMR0RPRzh6NC8xLzk5UlBhQmJ4bUYvQ214RmN4ZGt6eTMyVFZ4aGJSSlM1S0ZjTTdxVk5tZ1hWRjdBSzlabDNBY0wzUEt3ZWw0dXlPRERZb09kYzJXNk0wa1RNS2EzSXdheWxYamZicVQ4NG9NbmRPdnNUOENDVHY2ckJqRCtKZmVTOGtSMDBtNVFBNG1iZHAvazhVR1ZNNzdlc3ZFMzNtbmJNOWtVMGkrWThsT1ZsaDQ0eTdZYk1PY2VrVzlrbFdCUzA3ekE2UDZS/o/?r=1652626112&c=48&sd=0"),
    )
    .exec(
      http("request_961")
        .get(uri09 + "/save-client-navigation-history/D7TV6JMBM?json_response=1"),
    )
    .exec(
      http("request_965")
        .get(uri09 + "/favorites/lists/type/emag/product_ids?source=front"),
    )
    .exec(
      http("request_968")
        .get(uri09 + "/profile_async/skP0AR16L3lyH4TaH-b0cTNCSXdQdFVBd0s4dmRZZ05xUlRLZ1BObzdCcmNreGFRYlFOcTZ1Sm5HdG1veFQzeXFSS2pEaWNkWlZDSkFnOTVLS2xRRHpBYm02M0NKTTJ5dEt2elVvMERzYVlaUkU0RFhvekJPM2NrVFJ6REl6bGx5REx3QmRMR0RPRzh6NC8xLzk5UlBhQmJ4bUYvQ214RmN4ZGt6eTMyVFZ4aGJSSlM1S0ZjTTdxVk5tZ1hWRjdBSzlabDNBY0wzUEt3ZWw0dXlPRERZb09kYzJXNk0wa1RNS2EzSXdheWxYamZicVQ4NG9NbmRPdnNUOENDVHY2ckJqRCtKZmVTOGtSMDBtNVFBNG1iZHAvazhVR1ZNNzdlc3ZFMzNtbmJNOWtVMGkrWThsT1ZsaDQ0eTdZYk1PY2VrVzlrbFdCUzA3ekE2UDZS/o/?r=1652626112&c=48&sd=0"),
    )
    .exec(
      http("request_980")
        .get(uri09 + "/delivery-estimate?source_id=7&has_tax=1&return_recommended_pickup=0&products%5B0%5D%5Boffer_id%5D=91402224&products%5B0%5D%5Bquantity%5D=1&products%5B0%5D%5BfullPrice%5D=464990&products%5B0%5D%5Bprice%5D=464990&products%5B0%5D%5Bbuyback%5D=false&source=product&request_no=1&courier_types%5Bdefault%5D=best_time&courier_types%5Bscheduled_delivery%5D=all_times&courier_types%5Bsame_day%5D=all_times&localities%5B%5D=6969&delivery_points%5B%5D=c61786bd-6506-11ea-91aa-fa163e4fe5b7&insured_value=464990&total_value=464990&is_estimate_active=1"),
    )
    .exec(
      http("request_991")
        .get(uri09 + "/matching-notifications"),
    )
    .exec(
      http("request_1002")
        .get(uri09 + "/product-feedback/apple-iphone-13-pro-mobiltelefon-kartyafuggetlen-256gb-5g-alpesi-zold-mne33hu-a/pd/D7TV6JMBM/reviews/list?source_id=7&filters%5Bhas_picture%5D=1&page%5Boffset%5D=0&page%5Blimit%5D=10&sort%5Bcreated%5D=desc&display_mode=pictures"),
    )
    .exec(
      http("request_1059")
        .post(uri09 + "/newaddtocart?source=front&ref=prodpg_main-91402224&extra_warranty=0&has_warranties=1&has_accessories=0&source_area=main")
        .formParam("extra_warranty", "0")
        .formParam("servicesType", "service")
        .formParam("service[]", "")
        .formParam("service_parrent_id", "91402224")
        .formParam("product[]", "91402224")
        .formParam("ecredit_product", "")
        .formParam("ecredit_installments", ""),
    )
    .exec(
      http("request_1079")
        .get(uri09 + "/cart/products?ref=add-to-cart-module_go-to-cart_button"),
    )
    .exec(
      http("request_1083")
        .get(uri09 + "/profile_async/9mKB2S3aGUMOQQfeavhNtG92ckRIOC9mQUt6MndPWnI2YWhRc2ZkNUhwTS9aK29OME5FYXlWVThNYUI1amQxWWMvUitEQ3FzaFUwd3puTGZMR1VCZmhLVHVFMTdHZ1JUaFI4MngyRldOSnVmSnJrN0NPUjUyZHZMT3ljckp1Wkk1VmdXK3R5QVZYZmFYbENWd2pXUUtESFJvVXV5OUZ2c3BvVEhDd3l5NEZHak9kOEhqU1pqbmpveTRoaW05YzhjdVpSTTdXUis2LytPVVpZZFNpZHNiMU5jYjN0bWtuOWMrb0Y1c3c9PQ__/o/?r=1652626135&c=15&sd=0"),
    )
    .exec(
      http("request_1085")
        .get(uri09 + "/profile_async/9mKB2S3aGUMOQQfeavhNtG92ckRIOC9mQUt6MndPWnI2YWhRc2ZkNUhwTS9aK29OME5FYXlWVThNYUI1amQxWWMvUitEQ3FzaFUwd3puTGZMR1VCZmhLVHVFMTdHZ1JUaFI4MngyRldOSnVmSnJrN0NPUjUyZHZMT3ljckp1Wkk1VmdXK3R5QVZYZmFYbENWd2pXUUtESFJvVXV5OUZ2c3BvVEhDd3l5NEZHak9kOEhqU1pqbmpveTRoaW05YzhjdVpSTTdXUis2LytPVVpZZFNpZHNiMU5jYjN0bWtuOWMrb0Y1c3c9PQ__/o/?r=1652626135&c=15&sd=0"),
    )
    .exec(
      http("request_1091")
        .get(uri09 + "/favorites/lists/type/emag/product_ids?source=front"),
    )
    .exec(
      http("request_1108")
        .get(uri09 + "/matching-notifications")
    )

  setUp(scn.inject(atOnceUsers(1)).protocols(httpProtocol))
}