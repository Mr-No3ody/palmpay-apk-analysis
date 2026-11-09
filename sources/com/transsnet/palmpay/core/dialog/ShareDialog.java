package com.transsnet.palmpay.core.dialog;

import N8.q0;
import Pa.i0;
import Pa.k0;
import Pa.n0;
import Pa.r0;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.bean.ShareAppInfo;
import com.transsnet.palmpay.core.bean.req.CommonShareReq;
import com.transsnet.palmpay.core.bean.rsp.CommonShareNewRsp;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.custom_view.q;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p025ba.k;
import p025ba.l;
import p052da.G;
import p052da.X;
import p052da.Z;
import p185ma.r;

/* JADX INFO: loaded from: classes3.dex */
public class ShareDialog extends com.transsnet.palmpay.custom_view.dialog.b {
    private static final String EVENT_SHARE_CHANNEL_CLICK = "share_channel_click";
    private static final String EVENT_SHARE_POPUP_EXPOSURE = "share_popup_exposure";
    private static final String PARAM_CREATE_SHARE_URL = "createShareUrl";
    private static final String PARAM_SHARE_PHONE_NUMBER = "share_phone_number";
    private static final String PARAM_SHARE_SCENE = "share_scene";
    private static final String PARAM_SHARE_SOURCE = "share_source";
    private static final String PARAM_SHARE_TYPE = "share_type";
    private static final String PKG_FACEBOOK = "com.facebook.katana";
    private static final String PKG_TELEGRAM = "org.telegram.messenger";
    private static final String PKG_TELEGRAM_WEB = "org.telegram.messenger.web";
    private static final String PKG_WHATSAPP = "com.whatsapp";
    public static final int SHARE_BUSINESS_TYPE_GET_SHORT_URL = 5;
    public static final int SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK = 47;
    public static final int SHARE_BUSINESS_TYPE_LOVE_DAY = 45;
    public static final int SHARE_BUSINESS_TYPE_REFER_EARN = 16;
    public static final int SHARE_BUSINESS_TYPE_REFER_EARN_AUTH_SMS = 18;
    public static final int SHARE_BUSINESS_TYPE_REFER_EARN_OKCARD_SMS = 19;
    public static final int SHARE_BUSINESS_TYPE_REFER_EARN_SMS = 17;
    public static final int SHARE_BUSINESS_TYPE_REQUEST_MONEY = 26;
    private boolean ignoreContactArea;
    private boolean mAppsExpanded;
    private GridLayoutManager mAppsLayoutManager;
    private RecyclerView mAppsRcv;
    private View mBottomArea;
    private p103gf.a mCompositeDisposable;
    private G mContactsAdapter;
    private View mContactsArea;
    private List<PalmPayContact> mContactsList;
    private RecyclerView mContactsRcv;
    private View mCopyLinkContainer;
    private ImageView mIvClose;
    private ImageView mIvTitle;
    private View mMoreContainer;
    private String mParams;
    private View mQrCodeContainer;
    private String mReferEarnId;
    private String mSendMoneyOrderNo;
    private X mShareAppAdapter;
    private int mShareBusinessType;
    private Z mShareChannelAdapter;
    private View mShareChannelArea;
    private RecyclerView mShareChannelRcv;
    private String mSharePhoneNumber;
    private Integer mShareSource;
    private String mShareText;
    private boolean mShowContactArea;
    private String mSmsPackageName;
    private TextView mTvTitle;
    private Handler mUiHandler;
    private boolean showCopyLink;
    private boolean showMore;
    private boolean showQrCode;
    private TextView tvShareText;
    private TextView tvShareText2;
    private View viewShareText;

    public ShareDialog(Context context) {
        super(context);
        this.ignoreContactArea = false;
        this.mShareBusinessType = -1;
        this.mShareText = "";
        this.mParams = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDisposable(Disposable d2) {
        if (this.mCompositeDisposable == null) {
            this.mCompositeDisposable = new p103gf.a();
        }
        this.mCompositeDisposable.add(d2);
    }

    private void applyPhoneInviteTitleIfNeeded() {
        if (TextUtils.isEmpty(this.mSharePhoneNumber) || this.mTvTitle == null) {
            return;
        }
        String strZ = r0.Z(this.mSharePhoneNumber);
        if (TextUtils.isEmpty(strZ)) {
            return;
        }
        this.mTvTitle.setVisibility(0);
        this.mTvTitle.setText(this.mContext.getString(k.core_invite_phone_to_join_palmpay, strZ));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindShareChannelArea(CommonShareNewRsp data) {
        List<CommonShareNewRsp.ShareItem> list;
        boolean z3 = (data == null || TextUtils.isEmpty(data.titleImg)) ? false : true;
        boolean z8 = (data == null || (list = data.shareList) == null || list.isEmpty()) ? false : true;
        View view = this.mShareChannelArea;
        if (view == null) {
            return;
        }
        if (!z8) {
            view.setVisibility(8);
            Z z10 = this.mShareChannelAdapter;
            z10.f35744b.clear();
            z10.notifyDataSetChanged();
            this.viewShareText.setVisibility(0);
            this.tvShareText.setText(k0.c(getContext(), this.mShareText));
            applyPhoneInviteTitleIfNeeded();
            return;
        }
        if (z3) {
            ImageView imageView = this.mIvTitle;
            if (imageView != null) {
                imageView.setVisibility(0);
                r0.l1(data.titleImg, this.mIvTitle);
            }
            TextView textView = this.mTvTitle;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            ImageView imageView2 = this.mIvTitle;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            TextView textView2 = this.mTvTitle;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            if (!TextUtils.isEmpty(this.mSharePhoneNumber)) {
                applyPhoneInviteTitleIfNeeded();
            }
        }
        if (TextUtils.isEmpty(data.url)) {
            this.tvShareText2.setVisibility(8);
        } else {
            this.tvShareText2.setText(data.url);
            this.tvShareText2.setVisibility(0);
        }
        this.viewShareText.setVisibility(8);
        this.mShareChannelArea.setVisibility(0);
        Z z11 = this.mShareChannelAdapter;
        List<CommonShareNewRsp.ShareItem> list2 = data.shareList;
        ArrayList arrayList = z11.f35744b;
        arrayList.clear();
        if (list2 != null && !list2.isEmpty()) {
            arrayList.addAll(list2);
        }
        z11.notifyDataSetChanged();
    }

    private List<ShareAppInfo> buildDefaultShareApps() {
        List<ShareAppInfo> listBuildFixedShareApps = buildFixedShareApps();
        ShareAppInfo shareAppInfo = new ShareAppInfo();
        shareAppInfo.itemType = 2;
        shareAppInfo.label = this.mContext.getString(k.core_more);
        shareAppInfo.icon = buildMoreIcon();
        listBuildFixedShareApps.add(shareAppInfo);
        return listBuildFixedShareApps;
    }

    private List<ShareAppInfo> buildExpandedShareApps() {
        ResolveInfo resolveInfo;
        ActivityInfo activityInfo;
        List<ShareAppInfo> listBuildFixedShareApps = buildFixedShareApps();
        Set<String> fixedPackageNames = getFixedPackageNames();
        ArrayList<ShareAppInfo> arrayListF0 = r0.F0(this.mContext);
        if (!arrayListF0.isEmpty()) {
            for (ShareAppInfo shareAppInfo : arrayListF0) {
                if (shareAppInfo != null && (resolveInfo = shareAppInfo.resolveInfo) != null && (activityInfo = resolveInfo.activityInfo) != null && !fixedPackageNames.contains(activityInfo.packageName)) {
                    shareAppInfo.itemType = 3;
                    listBuildFixedShareApps.add(shareAppInfo);
                }
            }
        }
        return listBuildFixedShareApps;
    }

    private List<ShareAppInfo> buildFixedShareApps() {
        ActivityInfo activityInfo;
        Map<String, ResolveInfo> mapBuildInstalledShareResolveMap = buildInstalledShareResolveMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(createFixedShareApp(PKG_WHATSAPP, this.mContext.getString(k.core_whatsapp), p025ba.d.core_share_whatsapp, findShareResolveInfo(PKG_WHATSAPP, mapBuildInstalledShareResolveMap)));
        arrayList.add(createFixedShareApp(PKG_FACEBOOK, this.mContext.getString(k.core_facebook), p025ba.d.core_share_facebook, findShareResolveInfo(PKG_FACEBOOK, mapBuildInstalledShareResolveMap)));
        String strResolveSmsPackageName = resolveSmsPackageName();
        arrayList.add(createFixedShareApp(strResolveSmsPackageName, this.mContext.getString(k.core_sms), p025ba.d.core_share_sms, findShareResolveInfo(strResolveSmsPackageName, mapBuildInstalledShareResolveMap)));
        String str = PKG_TELEGRAM;
        ResolveInfo resolveInfoFindShareResolveInfo = findShareResolveInfo(PKG_TELEGRAM, mapBuildInstalledShareResolveMap);
        if (resolveInfoFindShareResolveInfo == null) {
            resolveInfoFindShareResolveInfo = findShareResolveInfo(PKG_TELEGRAM_WEB, mapBuildInstalledShareResolveMap);
        }
        if (resolveInfoFindShareResolveInfo != null && (activityInfo = resolveInfoFindShareResolveInfo.activityInfo) != null) {
            str = activityInfo.packageName;
        }
        arrayList.add(createFixedShareApp(str, this.mContext.getString(k.core_telegram), p025ba.d.core_share_telegram, resolveInfoFindShareResolveInfo));
        return arrayList;
    }

    private Map<String, ResolveInfo> buildInstalledShareResolveMap() {
        ResolveInfo resolveInfo;
        ActivityInfo activityInfo;
        HashMap map = new HashMap();
        for (ShareAppInfo shareAppInfo : r0.F0(this.mContext)) {
            if (shareAppInfo != null && (resolveInfo = shareAppInfo.resolveInfo) != null && (activityInfo = resolveInfo.activityInfo) != null) {
                String str = activityInfo.packageName;
                if (!map.containsKey(str)) {
                    map.put(str, shareAppInfo.resolveInfo);
                }
            }
        }
        return map;
    }

    @NonNull
    private IconicsDrawable buildMoreIcon() {
        IconicsDrawable iconicsDrawable = new IconicsDrawable(this.mContext, S6.a.pay_Add);
        int color = this.mContext.getColor(L6.b.ppColorBackgroundDark);
        Intrinsics.checkNotNullParameter(iconicsDrawable, "<this>");
        H5.e eVarColorInt = H5.e.f3702a.colorInt(color);
        Intrinsics.checkNotNullParameter(iconicsDrawable, "<this>");
        iconicsDrawable.f(eVarColorInt != null ? eVarColorInt.a(iconicsDrawable.c(), iconicsDrawable.f23579b) : null);
        Intrinsics.checkNotNullParameter(iconicsDrawable, "<this>");
        H5.i iVar = H5.j.f3734a;
        H5.j jVarDp = iVar.dp(8);
        Intrinsics.checkNotNullParameter(iconicsDrawable, "<this>");
        float fB = jVarDp != null ? jVarDp.b(iconicsDrawable.c()) : 0.0f;
        iconicsDrawable.f23597u = fB;
        iconicsDrawable.d();
        iconicsDrawable.f23598v = fB;
        iconicsDrawable.d();
        D3.a.F(iconicsDrawable, this.mContext.getColor(L6.b.ppColorTextAssist));
        Intrinsics.checkNotNullParameter(iconicsDrawable, "<this>");
        H5.j jVarDp2 = iVar.dp(6);
        Intrinsics.checkNotNullParameter(iconicsDrawable, "<this>");
        iconicsDrawable.j(jVarDp2 != null ? jVarDp2.a(iconicsDrawable.c()) : 0);
        p118hf.a.I(iconicsDrawable, 40);
        return iconicsDrawable;
    }

    private void commonShare(CommonShareReq req) {
        if (isOldApi()) {
            ((PayApiService) p324va.c.f43141a.f14621b).commonShare(req).i(p071ef.b.a()).k(p298tf.f.f42629b).subscribe(new r(this, req, 0));
        } else {
            ((PayApiService) p324va.c.f43141a.f14621b).commonShareNew(req).i(p071ef.b.a()).k(p298tf.f.f42629b).subscribe(new r(this, req, 1));
        }
    }

    private ShareAppInfo createFixedShareApp(String packageName, String label, int iconRes, ResolveInfo resolveInfo) {
        ShareAppInfo shareAppInfo = new ShareAppInfo();
        shareAppInfo.itemType = 1;
        shareAppInfo.packageName = packageName;
        shareAppInfo.label = label;
        shareAppInfo.icon = this.mContext.getDrawable(iconRes);
        shareAppInfo.resolveInfo = resolveInfo;
        return shareAppInfo;
    }

    private boolean createShareUrl(String params) {
        try {
            if (!TextUtils.isEmpty(params)) {
                return new JSONObject(params).optBoolean(PARAM_CREATE_SHARE_URL, true);
            }
        } catch (Exception unused) {
        }
        return true;
    }

    private void expandShareApps() {
        if (this.mAppsExpanded) {
            return;
        }
        this.mAppsExpanded = true;
        ViewGroup.LayoutParams layoutParams = this.mAppsRcv.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.mContext.getResources().getDimensionPixelSize(q.dp82) * 2;
            this.mAppsRcv.setLayoutParams(layoutParams);
        }
        this.mShareAppAdapter.f4985b = buildExpandedShareApps();
        this.mShareAppAdapter.notifyDataSetChanged();
    }

    private ResolveInfo findShareResolveInfo(String packageName, Map<String, ResolveInfo> installedMap) {
        if (TextUtils.isEmpty(packageName)) {
            return null;
        }
        ResolveInfo resolveInfo = installedMap.get(packageName);
        if (resolveInfo != null) {
            return resolveInfo;
        }
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setType("text/plain");
            intent.setPackage(packageName);
            List<ResolveInfo> listQueryIntentActivities = this.mContext.getPackageManager().queryIntentActivities(intent, 0);
            if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                return listQueryIntentActivities.get(0);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private String findSmsPackageFromShareApps() {
        String[] strArr = {"com.google.android.apps.messaging", "com.android.mms", "com.samsung.android.messaging", "com.android.messaging"};
        Map<String, ResolveInfo> mapBuildInstalledShareResolveMap = buildInstalledShareResolveMap();
        for (int i7 = 0; i7 < 4; i7++) {
            String str = strArr[i7];
            if (mapBuildInstalledShareResolveMap.containsKey(str)) {
                return str;
            }
        }
        for (String str2 : mapBuildInstalledShareResolveMap.keySet()) {
            if (str2 != null) {
                String lowerCase = str2.toLowerCase(Locale.US);
                if (lowerCase.contains("messaging") || lowerCase.contains(".mms")) {
                    return str2;
                }
            }
        }
        return null;
    }

    private Set<String> getFixedPackageNames() {
        HashSet hashSet = new HashSet();
        hashSet.add(PKG_WHATSAPP);
        hashSet.add(PKG_FACEBOOK);
        hashSet.add(PKG_TELEGRAM);
        hashSet.add(PKG_TELEGRAM_WEB);
        String strResolveSmsPackageName = resolveSmsPackageName();
        if (!TextUtils.isEmpty(strResolveSmsPackageName)) {
            hashSet.add(strResolveSmsPackageName);
        }
        return hashSet;
    }

    private String getLocalPhoneForDisplay(String phone) {
        if (TextUtils.isEmpty(phone)) {
            return "";
        }
        String strW0 = r0.w0(phone);
        if (!TextUtils.isEmpty(strW0)) {
            phone = strW0;
        }
        return phone.replaceAll("[^0-9]", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Handler getUiHandler() {
        if (this.mUiHandler == null) {
            this.mUiHandler = new Handler(Looper.getMainLooper());
        }
        return this.mUiHandler;
    }

    private String getWhatsAppPhoneDigits(String phone) {
        String localPhoneForDisplay = getLocalPhoneForDisplay(phone);
        if (TextUtils.isEmpty(localPhoneForDisplay)) {
            return "";
        }
        if (localPhoneForDisplay.startsWith("0")) {
            localPhoneForDisplay = localPhoneForDisplay.substring(1);
        }
        String strV0 = r0.v0(localPhoneForDisplay);
        if (TextUtils.isEmpty(strV0)) {
            return "";
        }
        String strReplaceAll = strV0.replaceAll("[^0-9]", "");
        return strReplaceAll.startsWith("0") ? strReplaceAll.substring(1) : strReplaceAll;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isActivityValid(Context context) {
        if (context instanceof Activity) {
            return i0.W((Activity) context);
        }
        if (context instanceof ContextWrapper) {
            return isActivityValid(((ContextWrapper) context).getBaseContext());
        }
        return true;
    }

    private boolean isOldApi() {
        int i7 = this.mShareBusinessType;
        return i7 != 16 && i7 != 17 && i7 >= 0 && i7 < 31;
    }

    private boolean isSmsShareApp(ShareAppInfo data) {
        if (data == null) {
            return false;
        }
        String strResolveSmsPackageName = resolveSmsPackageName();
        if (TextUtils.isEmpty(strResolveSmsPackageName)) {
            return false;
        }
        return strResolveSmsPackageName.equals(data.packageName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$0(View view, PalmPayContact palmPayContact, RecyclerView.ViewHolder viewHolder) {
        if (TextUtils.isEmpty(this.mParams)) {
            commonShare(new CommonShareReq(this.mShareBusinessType, palmPayContact.getContactsMemberId(), CommonShareReq.TYPE_SEND_NOTIFICATION));
        } else {
            commonShare(new CommonShareReq(this.mShareBusinessType, palmPayContact.getContactsMemberId(), CommonShareReq.TYPE_SEND_NOTIFICATION, this.mParams));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$1(View view, ShareAppInfo shareAppInfo, RecyclerView.ViewHolder viewHolder) {
        ActivityInfo activityInfo;
        ActivityInfo activityInfo2;
        if (shareAppInfo == null) {
            return;
        }
        if (shareAppInfo.itemType == 2) {
            logShareChannelClick(shareAppInfo);
            expandShareApps();
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.mSharePhoneNumber);
        if (!zIsEmpty && PKG_WHATSAPP.equals(shareAppInfo.packageName) && !TextUtils.isEmpty(getWhatsAppPhoneDigits(this.mSharePhoneNumber))) {
            ResolveInfo resolveInfo = shareAppInfo.resolveInfo;
            if (resolveInfo == null || (activityInfo2 = resolveInfo.activityInfo) == null || activityInfo2.applicationInfo == null) {
                ToastUtils.showShort(k.core_share_app_not_installed);
                return;
            }
            shareToWhatsAppWithPhone();
            dismiss();
            shareStatic(shareAppInfo);
            return;
        }
        if (!zIsEmpty && isSmsShareApp(shareAppInfo) && !TextUtils.isEmpty(getLocalPhoneForDisplay(this.mSharePhoneNumber))) {
            shareToSmsWithPhone();
            dismiss();
            shareStatic(shareAppInfo);
            return;
        }
        ResolveInfo resolveInfo2 = shareAppInfo.resolveInfo;
        if (resolveInfo2 == null || (activityInfo = resolveInfo2.activityInfo) == null || activityInfo.applicationInfo == null) {
            ToastUtils.showShort(k.core_share_app_not_installed);
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND", (Uri) null);
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setType("text/plain");
        ActivityInfo activityInfo3 = shareAppInfo.resolveInfo.activityInfo;
        intent.setComponent(new ComponentName(activityInfo3.applicationInfo.packageName, activityInfo3.name));
        intent.putExtra("android.intent.extra.TEXT", this.mShareText);
        ActivityUtils.startActivity(intent);
        dismiss();
        shareStatic(shareAppInfo);
    }

    private void logShareChannelClick(ShareAppInfo data) {
        if (data == null || data.label == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put(PARAM_SHARE_SCENE, data.label.toString());
        map.put(PARAM_SHARE_TYPE, Integer.valueOf(this.mShareBusinessType));
        n0.g().n(EVENT_SHARE_CHANNEL_CLICK, map);
    }

    private void logSharePopupExposure() {
        HashMap map = new HashMap();
        map.put(PARAM_SHARE_TYPE, Integer.valueOf(this.mShareBusinessType));
        if (!TextUtils.isEmpty(this.mSharePhoneNumber)) {
            map.put(PARAM_SHARE_PHONE_NUMBER, this.mSharePhoneNumber);
        }
        Integer num = this.mShareSource;
        if (num != null) {
            map.put(PARAM_SHARE_SOURCE, num);
        }
        n0.g().w(EVENT_SHARE_POPUP_EXPOSURE, map);
    }

    private String parseSharePhoneNumber(String params) {
        try {
            if (TextUtils.isEmpty(params)) {
                return null;
            }
            return new JSONObject(params).optString(PARAM_SHARE_PHONE_NUMBER);
        } catch (Exception unused) {
            return null;
        }
    }

    private String resolveSmsPackageName() {
        ActivityInfo activityInfo;
        ActivityInfo activityInfo2;
        if (!TextUtils.isEmpty(this.mSmsPackageName)) {
            return this.mSmsPackageName;
        }
        try {
            PackageManager packageManager = this.mContext.getPackageManager();
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("smsto:"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity != null && (activityInfo2 = resolveInfoResolveActivity.activityInfo) != null && !TextUtils.isEmpty(activityInfo2.packageName) && !"android".equals(resolveInfoResolveActivity.activityInfo.packageName)) {
                String str = resolveInfoResolveActivity.activityInfo.packageName;
                this.mSmsPackageName = str;
                return str;
            }
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            if (listQueryIntentActivities != null) {
                for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                    if (resolveInfo != null && (activityInfo = resolveInfo.activityInfo) != null && !TextUtils.isEmpty(activityInfo.packageName) && !"android".equals(resolveInfo.activityInfo.packageName)) {
                        String str2 = resolveInfo.activityInfo.packageName;
                        this.mSmsPackageName = str2;
                        return str2;
                    }
                }
            }
            String strFindSmsPackageFromShareApps = findSmsPackageFromShareApps();
            this.mSmsPackageName = strFindSmsPackageFromShareApps;
            return strFindSmsPackageFromShareApps;
        } catch (Exception unused) {
        }
    }

    private void shareStatic(ShareAppInfo data) {
        HashMap map = new HashMap();
        map.put("ShareBusinessType", Integer.valueOf(this.mShareBusinessType));
        map.put("ShareLabel", data.label);
        n0.g().n("ShareDialogItemClick", map);
        logShareChannelClick(data);
    }

    private void shareToSmsWithPhone() {
        String localPhoneForDisplay = getLocalPhoneForDisplay(this.mSharePhoneNumber);
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("smsto:" + localPhoneForDisplay));
        intent.putExtra("sms_body", this.mShareText);
        intent.putExtra("android.intent.extra.TEXT", this.mShareText);
        ActivityUtils.startActivity(intent);
    }

    private void shareToWhatsAppWithPhone() {
        String whatsAppPhoneDigits = getWhatsAppPhoneDigits(this.mSharePhoneNumber);
        String str = this.mShareText;
        if (str == null) {
            str = "";
        }
        StringBuilder sbQ = q0.q("https://api.whatsapp.com/send?phone=", whatsAppPhoneDigits, "&text=");
        sbQ.append(Uri.encode(str));
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sbQ.toString()));
        intent.setPackage(PKG_WHATSAPP);
        ActivityUtils.startActivity(intent);
    }

    private boolean shouldSkipContactQuery() {
        int i7 = this.mShareBusinessType;
        return i7 == 16 || i7 == 26 || i7 == 47 || i7 == 45;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (isActivityValid(getContext())) {
            super.dismiss();
            p103gf.a aVar = this.mCompositeDisposable;
            if (aVar != null) {
                aVar.dispose();
                this.mCompositeDisposable = null;
            }
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(p025ba.g.core_dialog_share);
        this.mCompositeDisposable = new p103gf.a();
        if (!shouldSkipContactQuery() && !this.ignoreContactArea) {
            queryPalmPayContact();
        }
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = -2;
        window.setAttributes(attributes);
        p185ma.e eVar = new p185ma.e(this, 5);
        this.viewShareText = findViewById(p025ba.e.viewShareText);
        findViewById(p025ba.e.ivCopyText).setOnClickListener(eVar);
        this.tvShareText = (TextView) findViewById(p025ba.e.tvShareText);
        this.tvShareText2 = (TextView) findViewById(p025ba.e.tvShareText2);
        this.mTvTitle = (TextView) findViewById(p025ba.e.tvTitle);
        this.mBottomArea = findViewById(p025ba.e.cds_bottom_area);
        View viewFindViewById = findViewById(p025ba.e.cds_more_container);
        this.mMoreContainer = viewFindViewById;
        viewFindViewById.setOnClickListener(eVar);
        this.mQrCodeContainer = findViewById(p025ba.e.cds_qr_code_container);
        this.mCopyLinkContainer = findViewById(p025ba.e.cds_copy_link_container);
        this.mContactsRcv = (RecyclerView) findViewById(p025ba.e.cds_contact_rcv);
        this.mContactsArea = findViewById(p025ba.e.contacts_area);
        this.mContactsRcv.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
        G g7 = new G(this.mContext);
        this.mContactsAdapter = g7;
        List<PalmPayContact> list = this.mContactsList;
        if (list != null) {
            g7.f4985b = list;
        }
        this.mContactsRcv.setAdapter(g7);
        final int i7 = 0;
        this.mContactsAdapter.f4986c = new BaseRecyclerViewAdapter$ItemViewOnClickListener(this) { // from class: ma.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShareDialog f39617b;

            {
                this.f39617b = this;
            }

            @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
            public final void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
                switch (i7) {
                    case 0:
                        this.f39617b.lambda$initViews$0(view, (PalmPayContact) obj, viewHolder);
                        break;
                    default:
                        this.f39617b.lambda$initViews$1(view, (ShareAppInfo) obj, viewHolder);
                        break;
                }
            }
        };
        ImageView imageView = (ImageView) findViewById(p025ba.e.ivClose);
        this.mIvClose = imageView;
        imageView.setOnClickListener(eVar);
        this.mQrCodeContainer.setOnClickListener(eVar);
        this.mCopyLinkContainer.setOnClickListener(eVar);
        this.mAppsRcv = (RecyclerView) findViewById(p025ba.e.cds_app_rcv);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.mContext, 5);
        this.mAppsLayoutManager = gridLayoutManager;
        this.mAppsRcv.setLayoutManager(gridLayoutManager);
        X x3 = new X(this.mContext);
        this.mShareAppAdapter = x3;
        x3.f4985b = buildDefaultShareApps();
        this.mAppsRcv.setAdapter(this.mShareAppAdapter);
        this.mShareChannelArea = findViewById(p025ba.e.viewShareChannelArea);
        this.mIvTitle = (ImageView) findViewById(p025ba.e.ivTitle);
        RecyclerView recyclerView = (RecyclerView) findViewById(p025ba.e.rvShareChannelList);
        this.mShareChannelRcv = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
        Z z3 = new Z(this.mContext);
        this.mShareChannelAdapter = z3;
        this.mShareChannelRcv.setAdapter(z3);
        Qb.c cVar = new Qb.c(12, 0, 0, 0);
        cVar.f7664c = SizeUtils.dp2px(0);
        this.mShareChannelRcv.addItemDecoration(cVar);
        final int i10 = 1;
        this.mShareAppAdapter.f4986c = new BaseRecyclerViewAdapter$ItemViewOnClickListener(this) { // from class: ma.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShareDialog f39617b;

            {
                this.f39617b = this;
            }

            @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
            public final void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
                switch (i10) {
                    case 0:
                        this.f39617b.lambda$initViews$0(view, (PalmPayContact) obj, viewHolder);
                        break;
                    default:
                        this.f39617b.lambda$initViews$1(view, (ShareAppInfo) obj, viewHolder);
                        break;
                }
            }
        };
        this.mBottomArea.setVisibility(8);
        this.mMoreContainer.setVisibility(8);
        this.mCopyLinkContainer.setVisibility(8);
        this.mQrCodeContainer.setVisibility(8);
        visibleLayout();
        applyPhoneInviteTitleIfNeeded();
    }

    public void queryPalmPayContact() {
        ((PayApiService) p324va.c.f43141a.f14621b).queryMemberContactsList().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new p185ma.q(this));
    }

    public void setContactsList(List<PalmPayContact> contactsList) {
        if (contactsList == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(contactsList);
        this.mContactsList = arrayList;
        boolean zIsEmpty = arrayList.isEmpty();
        this.mShowContactArea = !zIsEmpty;
        View view = this.mContactsArea;
        if (view != null) {
            view.setVisibility(!zIsEmpty ? 0 : 8);
        }
        G g7 = this.mContactsAdapter;
        if (g7 != null) {
            g7.f4985b = contactsList;
            g7.notifyDataSetChanged();
        }
    }

    public void setH5ShareText(int businessType, String h5ShareText, String params) {
        this.mShareBusinessType = businessType;
        this.mShareText = h5ShareText;
        this.mParams = params;
        String sharePhoneNumber = parseSharePhoneNumber(params);
        if (!TextUtils.isEmpty(sharePhoneNumber)) {
            setSharePhoneNumber(sharePhoneNumber);
        }
        if (createShareUrl(params)) {
            commonShare(new CommonShareReq(this.mShareBusinessType, this.mParams));
        }
    }

    public void setIgnoreContactArea(boolean ignoreContactArea) {
        this.ignoreContactArea = ignoreContactArea;
    }

    public void setReferEarnId(String referEarnId) {
        this.mReferEarnId = referEarnId;
        int i7 = this.mShareBusinessType;
        if (i7 == 16) {
            commonShare(new CommonShareReq(i7, referEarnId));
        }
    }

    public void setSendMoneyOrderNo(String sendMoneyOrderNo) {
        this.mSendMoneyOrderNo = sendMoneyOrderNo;
        int i7 = this.mShareBusinessType;
        if (i7 == 26) {
            commonShare(new CommonShareReq(i7, sendMoneyOrderNo));
        }
    }

    public void setShareBusinessType(int shareBusinessType) {
        setShareBusinessType(shareBusinessType, null);
    }

    public void setShareBusinessTypeWithEntrySource(int shareBusinessType, int source) {
        this.mShareSource = Integer.valueOf(source);
        setShareBusinessType(shareBusinessType, "{\"entrySource\":" + source + "}");
    }

    public void setSharePhoneNumber(String phoneNumber) {
        this.mSharePhoneNumber = phoneNumber;
        applyPhoneInviteTitleIfNeeded();
    }

    public void setTitle(String title) {
        TextView textView = this.mTvTitle;
        if (textView != null) {
            textView.setText(title);
        }
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        if (isActivityValid(getContext())) {
            super.show();
            logSharePopupExposure();
            if (TextUtils.isEmpty(this.mSharePhoneNumber)) {
                return;
            }
            ClipboardUtils.copyText(this.mSharePhoneNumber);
            ToastUtils.showLong("Number copied successfully.");
        }
    }

    public void showCopyLink(boolean show) {
        this.showCopyLink = show;
    }

    public void showMore(boolean show) {
        this.showMore = show;
    }

    public void showQrCode(boolean show) {
        this.showQrCode = show;
    }

    public void visibleLayout() {
        if (this.showCopyLink) {
            this.mBottomArea.setVisibility(0);
            this.mCopyLinkContainer.setVisibility(0);
        }
        if (this.showQrCode) {
            this.mBottomArea.setVisibility(0);
            this.mQrCodeContainer.setVisibility(0);
        }
        if (this.showMore) {
            this.mMoreContainer.setVisibility(0);
        }
        this.mContactsArea.setVisibility(this.mShowContactArea ? 0 : 8);
    }

    public void setShareBusinessType(int shareBusinessType, String params) {
        this.mShareBusinessType = shareBusinessType;
        if (shareBusinessType == 16) {
            if (TextUtils.isEmpty(this.mReferEarnId)) {
                return;
            }
            commonShare(new CommonShareReq(shareBusinessType, this.mReferEarnId));
            return;
        }
        if (shareBusinessType != 17) {
            if (shareBusinessType == 26) {
                if (TextUtils.isEmpty(this.mSendMoneyOrderNo)) {
                    return;
                }
                commonShare(new CommonShareReq(shareBusinessType, this.mSendMoneyOrderNo));
                return;
            } else if (shareBusinessType != 45 && shareBusinessType != 47) {
                return;
            }
        }
        commonShare(new CommonShareReq(shareBusinessType, params));
    }

    public ShareDialog(Context context, int layoutId) {
        super(context, layoutId);
        this.ignoreContactArea = false;
        this.mShareBusinessType = -1;
        this.mShareText = "";
        this.mParams = "";
    }

    public ShareDialog(Context context, int layoutId, int styleId) {
        super(context, layoutId, styleId);
        this.ignoreContactArea = false;
        this.mShareBusinessType = -1;
        this.mShareText = "";
        this.mParams = "";
    }
}
