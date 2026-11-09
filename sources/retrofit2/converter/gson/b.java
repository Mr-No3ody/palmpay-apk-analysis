package retrofit2.converter.gson;

import Pg.j;
import Pg.k;
import com.adjust.sdk.Constants;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.L;
import okhttp3.c0;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Converter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L f41920c = L.f40589e.get("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f41921d = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f41922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeAdapter f41923b;

    public b(Gson gson, TypeAdapter typeAdapter) {
        this.f41922a = gson;
        this.f41923b = typeAdapter;
    }

    @Override // retrofit2.Converter
    public final Object convert(Object obj) throws IOException {
        k kVar = new k();
        JsonWriter jsonWriterNewJsonWriter = this.f41922a.newJsonWriter(new OutputStreamWriter(new j(kVar, 0), f41921d));
        this.f41923b.write(jsonWriterNewJsonWriter, obj);
        jsonWriterNewJsonWriter.close();
        return c0.create(f41920c, kVar.readByteString(kVar.f7358b));
    }
}
