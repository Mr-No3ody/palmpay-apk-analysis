package p156ka;

import android.text.TextUtils;
import com.transsnet.adsdk.AdManager;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.MemberInfo;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.network.api.MemberApiService;
import df.d;
import io.reactivex.internal.operators.observable.C1760l;
import io.reactivex.internal.operators.observable.K;
import p141j9.C1794b;
import p298tf.f;
import p324va.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public User f38720a;

    public static void c(User user) {
        if (user == null) {
            return;
        }
        BaseApplication.getInstance().getUser(true);
    }

    public final K a() {
        d<CommonBeanResult<MemberInfo>> dVarQueryCurMemberInfo = ((MemberApiService) c.f43141a.f14622c).queryCurMemberInfo(true);
        C1794b c1794b = new C1794b(this, 8);
        dVarQueryCurMemberInfo.getClass();
        return new C1760l(dVarQueryCurMemberInfo, c1794b, 2).k(f.f42629b);
    }

    public final User b() {
        if (this.f38720a == null) {
            this.f38720a = new User().load();
        }
        return this.f38720a;
    }

    public final void d(MemberInfo memberInfo, boolean z3) {
        User userB = b();
        String str = memberInfo.memberId;
        if (TextUtils.isEmpty(str)) {
            throw null;
        }
        if (!userB.getMemberId().equals(str)) {
            this.f38720a.clear();
            userB = new User();
            this.f38720a = userB;
        }
        if (!TextUtils.isEmpty(memberInfo.firstName)) {
            userB.setFirstName(memberInfo.firstName);
        }
        if (!TextUtils.isEmpty(memberInfo.lastName)) {
            userB.setLastName(memberInfo.lastName);
        }
        if (!TextUtils.isEmpty(memberInfo.memberId)) {
            userB.setMemberId(memberInfo.memberId);
            p367ya.a aVarD = p367ya.a.d();
            aVarD.f44149a.i("member_id", memberInfo.memberId);
        }
        userB.setMiddleName(memberInfo.middleName);
        if (!TextUtils.isEmpty(memberInfo.nickName)) {
            userB.setNickName(memberInfo.nickName);
        }
        if (!TextUtils.isEmpty(memberInfo.fullName)) {
            userB.setFullName(memberInfo.fullName);
        }
        if (!TextUtils.isEmpty(memberInfo.phone)) {
            userB.setPhoneNumber(memberInfo.phone);
            userB.setCountryCode(memberInfo.phone.substring(0, 4));
            if (!memberInfo.phone.equals(p367ya.a.d().g())) {
                p367ya.a aVarD2 = p367ya.a.d();
                aVarD2.f44149a.i("last_phone_number", memberInfo.phone);
            }
        }
        userB.setAccountMobile(memberInfo.identitiesPhone);
        if (!TextUtils.isEmpty(memberInfo.countryCode)) {
            userB.setCountryLocale(memberInfo.countryCode);
            BaseApplication.updateCountryConfig(memberInfo.countryCode);
        }
        userB.setEmail(memberInfo.userEmail);
        userB.setBirthday(memberInfo.birthday);
        userB.setBirthdayHide(memberInfo.birthdayHide);
        userB.setSvaStatus(memberInfo.svaStatus);
        userB.setGender(memberInfo.gender);
        userB.setPremiumState(memberInfo.vipMemberStatus);
        userB.setTeenager(memberInfo.teenager);
        if (!TextUtils.isEmpty(memberInfo.invitationEntrance)) {
            userB.setInvitation(memberInfo.invitationEntrance);
        }
        if (!TextUtils.isEmpty(memberInfo.mobileMoneyAccountTier)) {
            userB.setMobileMoneyAccountTier(memberInfo.mobileMoneyAccountTier);
        }
        if (TextUtils.isEmpty(memberInfo.headPortrait) || !memberInfo.headPortrait.startsWith("http://")) {
            userB.setAvatar(memberInfo.headPortrait);
        } else {
            userB.setAvatar(memberInfo.headPortrait.replace("http://", "https://"));
        }
        userB.setBvnCode(memberInfo.bvn);
        userB.setUpdateNameFlag(memberInfo.isUpdate);
        userB.setIsAuthen(memberInfo.nameVerified ? 1 : 0);
        userB.setMobileNameAuthFlag(memberInfo.phoneNameVerfication);
        userB.setPalmPayTag(memberInfo.palmPayTag);
        userB.setCreateTime(memberInfo.createTime);
        userB.setDisplayAccountNumber(memberInfo.accountNumber);
        userB.setAccountNumber(memberInfo.loginName);
        userB.setLoginPswFlag(memberInfo.hasLoginPassword);
        userB.setEnableLoginPswFlag(memberInfo.useLoginPassword);
        if (z3 && !TextUtils.isEmpty(memberInfo.accountId)) {
            userB.setBalanceAccountId(memberInfo.accountId);
        }
        if (TextUtils.isEmpty(userB.getMemberId()) || TextUtils.isEmpty(userB.getPhoneNumber())) {
            throw null;
        }
        if (!TextUtils.isEmpty(userB.getCountryCode())) {
            BaseApplication.updateCountryConfig(userB.getCountryLocale());
        }
        BaseApplication.getInstance().getUser(true);
        AdManager.setUserId(userB.getMemberId());
        AdManager.setExtraId(userB.getPhoneNumber());
    }
}
