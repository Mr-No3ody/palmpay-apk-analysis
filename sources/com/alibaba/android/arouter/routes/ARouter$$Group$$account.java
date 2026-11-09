package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.palmpay.account.export.AccountModuleImpl;
import com.transsnet.palmpay.account.kotlin.ui.activity.ResetPinVerificationActivity;
import com.transsnet.palmpay.account.kotlin.ui.activity.SelectResetPinVerifyTypeActivity;
import com.transsnet.palmpay.account.ui.activity.AddGuardianActivity;
import com.transsnet.palmpay.account.ui.activity.AddUserExtraInfoEntryActivity;
import com.transsnet.palmpay.account.ui.activity.AddUserExtraInfoResultActivity;
import com.transsnet.palmpay.account.ui.activity.AskApplyBalanceActivity;
import com.transsnet.palmpay.account.ui.activity.AuthenticationActivity;
import com.transsnet.palmpay.account.ui.activity.AuthenticationOtpActivity;
import com.transsnet.palmpay.account.ui.activity.ChangeMobileActivity;
import com.transsnet.palmpay.account.ui.activity.EditUserNameActivity;
import com.transsnet.palmpay.account.ui.activity.EnableCashBoxAutoSaveActivity;
import com.transsnet.palmpay.account.ui.activity.GuardianApproveActivity;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelUp3Activity;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3EntryActivity;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelV2Activity;
import com.transsnet.palmpay.account.ui.activity.PalmPayTier3PendingActivity;
import com.transsnet.palmpay.account.ui.activity.PinSafeWithPatternActivity;
import com.transsnet.palmpay.account.ui.activity.PreviewPdfActivity;
import com.transsnet.palmpay.account.ui.activity.PrivacyAccountNoSettingsActivity;
import com.transsnet.palmpay.account.ui.activity.ResetPinActivity;
import com.transsnet.palmpay.account.ui.activity.SetNewPinV2Activity;
import com.transsnet.palmpay.account.ui.activity.SetNewPswActivity;
import com.transsnet.palmpay.account.ui.activity.SetPatternPinActivity;
import com.transsnet.palmpay.account.ui.activity.SetSafeLockPinActivity;
import com.transsnet.palmpay.account.ui.activity.SetTouchIdActivity;
import com.transsnet.palmpay.account.ui.activity.SetUserPhotoActivity;
import com.transsnet.palmpay.account.ui.activity.SignUpActivity;
import com.transsnet.palmpay.account.ui.activity.SignUpSuccessActivity;
import com.transsnet.palmpay.account.ui.activity.VerifyAccountActivity;
import com.transsnet.palmpay.account.ui.activity.VerifyAccountFaceActivity;
import com.transsnet.palmpay.account.ui.activity.VerifyAccountHistoryActivity;
import com.transsnet.palmpay.account.ui.activity.VerifyRealNameActivity;
import com.transsnet.palmpay.account.ui.activity.VerifyRealNameResultActivity;
import com.transsnet.palmpay.account.ui.activity.quota.Tier3QuotaManageActivity;
import com.transsnet.palmpay.device.ui.activity.DeviceDetail2Activity;
import com.transsnet.palmpay.device.ui.activity.DeviceListActivity;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$account implements IRouteGroup {

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$1, reason: invalid class name */
    public class AnonymousClass1 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$10, reason: invalid class name */
    public class AnonymousClass10 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$11, reason: invalid class name */
    public class AnonymousClass11 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$12, reason: invalid class name */
    public class AnonymousClass12 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$13, reason: invalid class name */
    public class AnonymousClass13 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$14, reason: invalid class name */
    public class AnonymousClass14 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$15, reason: invalid class name */
    public class AnonymousClass15 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$16, reason: invalid class name */
    public class AnonymousClass16 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$17, reason: invalid class name */
    public class AnonymousClass17 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$18, reason: invalid class name */
    public class AnonymousClass18 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$19, reason: invalid class name */
    public class AnonymousClass19 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$2, reason: invalid class name */
    public class AnonymousClass2 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$20, reason: invalid class name */
    public class AnonymousClass20 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$21, reason: invalid class name */
    public class AnonymousClass21 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$22, reason: invalid class name */
    public class AnonymousClass22 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$23, reason: invalid class name */
    public class AnonymousClass23 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$24, reason: invalid class name */
    public class AnonymousClass24 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$25, reason: invalid class name */
    public class AnonymousClass25 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$26, reason: invalid class name */
    public class AnonymousClass26 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$3, reason: invalid class name */
    public class AnonymousClass3 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$4, reason: invalid class name */
    public class AnonymousClass4 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$5, reason: invalid class name */
    public class AnonymousClass5 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$6, reason: invalid class name */
    public class AnonymousClass6 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$7, reason: invalid class name */
    public class AnonymousClass7 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$8, reason: invalid class name */
    public class AnonymousClass8 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$9, reason: invalid class name */
    public class AnonymousClass9 extends HashMap<String, Integer> {
    }

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.put("business_type", 3);
        anonymousClass1.put("scene", 3);
        map.put("/account/AuthenticationOtp", RouteMeta.build(routeType, AuthenticationOtpActivity.class, "/account/authenticationotp", "account", anonymousClass1, -1, Integer.MIN_VALUE));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        anonymousClass2.put("extra_title", 8);
        anonymousClass2.put("_token", 8);
        anonymousClass2.put("extra_type", 3);
        anonymousClass2.put("extra_message", 8);
        map.put("/account/addGuardian", RouteMeta.build(routeType, AddGuardianActivity.class, "/account/addguardian", "account", anonymousClass2, -1, Integer.MIN_VALUE));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        anonymousClass3.put("showDialog", 8);
        anonymousClass3.put("scene", 8);
        map.put("/account/add_extra", RouteMeta.build(routeType, AddUserExtraInfoEntryActivity.class, "/account/add_extra", "account", anonymousClass3, -1, Integer.MIN_VALUE));
        map.put("/account/add_extra_result", RouteMeta.build(routeType, AddUserExtraInfoResultActivity.class, "/account/add_extra_result", "account", null, -1, Integer.MIN_VALUE));
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        anonymousClass4.put("extra_data_2", 8);
        anonymousClass4.put("extra_show_result_dialog", 0);
        anonymousClass4.put("extra_data_1", 8);
        anonymousClass4.put("extra_data", 8);
        map.put("/account/ask_apply_for_balance", RouteMeta.build(routeType, AskApplyBalanceActivity.class, "/account/ask_apply_for_balance", "account", anonymousClass4, -1, Integer.MIN_VALUE));
        AnonymousClass5 anonymousClass5 = new AnonymousClass5();
        anonymousClass5.put("extra_mode", 3);
        anonymousClass5.put("need_pin", 0);
        anonymousClass5.put("_encrypt", 0);
        anonymousClass5.put("orderId", 8);
        anonymousClass5.put("extra_type", 3);
        map.put("/account/authentication", RouteMeta.build(routeType, AuthenticationActivity.class, "/account/authentication", "account", anonymousClass5, -1, Integer.MIN_VALUE));
        AnonymousClass6 anonymousClass6 = new AnonymousClass6();
        anonymousClass6.put("oldNumber", 8);
        anonymousClass6.put("_token", 8);
        anonymousClass6.put("_security_flow_info", 10);
        anonymousClass6.put("skipSecurity", 0);
        map.put("/account/changeMobile", RouteMeta.build(routeType, ChangeMobileActivity.class, "/account/changemobile", "account", anonymousClass6, -1, Integer.MIN_VALUE));
        AnonymousClass7 anonymousClass7 = new AnonymousClass7();
        anonymousClass7.put("isCurrent", 0);
        anonymousClass7.put("name", 8);
        anonymousClass7.put("imei", 8);
        anonymousClass7.put("deviceModel", 8);
        anonymousClass7.put(CodePushConstants.LATEST_ROLLBACK_TIME_KEY, 8);
        anonymousClass7.put("type", 8);
        anonymousClass7.put("memberId", 8);
        map.put("/account/device/detail", RouteMeta.build(routeType, DeviceDetail2Activity.class, "/account/device/detail", "account", anonymousClass7, -1, Integer.MIN_VALUE));
        map.put("/account/device/list", RouteMeta.build(routeType, DeviceListActivity.class, "/account/device/list", "account", null, -1, Integer.MIN_VALUE));
        map.put("/account/edit_name", RouteMeta.build(routeType, EditUserNameActivity.class, "/account/edit_name", "account", null, -1, Integer.MIN_VALUE));
        map.put("/account/enableAutoSave", RouteMeta.build(routeType, EnableCashBoxAutoSaveActivity.class, "/account/enableautosave", "account", null, -1, Integer.MIN_VALUE));
        map.put("/account/guardianApprove", RouteMeta.build(routeType, GuardianApproveActivity.class, "/account/guardianapprove", "account", null, -1, Integer.MIN_VALUE));
        map.put("/account/identity_verification", RouteMeta.build(routeType, IdentityVerificationActivity.class, "/account/identity_verification", "account", null, -1, Integer.MIN_VALUE));
        AnonymousClass8 anonymousClass8 = new AnonymousClass8();
        anonymousClass8.put("_number", 8);
        anonymousClass8.put("extra_note", 8);
        anonymousClass8.put("extra_data", 8);
        anonymousClass8.put("core_extra_bank_account_data", 8);
        anonymousClass8.put("extra_flag", 0);
        anonymousClass8.put("android.intent.extra.TEXT", 8);
        anonymousClass8.put("_input_number", 8);
        anonymousClass8.put("extra_type", 8);
        anonymousClass8.put("source", 8);
        map.put("/account/login", RouteMeta.build(routeType, LogInActivity.class, "/account/login", "account", anonymousClass8, -1, Integer.MIN_VALUE));
        map.put("/account/palmpayLevel", RouteMeta.build(routeType, PalmPayLevelV2Activity.class, "/account/palmpaylevel", "account", null, -1, Integer.MIN_VALUE));
        map.put("/account/pin_safe_verification", RouteMeta.build(routeType, PinSafeWithPatternActivity.class, "/account/pin_safe_verification", "account", null, -1, Integer.MIN_VALUE));
        AnonymousClass9 anonymousClass9 = new AnonymousClass9();
        anonymousClass9.put("pdf_snap_only", 0);
        anonymousClass9.put("private_photo", 0);
        map.put("/account/previewPdf", RouteMeta.build(routeType, PreviewPdfActivity.class, "/account/previewpdf", "account", anonymousClass9, -1, Integer.MIN_VALUE));
        map.put("/account/privacy_account_no_settings", RouteMeta.build(routeType, PrivacyAccountNoSettingsActivity.class, "/account/privacy_account_no_settings", "account", null, -1, Integer.MIN_VALUE));
        map.put("/account/provier", RouteMeta.build(RouteType.PROVIDER, AccountModuleImpl.class, "/account/provier", "account", null, -1, Integer.MIN_VALUE));
        AnonymousClass10 anonymousClass10 = new AnonymousClass10();
        anonymousClass10.put("extra_data_2", 8);
        anonymousClass10.put("extra_data", 8);
        anonymousClass10.put("extra_data_1", 8);
        anonymousClass10.put("extra_type", 8);
        anonymousClass10.put("_security_flow_info", 10);
        map.put("/account/reset_pin_verify", RouteMeta.build(routeType, ResetPinVerificationActivity.class, "/account/reset_pin_verify", "account", anonymousClass10, -1, Integer.MIN_VALUE));
        AnonymousClass11 anonymousClass11 = new AnonymousClass11();
        anonymousClass11.put("extra_data", 8);
        anonymousClass11.put("extra_title", 8);
        anonymousClass11.put("_security_flow_info", 10);
        map.put("/account/resetpin", RouteMeta.build(routeType, ResetPinActivity.class, "/account/resetpin", "account", anonymousClass11, -1, Integer.MIN_VALUE));
        AnonymousClass12 anonymousClass12 = new AnonymousClass12();
        anonymousClass12.put("extra_data_2", 8);
        anonymousClass12.put("extra_data_1", 8);
        anonymousClass12.put("_security_flow_info", 10);
        map.put("/account/select_reset_pin_verify_type", RouteMeta.build(routeType, SelectResetPinVerifyTypeActivity.class, "/account/select_reset_pin_verify_type", "account", anonymousClass12, -1, Integer.MIN_VALUE));
        AnonymousClass13 anonymousClass13 = new AnonymousClass13();
        anonymousClass13.put("extra_mode", 0);
        anonymousClass13.put("takePhotoOnly", 0);
        anonymousClass13.put("photoBig", 0);
        anonymousClass13.put("extra_token", 8);
        anonymousClass13.put("crop_photo", 0);
        anonymousClass13.put("photoType", 8);
        anonymousClass13.put("origin_photo", 0);
        anonymousClass13.put("private_photo", 0);
        anonymousClass13.put("pdf_mode", 8);
        map.put("/account/setUserPhoto", RouteMeta.build(routeType, SetUserPhotoActivity.class, "/account/setuserphoto", "account", anonymousClass13, -1, Integer.MIN_VALUE));
        AnonymousClass14 anonymousClass14 = new AnonymousClass14();
        anonymousClass14.put("mode", 3);
        anonymousClass14.put("_security_token", 8);
        anonymousClass14.put("extra_data_2", 8);
        map.put("/account/set_new_psw", RouteMeta.build(routeType, SetNewPswActivity.class, "/account/set_new_psw", "account", anonymousClass14, -1, Integer.MIN_VALUE));
        AnonymousClass15 anonymousClass15 = new AnonymousClass15();
        anonymousClass15.put("fromSignUp", 0);
        anonymousClass15.put("IS_FORCE_SETTING_MODE", 0);
        anonymousClass15.put("jump_source", 3);
        map.put("/account/set_pattern_pin", RouteMeta.build(routeType, SetPatternPinActivity.class, "/account/set_pattern_pin", "account", anonymousClass15, -1, Integer.MIN_VALUE));
        AnonymousClass16 anonymousClass16 = new AnonymousClass16();
        anonymousClass16.put("IS_FORCE_SETTING_MODE", 0);
        map.put("/account/set_touch_id", RouteMeta.build(routeType, SetTouchIdActivity.class, "/account/set_touch_id", "account", anonymousClass16, -1, Integer.MIN_VALUE));
        AnonymousClass17 anonymousClass17 = new AnonymousClass17();
        anonymousClass17.put("old_pin", 8);
        anonymousClass17.put("mode", 3);
        anonymousClass17.put("_security_token", 8);
        anonymousClass17.put("extra_data_2", 8);
        anonymousClass17.put("_token", 8);
        anonymousClass17.put("_security_flow_info", 10);
        anonymousClass17.put("_temp_token", 8);
        map.put("/account/setnewpin", RouteMeta.build(routeType, SetNewPinV2Activity.class, "/account/setnewpin", "account", anonymousClass17, -1, Integer.MIN_VALUE));
        map.put("/account/settinglockpin", RouteMeta.build(routeType, SetSafeLockPinActivity.class, "/account/settinglockpin", "account", null, -1, Integer.MIN_VALUE));
        AnonymousClass18 anonymousClass18 = new AnonymousClass18();
        anonymousClass18.put("extra_flag", 0);
        map.put("/account/sign_up_success", RouteMeta.build(routeType, SignUpSuccessActivity.class, "/account/sign_up_success", "account", anonymousClass18, -1, Integer.MIN_VALUE));
        AnonymousClass19 anonymousClass19 = new AnonymousClass19();
        anonymousClass19.put("_number", 8);
        anonymousClass19.put("extra_note", 8);
        anonymousClass19.put("extra_data", 8);
        anonymousClass19.put("extra_flag", 0);
        anonymousClass19.put("_input_number", 8);
        anonymousClass19.put("business_path", 8);
        anonymousClass19.put("_token", 8);
        anonymousClass19.put("source", 8);
        map.put("/account/signup", RouteMeta.build(routeType, SignUpActivity.class, "/account/signup", "account", anonymousClass19, -1, Integer.MIN_VALUE));
        map.put("/account/tier3_quota", RouteMeta.build(routeType, Tier3QuotaManageActivity.class, "/account/tier3_quota", "account", null, -1, Integer.MIN_VALUE));
        AnonymousClass20 anonymousClass20 = new AnonymousClass20();
        anonymousClass20.put("extra_data_2", 8);
        anonymousClass20.put("jump_url", 8);
        anonymousClass20.put("extra_show_result_dialog", 0);
        anonymousClass20.put("extra_data_1", 8);
        anonymousClass20.put("jump_source", 8);
        anonymousClass20.put("businessType", 8);
        anonymousClass20.put("type", 8);
        anonymousClass20.put("ext_business_data", 8);
        anonymousClass20.put("real_name_auth", 0);
        anonymousClass20.put("extCheckXds", 8);
        anonymousClass20.put("both", 8);
        map.put("/account/upgrade", RouteMeta.build(routeType, PalmPayLevelUp3Activity.class, "/account/upgrade", "account", anonymousClass20, -1, Integer.MIN_VALUE));
        AnonymousClass21 anonymousClass21 = new AnonymousClass21();
        anonymousClass21.put("orderNo", 8);
        anonymousClass21.put("extra_data_1", 9);
        anonymousClass21.put("extra_flag", 0);
        map.put("/account/upgrade_tier3", RouteMeta.build(routeType, PalmPayLevelUpTier3V2Activity.class, "/account/upgrade_tier3", "account", anonymousClass21, -1, Integer.MIN_VALUE));
        map.put("/account/upgrade_tier3_export", RouteMeta.build(routeType, PalmPayLevelUpTier3EntryActivity.class, "/account/upgrade_tier3_export", "account", null, -1, Integer.MIN_VALUE));
        AnonymousClass22 anonymousClass22 = new AnonymousClass22();
        anonymousClass22.put("extra_data_2", 8);
        anonymousClass22.put("extra_data", 8);
        anonymousClass22.put("extra_data_1", 8);
        map.put("/account/upgrade_tier3_result", RouteMeta.build(routeType, PalmPayTier3PendingActivity.class, "/account/upgrade_tier3_result", "account", anonymousClass22, -1, Integer.MIN_VALUE));
        map.put("/account/verifyAccount", RouteMeta.build(routeType, VerifyAccountActivity.class, "/account/verifyaccount", "account", null, -1, Integer.MIN_VALUE));
        AnonymousClass23 anonymousClass23 = new AnonymousClass23();
        anonymousClass23.put("_security_flow_info", 10);
        map.put("/account/verify_account_face", RouteMeta.build(routeType, VerifyAccountFaceActivity.class, "/account/verify_account_face", "account", anonymousClass23, -1, Integer.MIN_VALUE));
        AnonymousClass24 anonymousClass24 = new AnonymousClass24();
        anonymousClass24.put("_security_flow_info", 10);
        map.put("/account/verify_account_history", RouteMeta.build(routeType, VerifyAccountHistoryActivity.class, "/account/verify_account_history", "account", anonymousClass24, -1, Integer.MIN_VALUE));
        AnonymousClass25 anonymousClass25 = new AnonymousClass25();
        anonymousClass25.put("extra_data", 8);
        anonymousClass25.put("extra_type", 3);
        map.put("/account/verify_real_name", RouteMeta.build(routeType, VerifyRealNameActivity.class, "/account/verify_real_name", "account", anonymousClass25, -1, Integer.MIN_VALUE));
        AnonymousClass26 anonymousClass26 = new AnonymousClass26();
        anonymousClass26.put("extra_result", 3);
        anonymousClass26.put("extra_type", 3);
        anonymousClass26.put("extra_message", 8);
        map.put("/account/verify_real_name_result", RouteMeta.build(routeType, VerifyRealNameResultActivity.class, "/account/verify_real_name_result", "account", anonymousClass26, -1, Integer.MIN_VALUE));
    }
}
