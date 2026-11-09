package p324va;

import Pg.j;
import Pg.k;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import okhttp3.L;
import okhttp3.c0;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Converter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L f43136c = L.f40589e.get("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f43137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeAdapter f43138b;

    public a(Gson gson, TypeAdapter typeAdapter) {
        this.f43137a = gson;
        this.f43138b = typeAdapter;
    }

    @Override // retrofit2.Converter
    public final Object convert(Object obj) throws IOException {
        k kVar = new k();
        JsonWriter jsonWriterNewJsonWriter = this.f43137a.newJsonWriter(new OutputStreamWriter(new j(kVar, 0), StandardCharsets.UTF_8));
        this.f43138b.write(jsonWriterNewJsonWriter, obj);
        jsonWriterNewJsonWriter.close();
        return c0.create(f43136c, kVar.readByteString(kVar.f7358b));
    }
}
