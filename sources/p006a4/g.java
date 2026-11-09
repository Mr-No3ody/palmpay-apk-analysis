package p006a4;

import C0.G;
import androidx.camera.camera2.internal.F;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001CB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R$\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R$\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R$\u0010!\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R$\u0010$\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\r\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\u0011R$\u0010'\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\r\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011R$\u0010*\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\r\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010\u0011R$\u0010-\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\r\u001a\u0004\b.\u0010\u000f\"\u0004\b/\u0010\u0011R$\u00100\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\r\u001a\u0004\b1\u0010\u000f\"\u0004\b2\u0010\u0011R$\u00103\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\r\u001a\u0004\b4\u0010\u000f\"\u0004\b5\u0010\u0011R\"\u00106\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\u0006\u001a\u0004\b7\u0010\b\"\u0004\b8\u0010\nR$\u00109\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\r\u001a\u0004\b:\u0010\u000f\"\u0004\b;\u0010\u0011R\"\u0010=\u001a\u00020<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006D"}, d2 = {"La4/g;", "", "<init>", "()V", "", "menuId", "I", "getMenuId", "()I", "setMenuId", "(I)V", "", "iconId", "Ljava/lang/String;", "getIconId", "()Ljava/lang/String;", "setIconId", "(Ljava/lang/String;)V", "menuName", "getMenuName", "setMenuName", "iconUrl", "getIconUrl", "setIconUrl", "darkIconUrl", "getDarkIconUrl", "setDarkIconUrl", "iconUrlBig", "getIconUrlBig", "setIconUrlBig", "iconLottieUrl", "getIconLottieUrl", "setIconLottieUrl", "iconUrlUnSelected", "getIconUrlUnSelected", "setIconUrlUnSelected", "darkIconUrlUnSelected", "getDarkIconUrlUnSelected", "setDarkIconUrlUnSelected", "subIcon", "getSubIcon", "setSubIcon", "jumpPath", "getJumpPath", "setJumpPath", "jumpType", "getJumpType", "setJumpType", "resourceName", "getResourceName", "setResourceName", "jumpParams", "getJumpParams", "setJumpParams", "iconRes", "getIconRes", "setIconRes", "cornerText", "getCornerText", "setCornerText", "", "fromCache", "Z", "getFromCache", "()Z", "setFromCache", "(Z)V", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    @Nullable
    private String cornerText;

    @Nullable
    private String darkIconUrl;

    @Nullable
    private String darkIconUrlUnSelected;
    private boolean fromCache;

    @Nullable
    private String iconId;

    @Nullable
    private String iconLottieUrl;
    private int iconRes;

    @Nullable
    private String iconUrl;

    @Nullable
    private String iconUrlBig;

    @Nullable
    private String iconUrlUnSelected;

    @Nullable
    private String jumpParams;

    @Nullable
    private String jumpPath;

    @Nullable
    private String jumpType;
    private int menuId;

    @Nullable
    private String menuName;

    @Nullable
    private String resourceName;

    @Nullable
    private String subIcon;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"La4/g$a;", "", "<init>", "()V", "", "BOTTOM_TAB_HOME", "I", "BOTTOM_TAB_FINANCE", "BOTTOM_TAB_ZONE", "BOTTOM_TAB_ME", "BOTTOM_TAB_INVEST", "BOTTOM_TAB_GIVEAWAY", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public final String toString() {
        String str = this.menuName;
        String str2 = this.iconUrl;
        return G.s(F.f("FlexiBankHomeMenuBean{menuName='", str, "', iconUrl='", str2, "', resourceName='"), this.resourceName, "', iconLottieUrl='", this.iconLottieUrl, "'}");
    }
}
