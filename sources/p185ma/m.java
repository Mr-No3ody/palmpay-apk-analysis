package p185ma;

import com.transsnet.palmpay.core.base.BaseApplication;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f39611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f39612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Integer[] f39613c;

    static {
        BaseApplication baseApplication = BaseApplication.get();
        f39611a = new String[]{baseApplication.getString(k.core_monday), baseApplication.getString(k.core_tuesday), baseApplication.getString(k.core_wednesday), baseApplication.getString(k.core_thursday), baseApplication.getString(k.core_friday), baseApplication.getString(k.core_saturday), baseApplication.getString(k.core_sunday)};
        f39612b = new String[]{"6:00am", "10:00am", "2:00pm", "6:00pm", "10:00pm"};
        f39613c = new Integer[]{6, 10, 14, 18, 22};
    }
}
