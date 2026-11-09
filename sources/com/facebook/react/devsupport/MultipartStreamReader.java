package com.facebook.react.devsupport;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.net.HttpHeaders;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\b\u0000\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u0019\u001a\u00020\u00122\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/facebook/react/devsupport/MultipartStreamReader;", "", "Lokio/BufferedSource;", "source", "", "boundary", "<init>", "(Lokio/BufferedSource;Ljava/lang/String;)V", "LPg/k;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parseHeaders", "(LPg/k;)Ljava/util/Map;", "chunk", "", "done", "Lcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "emitChunk", "(LPg/k;ZLcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;)V", "headers", "", "contentLength", "isFinal", "emitProgress", "(Ljava/util/Map;JZLcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;)V", "readAllParts", "(Lcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;)Z", "Lokio/BufferedSource;", "Ljava/lang/String;", "lastProgressEvent", "J", "Companion", "ChunkListener", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMultipartStreamReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartStreamReader.kt\ncom/facebook/react/devsupport/MultipartStreamReader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,168:1\n739#2,9:169\n37#3:178\n36#3,3:179\n108#4:182\n80#4,22:183\n108#4:205\n80#4,22:206\n*S KotlinDebug\n*F\n+ 1 MultipartStreamReader.kt\ncom/facebook/react/devsupport/MultipartStreamReader\n*L\n116#1:169,9\n116#1:178\n116#1:179,3\n122#1:182\n122#1:183,22\n123#1:205\n123#1:206,22\n*E\n"})
public final class MultipartStreamReader {

    @NotNull
    private static final String CRLF = "\r\n";

    @NotNull
    private final String boundary;
    private long lastProgressEvent;

    @NotNull
    private final BufferedSource source;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J3\u0010\n\u001a\u00020\t2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u000f\u001a\u00020\t2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;", "", "", "", "headers", "LPg/k;", "body", "", "isLastChunk", "", "onChunkComplete", "(Ljava/util/Map;LPg/k;Z)V", "", "loaded", "total", "onChunkProgress", "(Ljava/util/Map;JJ)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ChunkListener {
        void onChunkComplete(@NotNull Map<String, String> headers, @NotNull Pg.k body, boolean isLastChunk) throws IOException;

        void onChunkProgress(@NotNull Map<String, String> headers, long loaded, long total) throws IOException;
    }

    public MultipartStreamReader(@NotNull BufferedSource source, @NotNull String boundary) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        this.source = source;
        this.boundary = boundary;
    }

    private final void emitChunk(Pg.k chunk, boolean done, ChunkListener listener) throws IOException {
        Pg.m mVarM4deprecated_encodeUtf8 = Pg.m.f7359d.m4deprecated_encodeUtf8("\r\n\r\n");
        long jIndexOf = chunk.indexOf(mVarM4deprecated_encodeUtf8);
        if (jIndexOf == -1) {
            listener.onChunkComplete(G.c(), chunk, done);
            return;
        }
        Pg.k kVar = new Pg.k();
        Pg.k kVar2 = new Pg.k();
        chunk.read(kVar, jIndexOf);
        chunk.skip(mVarM4deprecated_encodeUtf8.d());
        chunk.readAll(kVar2);
        listener.onChunkComplete(parseHeaders(kVar), kVar2, done);
    }

    private final void emitProgress(Map<String, String> headers, long contentLength, boolean isFinal, ChunkListener listener) throws IOException {
        if (listener == null || headers == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastProgressEvent > 16 || isFinal) {
            this.lastProgressEvent = jCurrentTimeMillis;
            listener.onChunkProgress(headers, contentLength, Long.parseLong(headers.getOrDefault(HttpHeaders.CONTENT_LENGTH, "0")));
        }
    }

    private final Map<String, String> parseHeaders(Pg.k data) {
        Collection collectionU;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listC = new Regex(CRLF).c(data.readUtf8());
        if (listC.isEmpty()) {
            collectionU = z.f38935a;
            break;
        }
        ListIterator listIterator = listC.listIterator(listC.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                collectionU = z.f38935a;
                break;
            }
            if (((String) listIterator.previous()).length() != 0) {
                collectionU = CollectionsKt.U(listC, listIterator.nextIndex() + 1);
                break;
            }
        }
        for (String str : (String[]) collectionU.toArray(new String[0])) {
            int iE = StringsKt.E(str, ":", 0, false, 6);
            if (iE != -1) {
                String strSubstring = str.substring(0, iE);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                int length = strSubstring.length() - 1;
                int i7 = 0;
                boolean z3 = false;
                while (i7 <= length) {
                    boolean z8 = Intrinsics.h(strSubstring.charAt(!z3 ? i7 : length), 32) <= 0;
                    if (z3) {
                        if (!z8) {
                            break;
                        }
                        length--;
                    } else if (z8) {
                        i7++;
                    } else {
                        z3 = true;
                    }
                }
                String string = strSubstring.subSequence(i7, length + 1).toString();
                String strSubstring2 = str.substring(iE + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                int length2 = strSubstring2.length() - 1;
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= length2) {
                    boolean z11 = Intrinsics.h(strSubstring2.charAt(!z10 ? i10 : length2), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        }
                        length2--;
                    } else if (z11) {
                        i10++;
                    } else {
                        z10 = true;
                    }
                }
                linkedHashMap.put(string, strSubstring2.subSequence(i10, length2 + 1).toString());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c0 A[SYNTHETIC] */
    public final boolean readAllParts(@NotNull ChunkListener listener) throws IOException {
        boolean z3;
        long j6;
        long j10;
        Map<String, String> map;
        ChunkListener listener2 = listener;
        Intrinsics.checkNotNullParameter(listener2, "listener");
        Pg.l lVar = Pg.m.f7359d;
        Pg.m mVarM4deprecated_encodeUtf8 = lVar.m4deprecated_encodeUtf8("\r\n--" + this.boundary + CRLF);
        Pg.m mVarM4deprecated_encodeUtf9 = lVar.m4deprecated_encodeUtf8("\r\n--" + this.boundary + "--\r\n");
        Pg.m mVarM4deprecated_encodeUtf10 = lVar.m4deprecated_encodeUtf8("\r\n\r\n");
        Pg.k kVar = new Pg.k();
        long j11 = 0L;
        long jD = 0;
        long jD2 = 0;
        Map<String, String> headers = null;
        while (true) {
            long jMax = (long) Math.max(j11 - ((long) mVarM4deprecated_encodeUtf9.d()), jD);
            long jIndexOf = kVar.indexOf(mVarM4deprecated_encodeUtf8, jMax);
            if (jIndexOf == -1) {
                jIndexOf = kVar.indexOf(mVarM4deprecated_encodeUtf9, jMax);
                z3 = true;
            } else {
                z3 = false;
            }
            if (jIndexOf == -1) {
                long j12 = kVar.f7358b;
                if (headers == null) {
                    j6 = jD;
                    long jIndexOf2 = kVar.indexOf(mVarM4deprecated_encodeUtf10, jMax);
                    if (jIndexOf2 >= 0) {
                        this.source.read(kVar, jIndexOf2);
                        Pg.k kVar2 = new Pg.k();
                        j10 = j12;
                        kVar.d(kVar2, jMax, jIndexOf2 - jMax);
                        jD2 = kVar2.f7358b + ((long) mVarM4deprecated_encodeUtf10.d());
                        headers = parseHeaders(kVar2);
                    } else {
                        j10 = j12;
                        map = headers;
                    }
                    if (this.source.read(kVar, 4096) <= 0) {
                        return false;
                    }
                    listener2 = listener;
                    jD = j6;
                    j11 = j10;
                } else {
                    j6 = jD;
                    j10 = j12;
                    map = headers;
                    emitProgress(map, j10 - jD2, false, listener2);
                }
                headers = map;
                if (this.source.read(kVar, 4096) <= 0) {
                    return false;
                }
                listener2 = listener;
                jD = j6;
                j11 = j10;
            } else {
                long j13 = jD;
                Map<String, String> map2 = headers;
                long j14 = jIndexOf - j13;
                if (j13 > 0) {
                    Pg.k kVar3 = new Pg.k();
                    kVar.skip(j13);
                    kVar.read(kVar3, j14);
                    listener2 = listener;
                    emitProgress(map2, kVar3.f7358b - jD2, true, listener2);
                    emitChunk(kVar3, z3, listener2);
                    jD2 = 0;
                    headers = null;
                } else {
                    listener2 = listener;
                    kVar.skip(jIndexOf);
                    headers = map2;
                }
                if (z3) {
                    return true;
                }
                jD = mVarM4deprecated_encodeUtf8.d();
                j11 = jD;
            }
        }
    }
}
