package O7;

import com.transsnet.palmpay.core.base.BaseActivity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: O7.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0491i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0491i f6662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0491i f6663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC0491i[] f6664c;

    static {
        EnumC0491i enumC0491i = new EnumC0491i(BaseActivity.ENTER_EVENT, 0);
        f6662a = enumC0491i;
        EnumC0491i enumC0491i2 = new EnumC0491i("EXIT", 1);
        f6663b = enumC0491i2;
        EnumC0491i[] enumC0491iArr = {enumC0491i, enumC0491i2};
        f6664c = enumC0491iArr;
        com.facebook.imagepipeline.nativecode.b.n(enumC0491iArr);
    }

    public static EnumC0491i valueOf(String str) {
        return (EnumC0491i) Enum.valueOf(EnumC0491i.class, str);
    }

    public static EnumC0491i[] values() {
        return (EnumC0491i[]) f6664c.clone();
    }
}
