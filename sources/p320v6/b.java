package p320v6;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.io.File;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements JsonSerializer {
    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(((File) obj).getName());
    }
}
