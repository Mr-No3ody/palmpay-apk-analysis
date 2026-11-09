package W3;

import com.google.android.gms.common.Scopes;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b9\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\t\n\u0002\b\"\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR$\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR$\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR$\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR$\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR$\u0010 \u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\nR$\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\b\"\u0004\b%\u0010\nR$\u0010&\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0006\u001a\u0004\b'\u0010\b\"\u0004\b(\u0010\nR$\u0010)\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\b\"\u0004\b+\u0010\nR$\u0010,\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0006\u001a\u0004\b-\u0010\b\"\u0004\b.\u0010\nR$\u0010/\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\b\"\u0004\b1\u0010\nR$\u00102\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0006\u001a\u0004\b3\u0010\b\"\u0004\b4\u0010\nR$\u00105\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\b\"\u0004\b7\u0010\nR$\u00108\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0006\u001a\u0004\b9\u0010\b\"\u0004\b:\u0010\nR$\u0010;\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\b\"\u0004\b=\u0010\nR\"\u0010?\u001a\u00020>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\b?\u0010A\"\u0004\bB\u0010CR\"\u0010D\u001a\u00020>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010@\u001a\u0004\bE\u0010A\"\u0004\bF\u0010CR\"\u0010H\u001a\u00020G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010N\u001a\u00020>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010@\u001a\u0004\bO\u0010A\"\u0004\bP\u0010CR$\u0010Q\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010\u0006\u001a\u0004\bR\u0010\b\"\u0004\bS\u0010\nR$\u0010T\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010\u0006\u001a\u0004\bU\u0010\b\"\u0004\bV\u0010\nR$\u0010W\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010\u0006\u001a\u0004\bX\u0010\b\"\u0004\bY\u0010\nR$\u0010Z\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010\u0006\u001a\u0004\b[\u0010\b\"\u0004\b\\\u0010\nR$\u0010]\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010\u0006\u001a\u0004\b^\u0010\b\"\u0004\b_\u0010\nR$\u0010`\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010\u0006\u001a\u0004\ba\u0010\b\"\u0004\bb\u0010\nR$\u0010c\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010\u0006\u001a\u0004\bd\u0010\b\"\u0004\be\u0010\nR\"\u0010g\u001a\u00020f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR$\u0010m\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010\u0006\u001a\u0004\bn\u0010\b\"\u0004\bo\u0010\nR$\u0010p\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010\u0006\u001a\u0004\bq\u0010\b\"\u0004\br\u0010\nR\"\u0010s\u001a\u00020f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010h\u001a\u0004\bt\u0010j\"\u0004\bu\u0010lR\"\u0010v\u001a\u00020f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010h\u001a\u0004\bw\u0010j\"\u0004\bx\u0010lR$\u0010y\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010\u0006\u001a\u0004\bz\u0010\b\"\u0004\b{\u0010\nR$\u0010|\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010\u0006\u001a\u0004\b}\u0010\b\"\u0004\b~\u0010\nR&\u0010\u007f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u007f\u0010\u0006\u001a\u0005\b\u0080\u0001\u0010\b\"\u0005\b\u0081\u0001\u0010\nR&\u0010\u0082\u0001\u001a\u00020G8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010I\u001a\u0005\b\u0083\u0001\u0010K\"\u0005\b\u0084\u0001\u0010MR&\u0010\u0085\u0001\u001a\u00020G8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010I\u001a\u0005\b\u0086\u0001\u0010K\"\u0005\b\u0087\u0001\u0010M¨\u0006\u0088\u0001"}, d2 = {"LW3/h;", "", "<init>", "()V", "", "birthday", "Ljava/lang/String;", "getBirthday", "()Ljava/lang/String;", "setBirthday", "(Ljava/lang/String;)V", "accountId", "getAccountId", "setAccountId", "bvn", "getBvn", "setBvn", "identitiesPhone", "getIdentitiesPhone", "setIdentitiesPhone", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "getCountryCode", "setCountryCode", Scopes.EMAIL, "getEmail", "setEmail", "userEmail", "getUserEmail", "setUserEmail", "firstName", "getFirstName", "setFirstName", "middleName", "getMiddleName", "setMiddleName", "lastName", "getLastName", "setLastName", "fullName", "getFullName", "setFullName", "nickName", "getNickName", "setNickName", "gender", "getGender", "setGender", "headPortrait", "getHeadPortrait", "setHeadPortrait", "memberId", "getMemberId", "setMemberId", "phone", "getPhone", "setPhone", "mobileMoneyAccountTier", "getMobileMoneyAccountTier", "setMobileMoneyAccountTier", "invitationEntrance", "getInvitationEntrance", "setInvitationEntrance", "", "isUpdate", "I", "()I", "setUpdate", "(I)V", "svaStatus", "getSvaStatus", "setSvaStatus", "", "authen", "Z", "getAuthen", "()Z", "setAuthen", "(Z)V", "phoneNameVerfication", "getPhoneNameVerfication", "setPhoneNameVerfication", "authIdType", "getAuthIdType", "setAuthIdType", "authIdNum", "getAuthIdNum", "setAuthIdNum", "palmPayTag", "getPalmPayTag", "setPalmPayTag", "facebookId", "getFacebookId", "setFacebookId", "facebookName", "getFacebookName", "setFacebookName", "facebookEmail", "getFacebookEmail", "setFacebookEmail", "facebookPicture", "getFacebookPicture", "setFacebookPicture", "", "createTime", "J", "getCreateTime", "()J", "setCreateTime", "(J)V", "mailAuthstatus", "getMailAuthstatus", "setMailAuthstatus", "mailAuthDesc", "getMailAuthDesc", "setMailAuthDesc", "lastLoginTime", "getLastLoginTime", "setLastLoginTime", "currentLoginTime", "getCurrentLoginTime", "setCurrentLoginTime", "birthdayHide", "getBirthdayHide", "setBirthdayHide", "accountNumber", "getAccountNumber", "setAccountNumber", "loginName", "getLoginName", "setLoginName", "hasLoginPassword", "getHasLoginPassword", "setHasLoginPassword", "hasPayPassword", "getHasPayPassword", "setHasPayPassword", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    @Nullable
    private String accountId;

    @Nullable
    private String accountNumber;

    @Nullable
    private String authIdNum;

    @Nullable
    private String authIdType;
    private boolean authen;

    @Nullable
    private String birthday;

    @Nullable
    private String birthdayHide;

    @Nullable
    private String bvn;

    @Nullable
    private String countryCode;
    private long createTime;
    private long currentLoginTime;

    @Nullable
    private String email;

    @Nullable
    private String facebookEmail;

    @Nullable
    private String facebookId;

    @Nullable
    private String facebookName;

    @Nullable
    private String facebookPicture;

    @Nullable
    private String firstName;

    @Nullable
    private String fullName;

    @Nullable
    private String gender;
    private boolean hasLoginPassword;
    private boolean hasPayPassword;

    @Nullable
    private String headPortrait;

    @Nullable
    private String identitiesPhone;

    @Nullable
    private String invitationEntrance;
    private int isUpdate;
    private long lastLoginTime;

    @Nullable
    private String lastName;

    @Nullable
    private String loginName;

    @Nullable
    private String mailAuthDesc;

    @Nullable
    private String mailAuthstatus;

    @Nullable
    private String memberId;

    @Nullable
    private String middleName;

    @Nullable
    private String mobileMoneyAccountTier;

    @Nullable
    private String nickName;

    @Nullable
    private String palmPayTag;

    @Nullable
    private String phone;
    private int phoneNameVerfication;
    private int svaStatus;

    @Nullable
    private String userEmail;
}
