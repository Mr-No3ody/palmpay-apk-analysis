package Vc;

import java.util.List;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private boolean adFlag;

    @Nullable
    private String agentId;
    private double distance;
    private boolean isRecent;
    private boolean isShowTile;
    private double lat;
    private double lon;

    @Nullable
    private String uniqueId;

    @Nullable
    private String name = "";

    @Nullable
    private String address = "";

    @Nullable
    private String phone = "";

    @NotNull
    private String title = "";

    @NotNull
    private List<String> labels = z.f38935a;

    @NotNull
    private String origin = "{}";

    public final boolean a() {
        return this.adFlag;
    }

    public final String b() {
        return this.address;
    }

    public final double c() {
        return this.distance;
    }

    public final List d() {
        return this.labels;
    }

    public final double e() {
        return this.lat;
    }

    public final double f() {
        return this.lon;
    }

    public final String g() {
        return this.name;
    }

    public final String h() {
        return this.origin;
    }

    public final String i() {
        return this.phone;
    }

    public final String j() {
        return this.title;
    }

    public final boolean k() {
        return this.isShowTile;
    }

    public final void l() {
        this.adFlag = true;
    }

    public final void m(String str) {
        this.address = str;
    }

    public final void n(String str) {
        this.agentId = str;
    }

    public final void o(double d2) {
        this.distance = d2;
    }

    public final void p(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.labels = list;
    }

    public final void q(double d2) {
        this.lat = d2;
    }

    public final void r(double d2) {
        this.lon = d2;
    }

    public final void s(String str) {
        this.name = str;
    }

    public final void t(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.origin = str;
    }

    public final void u(String str) {
        this.phone = str;
    }

    public final void v() {
        this.isShowTile = true;
    }

    public final void w(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void x(String str) {
        this.uniqueId = str;
    }
}
