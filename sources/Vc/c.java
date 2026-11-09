package Vc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    @NotNull
    public static final b Companion = new b(null);
    public static final int STATUS_CANCELED = 5;
    public static final int STATUS_COMPLETE = 4;
    public static final int STATUS_WAITING_TO_ACCEPT_ORDER = 1;
    public static final int STATUS_WAITING_TO_PAY = 3;
    public static final int STATUS_WAITING_TO_WITHDRAWAL = 2;
    private long amount;
    private long appointTime;
    private long balanceAmount;
    private long chronologyBeginTime;
    private long chronologyEndTime;
    private long completionTime;
    private long createTime;
    private long currentSystemTime;
    private long depositAmount;
    private long endTime;
    private long finishTime;
    private boolean isChanged;
    private boolean isMissed;
    private long localCurrentTime;
    private int start;
    private long startTime;
    private int status;
    private int end = 1;

    @Nullable
    private String agentName = "";

    @Nullable
    private String bookingCode = "";

    @NotNull
    private String uniqueId = "";

    public final void A(long j6) {
        this.chronologyBeginTime = j6;
    }

    public final void B(long j6) {
        this.chronologyEndTime = j6;
    }

    public final void C(long j6) {
        this.completionTime = j6;
    }

    public final void D(long j6) {
        this.createTime = j6;
    }

    public final void E(long j6) {
        this.currentSystemTime = j6;
    }

    public final void F(long j6) {
        this.depositAmount = j6;
    }

    public final void G(int i7) {
        this.end = i7;
    }

    public final void H(long j6) {
        this.endTime = j6;
    }

    public final void I(long j6) {
        this.finishTime = j6;
    }

    public final void J(long j6) {
        this.localCurrentTime = j6;
    }

    public final void K(boolean z3) {
        this.isMissed = z3;
    }

    public final void L(int i7) {
        this.start = i7;
    }

    public final void M(long j6) {
        this.startTime = j6;
    }

    public final void N(int i7) {
        this.status = i7;
    }

    public final void O(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uniqueId = str;
    }

    public final String a() {
        return this.agentName;
    }

    public final long b() {
        return this.amount;
    }

    public final long c() {
        return this.appointTime;
    }

    public final long d() {
        return this.balanceAmount;
    }

    public final String e() {
        return this.bookingCode;
    }

    public final long f() {
        return this.chronologyBeginTime;
    }

    public final long g() {
        return this.chronologyEndTime;
    }

    public final long h() {
        return this.completionTime;
    }

    public final long i() {
        return this.createTime;
    }

    public final long j() {
        return this.currentSystemTime;
    }

    public final long k() {
        return this.depositAmount;
    }

    public final int l() {
        return this.end;
    }

    public final long m() {
        return this.endTime;
    }

    public final long n() {
        return this.localCurrentTime;
    }

    public final int o() {
        return this.start;
    }

    public final long p() {
        return this.startTime;
    }

    public final int q() {
        return this.status;
    }

    public final String r() {
        return this.uniqueId;
    }

    public final boolean s() {
        return this.isChanged;
    }

    public final boolean t() {
        return this.isMissed;
    }

    public final void u(String str) {
        this.agentName = str;
    }

    public final void v(long j6) {
        this.amount = j6;
    }

    public final void w(long j6) {
        this.appointTime = j6;
    }

    public final void x(long j6) {
        this.balanceAmount = j6;
    }

    public final void y(String str) {
        this.bookingCode = str;
    }

    public final void z(boolean z3) {
        this.isChanged = z3;
    }
}
