package V5;

import com.nimbusds.jose.shaded.gson.JsonDeserializer;
import com.nimbusds.jose.shaded.gson.JsonSerializer;
import com.nimbusds.jose.shaded.gson.z;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonSerializer f10050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonDeserializer f10051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.nimbusds.jose.shaded.gson.m f10052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.nimbusds.jose.shaded.gson.reflect.a f10053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Oe.a f10054e = new Oe.a(this, 9);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile z f10056g;

    public t(JsonSerializer jsonSerializer, JsonDeserializer jsonDeserializer, com.nimbusds.jose.shaded.gson.m mVar, com.nimbusds.jose.shaded.gson.reflect.a aVar, boolean z3) {
        this.f10050a = jsonSerializer;
        this.f10051b = jsonDeserializer;
        this.f10052c = mVar;
        this.f10053d = aVar;
        this.f10055f = z3;
    }

    @Override // com.nimbusds.jose.shaded.gson.z
    public final Object a(com.nimbusds.jose.shaded.gson.stream.b bVar) {
        boolean z3;
        com.nimbusds.jose.shaded.gson.o oVar;
        JsonDeserializer jsonDeserializer = this.f10051b;
        if (jsonDeserializer == null) {
            z zVarE = this.f10056g;
            if (zVarE == null) {
                zVarE = this.f10052c.e(null, this.f10053d);
                this.f10056g = zVarE;
            }
            return zVarE.a(bVar);
        }
        try {
            try {
                bVar.w();
                z3 = false;
                try {
                    oVar = (com.nimbusds.jose.shaded.gson.o) w.f10087z.a(bVar);
                } catch (EOFException e10) {
                    e = e10;
                    if (!z3) {
                        throw new com.nimbusds.jose.shaded.gson.p(10, e);
                    }
                    oVar = com.nimbusds.jose.shaded.gson.q.f23687a;
                }
            } catch (EOFException e11) {
                e = e11;
                z3 = true;
            }
            if (this.f10055f) {
                oVar.getClass();
                if (oVar instanceof com.nimbusds.jose.shaded.gson.q) {
                    return null;
                }
            }
            return jsonDeserializer.deserialize(oVar, this.f10053d.f23690b, this.f10054e);
        } catch (com.nimbusds.jose.shaded.gson.stream.d e12) {
            throw new com.nimbusds.jose.shaded.gson.p(10, e12);
        } catch (IOException e13) {
            throw new com.nimbusds.jose.shaded.gson.p(10, e13);
        } catch (NumberFormatException e14) {
            throw new com.nimbusds.jose.shaded.gson.p(10, e14);
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.z
    public final void b(com.nimbusds.jose.shaded.gson.stream.c cVar, Object obj) throws IOException {
        JsonSerializer jsonSerializer = this.f10050a;
        if (jsonSerializer == null) {
            z zVarE = this.f10056g;
            if (zVarE == null) {
                zVarE = this.f10052c.e(null, this.f10053d);
                this.f10056g = zVarE;
            }
            zVarE.b(cVar, obj);
            return;
        }
        if (this.f10055f && obj == null) {
            cVar.i();
            return;
        }
        com.nimbusds.jose.shaded.gson.o oVarSerialize = jsonSerializer.serialize(obj, this.f10053d.f23690b, this.f10054e);
        u uVar = w.f10063a;
        l.d(cVar, oVarSerialize);
    }

    @Override // V5.s
    public final z c() {
        if (this.f10050a != null) {
            return this;
        }
        z zVar = this.f10056g;
        if (zVar != null) {
            return zVar;
        }
        z zVarE = this.f10052c.e(null, this.f10053d);
        this.f10056g = zVarE;
        return zVarE;
    }
}
