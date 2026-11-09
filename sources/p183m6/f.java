package p183m6;

import Ef.a;
import Ff.h;
import android.util.Log;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.config.api.bean.ConfigRsp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.B;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public B f39500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B f39502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f39503d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(B b7, i iVar, Continuation continuation) {
        super(1, continuation);
        this.f39502c = b7;
        this.f39503d = iVar;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new f(this.f39502c, this.f39503d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((f) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        B b7;
        Exception e10;
        a aVar = a.f2423a;
        int i7 = this.f39501b;
        i iVar = this.f39503d;
        if (i7 == 0) {
            g.M(obj);
            B b10 = new B();
            b10.f38947a = this.f39502c.f38947a;
            try {
                String str = iVar.f39512e;
                this.f39500a = b10;
                this.f39501b = 1;
                ConfigRsp configRspB = iVar.b(str, null);
                if (configRspB == aVar) {
                    return aVar;
                }
                b7 = b10;
                obj = configRspB;
            } catch (Exception e11) {
                b7 = b10;
                e10 = e11;
                Log.e("Config", "Error while fetching config from server", e10);
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b7 = this.f39500a;
            try {
                g.M(obj);
            } catch (Exception e12) {
                e10 = e12;
                Log.e("Config", "Error while fetching config from server", e10);
            }
        }
        ConfigRsp configRsp = (ConfigRsp) obj;
        if (configRsp != null) {
            iVar.f39515h = configRsp;
            i.a(iVar, iVar.f39510c, configRsp);
            b7.f38947a = true;
        }
        return Boolean.valueOf(b7.f38947a);
    }
}
