package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import org.jetbrains.annotations.NotNull;
import p176lg.c;
import p176lg.j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "Llg/j;", "decodeJsonElement", "()Llg/j;", "Llg/c;", "getJson", "()Llg/c;", "json", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface JsonDecoder extends Decoder, CompositeDecoder {
    @NotNull
    j decodeJsonElement();

    @NotNull
    c getJson();
}
