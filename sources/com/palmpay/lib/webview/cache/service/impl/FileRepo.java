package com.palmpay.lib.webview.cache.service.impl;

import C0.G;
import Ef.a;
import Ff.c;
import Ff.h;
import N8.q0;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.camera.core.impl.utils.executor.g;
import com.alibaba.android.arouter.utils.Consts;
import com.palmpay.lib.webview.cache.WebCacheParamsProvider;
import com.palmpay.lib.webview.cache.WebCacheSetting;
import com.palmpay.lib.webview.cache.service.base.FileRequestOption;
import com.palmpay.lib.webview.cache.service.base.FileSaveOption;
import com.palmpay.lib.webview.cache.service.base.FileState;
import com.palmpay.lib.webview.cache.service.base.InputStreamState;
import com.palmpay.lib.webview.cache.service.base.NetState;
import com.palmpay.lib.webview.cache.service.base.WebCacheFileRepoDelegate;
import com.palmpay.lib.webview.cache.service.base.WebCacheNetDelegate;
import com.palmpay.lib.webview.cache.util.CoroutineHelper;
import com.palmpay.lib.webview.cache.util.WebCacheLog;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041ce.o;
import p355xf.C2131j;
import p355xf.l;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0015H\u0016J*\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0015H\u0096@¢\u0006\u0002\u0010\u0018J \u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u0005H\u0016J\u0012\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010!\u001a\u00020\u001e2\b\u0010%\u001a\u0004\u0018\u00010 H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\u00058DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\t\u0010\u0007¨\u0006&"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/impl/FileRepo;", "Lcom/palmpay/lib/webview/cache/service/base/WebCacheFileRepoDelegate;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "rootDirPath", "getRootDirPath", "rootDirPath$delegate", "Lkotlin/Lazy;", "getInputStreamFromNetFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/palmpay/lib/webview/cache/service/base/InputStreamState;", "url", "option", "Lcom/palmpay/lib/webview/cache/service/base/FileRequestOption;", "saveFileFromNetFlow", "Lcom/palmpay/lib/webview/cache/service/base/FileState;", "relativeFilePath", "Lcom/palmpay/lib/webview/cache/service/base/FileSaveOption;", "saveFileFromAsset", "assetFilePath", "(Ljava/lang/String;Ljava/lang/String;Lcom/palmpay/lib/webview/cache/service/base/FileSaveOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copyFileFromAsset", "context", "Landroid/content/Context;", "destPath", "deleteRelativeFile", "", "getRelativeFile", "Ljava/io/File;", "deleteFile", "absoluteFilePath", "concretePath", "relativePath", "file", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFileRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileRepo.kt\ncom/palmpay/lib/webview/cache/service/impl/FileRepo\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,256:1\n47#2:257\n49#2:261\n47#2:266\n49#2:270\n50#3:258\n55#3:260\n50#3:267\n55#3:269\n106#4:259\n106#4:268\n9#5,4:262\n9#5,4:272\n9#5,4:276\n1#6:271\n124#7:280\n113#7,5:281\n*S KotlinDebug\n*F\n+ 1 FileRepo.kt\ncom/palmpay/lib/webview/cache/service/impl/FileRepo\n*L\n38#1:257\n38#1:261\n75#1:266\n75#1:270\n38#1:258\n38#1:260\n75#1:267\n75#1:269\n38#1:259\n75#1:268\n63#1:262,4\n215#1:272,4\n208#1:276,4\n240#1:280\n240#1:281,5\n*E\n"})
public class FileRepo extends WebCacheFileRepoDelegate {

    @NotNull
    private final String name = "FileRepo";

    /* JADX INFO: renamed from: rootDirPath$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy rootDirPath = C2131j.b(new o(19));

    /* JADX INFO: renamed from: com.palmpay.lib.webview.cache.service.impl.FileRepo$saveFileFromAsset$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/palmpay/lib/webview/cache/service/base/FileState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.palmpay.lib.webview.cache.service.impl.FileRepo$saveFileFromAsset$2", f = "FileRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFileRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileRepo.kt\ncom/palmpay/lib/webview/cache/service/impl/FileRepo$saveFileFromAsset$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n*L\n1#1,256:1\n13579#2,2:257\n9#3,4:259\n*S KotlinDebug\n*F\n+ 1 FileRepo.kt\ncom/palmpay/lib/webview/cache/service/impl/FileRepo$saveFileFromAsset$2\n*L\n160#1:257,2\n173#1:259,4\n*E\n"})
    public static final class AnonymousClass2 extends h implements Function1<Continuation<? super FileState>, Object> {
        final /* synthetic */ String $assetFilePath;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $relativeFilePath;
        int label;
        final /* synthetic */ FileRepo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, String str, FileRepo fileRepo, String str2, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$context = context;
            this.$assetFilePath = str;
            this.this$0 = fileRepo;
            this.$relativeFilePath = str2;
        }

        @Override // Ff.a
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass2(this.$context, this.$assetFilePath, this.this$0, this.$relativeFilePath, continuation);
        }

        @Override // Ff.a
        public final Object invokeSuspend(Object obj) throws IOException {
            a aVar = a.f2423a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            String[] list = this.$context.getAssets().list(this.$assetFilePath);
            if (list == null || list.length == 0) {
                FileRepo fileRepo = this.this$0;
                return fileRepo.copyFileFromAsset(this.$context, this.$assetFilePath, fileRepo.concretePath(this.$relativeFilePath));
            }
            String strConcretePath = this.this$0.concretePath(this.$relativeFilePath);
            D d2 = new D();
            FileRepo fileRepo2 = this.this$0;
            Context context = this.$context;
            String str = this.$assetFilePath;
            for (String str2 : list) {
                String str3 = File.separator;
                if (fileRepo2.copyFileFromAsset(context, q0.y(str, str3, str2), q0.y(strConcretePath, str3, str2)) instanceof FileState.Error) {
                    d2.f38949a++;
                }
            }
            if (d2.f38949a == list.length) {
                return new FileState.Error(-1, new RuntimeException("Fail to copy files from directory."));
            }
            FileRepo fileRepo3 = this.this$0;
            WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
            if (webCacheLog.getCanLog() && d2.f38949a > 0) {
                webCacheLog.e(fileRepo3.getName(), "Partially succeed to save file(s) from asset, " + d2.f38949a + " file(s) fails");
            }
            return new FileState.Complete(0, 0L, null, new File(strConcretePath));
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super FileState> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.f38893a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String concretePath(String relativePath) {
        CharSequence charSequenceSubSequence;
        if (relativePath == null || StringsKt.F(relativePath)) {
            return getRootDirPath();
        }
        String rootDirPath = getRootDirPath();
        char c6 = File.separatorChar;
        int length = relativePath.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (relativePath.charAt(i7) != File.separatorChar) {
                charSequenceSubSequence = relativePath.subSequence(i7, relativePath.length());
                return rootDirPath + c6 + charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = "";
        return rootDirPath + c6 + charSequenceSubSequence.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:42:0x0091 A[Catch: IOException -> 0x008c, TRY_LEAVE, TryCatch #8 {IOException -> 0x008c, blocks: (B:38:0x0088, B:42:0x0091), top: B:66:0x0088 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.io.InputStream] */
    public final FileState copyFileFromAsset(Context context, String assetFilePath, String destPath) throws Throwable {
        Throwable th;
        ?? r10;
        Exception exc;
        InputStream inputStream;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                InputStream inputStreamOpen = context.getAssets().open(assetFilePath);
                try {
                    byte[] bArr = new byte[2048];
                    D d2 = new D();
                    File file = new File(destPath);
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    long j6 = 0;
                    while (true) {
                        try {
                            int i7 = inputStreamOpen.read(bArr);
                            d2.f38949a = i7;
                            if (i7 <= -1) {
                                FileState.Complete complete = new FileState.Complete(0, j6, null, file);
                                try {
                                    fileOutputStream2.close();
                                    inputStreamOpen.close();
                                    return complete;
                                } catch (IOException e10) {
                                    WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
                                    if (webCacheLog.getCanLog()) {
                                        webCacheLog.e(getName(), e10);
                                    }
                                    return complete;
                                }
                            }
                            fileOutputStream2.write(bArr, 0, i7);
                            j6 += (long) d2.f38949a;
                        } catch (Exception e11) {
                            exc = e11;
                            fileOutputStream = fileOutputStream2;
                            inputStream = inputStreamOpen;
                            WebCacheLog webCacheLog2 = WebCacheLog.INSTANCE;
                            if (webCacheLog2.getCanLog()) {
                                webCacheLog2.e(getName(), exc);
                            }
                            FileState.Error error = new FileState.Error(-1, exc);
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                } catch (IOException e12) {
                                    WebCacheLog webCacheLog3 = WebCacheLog.INSTANCE;
                                    if (webCacheLog3.getCanLog()) {
                                        webCacheLog3.e(getName(), e12);
                                    }
                                    return error;
                                }
                            } else if (inputStream != null) {
                                inputStream.close();
                            }
                            return error;
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            r10 = inputStreamOpen;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e13) {
                                    WebCacheLog webCacheLog4 = WebCacheLog.INSTANCE;
                                    if (!webCacheLog4.getCanLog()) {
                                        throw th;
                                    }
                                    webCacheLog4.e(getName(), e13);
                                    throw th;
                                }
                            }
                            if (r10 == 0) {
                                throw th;
                            }
                            r10.close();
                            throw th;
                        }
                    }
                } catch (Exception e14) {
                    exc = e14;
                    inputStream = inputStreamOpen;
                }
            } catch (Throwable th3) {
                th = th3;
                r10 = context;
            }
        } catch (Exception e15) {
            exc = e15;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            r10 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rootDirPath_delegate$lambda$0() {
        String cacheDir;
        WebCacheParamsProvider paramsProvider = WebCacheSetting.INSTANCE.getParamsProvider();
        if (paramsProvider == null || (cacheDir = paramsProvider.getCacheDir()) == null) {
            throw new RuntimeException("Cache dir need to be set by WebCacheParamsProvider");
        }
        return cacheDir;
    }

    public static /* synthetic */ Object saveFileFromAsset$suspendImpl(FileRepo fileRepo, String str, String str2, FileSaveOption fileSaveOption, Continuation<? super FileState> continuation) {
        if (str.length() == 0) {
            return new FileState.Error(-1, new IllegalArgumentException("Asset path is empty."));
        }
        if (str2.length() == 0) {
            return new FileState.Error(-1, new IllegalArgumentException("Destination path is empty."));
        }
        Context appContext = WebCacheSetting.INSTANCE.getAppContext();
        return appContext == null ? new FileState.Error(-1, new RuntimeException("Application context is null.")) : CoroutineHelper.runOnIo$default(CoroutineHelper.INSTANCE, fileRepo, null, new AnonymousClass2(appContext, str, fileRepo, str2, null), continuation, 1, null);
    }

    @Override // com.palmpay.lib.webview.cache.service.base.WebCacheFileRepoDelegate
    public boolean deleteFile(@NotNull String absoluteFilePath) {
        Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
        if (absoluteFilePath.length() == 0) {
            return false;
        }
        return deleteFile(new File(absoluteFilePath));
    }

    @Override // com.palmpay.lib.webview.cache.service.base.WebCacheFileRepoDelegate
    public boolean deleteRelativeFile(@NotNull String relativeFilePath) {
        Intrinsics.checkNotNullParameter(relativeFilePath, "relativeFilePath");
        return deleteFile(new File(concretePath(relativeFilePath)));
    }

    @Override // com.palmpay.lib.webview.cache.service.base.WebCacheFileRepoDelegate
    @Nullable
    public Flow<InputStreamState> getInputStreamFromNetFlow(@NotNull String url, @Nullable FileRequestOption option) {
        String method;
        Intrinsics.checkNotNullParameter(url, "url");
        WebCacheNetDelegate netDelegate = getNetDelegate();
        if (netDelegate != null) {
            if (option == null || (method = option.getMethod()) == null) {
                method = "GET";
            }
            final Flow flowConnectFlow$default = WebCacheNetDelegate.connectFlow$default(netDelegate, url, method, option != null ? option.getHeader() : null, option != null ? option.getUserAgent() : null, option != null ? option.getCookie() : null, null, false, 96, null);
            if (flowConnectFlow$default != null) {
                return new Flow<InputStreamState>() { // from class: com.palmpay.lib.webview.cache.service.impl.FileRepo$getInputStreamFromNetFlow$$inlined$map$1

                    /* JADX INFO: renamed from: com.palmpay.lib.webview.cache.service.impl.FileRepo$getInputStreamFromNetFlow$$inlined$map$1$2, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FileRepo.kt\ncom/palmpay/lib/webview/cache/service/impl/FileRepo\n*L\n1#1,222:1\n48#2:223\n39#3,15:224\n*E\n"})
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* JADX INFO: renamed from: com.palmpay.lib.webview.cache.service.impl.FileRepo$getInputStreamFromNetFlow$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "com.palmpay.lib.webview.cache.service.impl.FileRepo$getInputStreamFromNetFlow$$inlined$map$1$2", f = "FileRepo.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends c {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // Ff.a
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public final Object emit(Object obj, @NotNull Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            Object error;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i7 = anonymousClass1.label;
                                if ((i7 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i7 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.f2423a;
                            int i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                g.M(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                NetState netState = (NetState) obj;
                                if (netState instanceof NetState.Complete) {
                                    NetState.Complete complete = (NetState.Complete) netState;
                                    error = new InputStreamState.Connected(complete.getCode(), complete.getHeaders(), complete.getData() != null ? new BufferedInputStream((InputStream) complete.getData()) : null);
                                } else if (netState instanceof NetState.OnStart) {
                                    error = new InputStreamState.OnStart(((NetState.OnStart) netState).getUrl());
                                } else if (netState instanceof NetState.Error) {
                                    NetState.Error error2 = (NetState.Error) netState;
                                    error = new InputStreamState.Error(error2.getCode(), error2.getThrowable());
                                } else if (netState instanceof NetState.OnProgress) {
                                    error = new InputStreamState.Error(-1, new RuntimeException("This state[NetState.OnProgress] should not show up for InputStreamState"));
                                } else {
                                    if (!(netState instanceof NetState.Redirect)) {
                                        throw new l();
                                    }
                                    error = new InputStreamState.Error(((NetState.Redirect) netState).getCode(), new RuntimeException("Connection redirects."));
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(error, anonymousClass1) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                g.M(obj2);
                            }
                            return Unit.f38893a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    @Nullable
                    public Object collect(@NotNull FlowCollector<? super InputStreamState> flowCollector, @NotNull Continuation continuation) {
                        Object objCollect = flowConnectFlow$default.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == a.f2423a ? objCollect : Unit.f38893a;
                    }
                };
            }
        }
        return null;
    }

    @Override // com.palmpay.lib.webview.cache.service.base.AbstractDelegate
    @NotNull
    public String getName() {
        return this.name;
    }

    @Override // com.palmpay.lib.webview.cache.service.base.WebCacheFileRepoDelegate
    @NotNull
    public File getRelativeFile(@NotNull String relativeFilePath) {
        Intrinsics.checkNotNullParameter(relativeFilePath, "relativeFilePath");
        return new File(concretePath(relativeFilePath));
    }

    @NotNull
    public final String getRootDirPath() {
        return (String) this.rootDirPath.getValue();
    }

    @Override // com.palmpay.lib.webview.cache.service.base.WebCacheFileRepoDelegate
    @Nullable
    public Object saveFileFromAsset(@NotNull String str, @NotNull String str2, @Nullable FileSaveOption fileSaveOption, @NotNull Continuation<? super FileState> continuation) {
        return saveFileFromAsset$suspendImpl(this, str, str2, fileSaveOption, continuation);
    }

    @Override // com.palmpay.lib.webview.cache.service.base.WebCacheFileRepoDelegate
    @Nullable
    public Flow<FileState> saveFileFromNetFlow(@NotNull final String url, @NotNull String relativeFilePath, @Nullable FileSaveOption option) {
        String method;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(relativeFilePath, "relativeFilePath");
        if (relativeFilePath.length() == 0) {
            WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
            if (webCacheLog.getCanLog()) {
                webCacheLog.e(getName(), "Cannot save file to empty path.");
            }
            return null;
        }
        final C c6 = new C();
        WebCacheNetDelegate netDelegate = getNetDelegate();
        if (netDelegate != null) {
            String strConcretePath = concretePath(relativeFilePath);
            if (option == null || (method = option.getMethod()) == null) {
                method = "GET";
            }
            final Flow<NetState<File>> flowDownloadFlow = netDelegate.downloadFlow(url, strConcretePath, method, option != null ? option.getHeader() : null, option != null ? option.getUserAgent() : null, option != null ? option.getCookie() : null);
            if (flowDownloadFlow != null) {
                return new Flow<FileState>() { // from class: com.palmpay.lib.webview.cache.service.impl.FileRepo$saveFileFromNetFlow$$inlined$map$1

                    /* JADX INFO: renamed from: com.palmpay.lib.webview.cache.service.impl.FileRepo$saveFileFromNetFlow$$inlined$map$1$2, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FileRepo.kt\ncom/palmpay/lib/webview/cache/service/impl/FileRepo\n+ 4 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n*L\n1#1,222:1\n48#2:223\n76#3,3:224\n79#3,5:229\n84#3,4:235\n88#3,5:241\n93#3,10:247\n103#3,8:259\n112#3,4:268\n116#3,7:274\n123#3,4:282\n127#3,5:288\n132#3,3:294\n9#4,2:227\n12#4:234\n9#4,2:239\n12#4:246\n9#4,2:257\n12#4:267\n9#4,2:272\n12#4:281\n9#4,2:286\n12#4:293\n*S KotlinDebug\n*F\n+ 1 FileRepo.kt\ncom/palmpay/lib/webview/cache/service/impl/FileRepo\n*L\n78#1:227,2\n78#1:234\n87#1:239,2\n87#1:246\n102#1:257,2\n102#1:267\n115#1:272,2\n115#1:281\n126#1:286,2\n126#1:293\n*E\n"})
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ C $lastProgress$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ String $url$inlined;
                        final /* synthetic */ FileRepo this$0;

                        /* JADX INFO: renamed from: com.palmpay.lib.webview.cache.service.impl.FileRepo$saveFileFromNetFlow$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "com.palmpay.lib.webview.cache.service.impl.FileRepo$saveFileFromNetFlow$$inlined$map$1$2", f = "FileRepo.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends c {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // Ff.a
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, String str, FileRepo fileRepo, C c6) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$url$inlined = str;
                            this.this$0 = fileRepo;
                            this.$lastProgress$inlined = c6;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public final Object emit(Object obj, @NotNull Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            FileState error;
                            FileState error2;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i7 = anonymousClass1.label;
                                if ((i7 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i7 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                            Object obj2 = anonymousClass1.result;
                            Object obj3 = a.f2423a;
                            int i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                g.M(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                NetState netState = (NetState) obj;
                                if (netState instanceof NetState.OnStart) {
                                    WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
                                    if (webCacheLog.getCanLog()) {
                                        webCacheLog.d(this.this$0.getName(), "Starting downloading file[" + this.$url$inlined + "].");
                                    }
                                    error = new FileState.OnStart(this.$url$inlined);
                                } else if (netState instanceof NetState.Complete) {
                                    WebCacheLog webCacheLog2 = WebCacheLog.INSTANCE;
                                    if (webCacheLog2.getCanLog()) {
                                        webCacheLog2.d(this.this$0.getName(), G.q("Complete downloading file[", this.$url$inlined, "] in ", ((File) ((NetState.Complete) netState).getData()).getPath(), Consts.DOT));
                                    }
                                    NetState.Complete complete = (NetState.Complete) netState;
                                    error = new FileState.Complete(complete.getCode(), complete.getLength(), complete.getHeaders(), (File) complete.getData());
                                } else {
                                    if (netState instanceof NetState.OnProgress) {
                                        NetState.OnProgress onProgress = (NetState.OnProgress) netState;
                                        if (onProgress.getMax() > 0) {
                                            WebCacheLog webCacheLog3 = WebCacheLog.INSTANCE;
                                            if (webCacheLog3.getCanLog()) {
                                                float progress = onProgress.getProgress() / onProgress.getMax();
                                                if (progress == 1.0f || progress - this.$lastProgress$inlined.f38948a >= 10.0f) {
                                                    this.$lastProgress$inlined.f38948a = progress;
                                                }
                                                webCacheLog3.d(this.this$0.getName(), "Downloading file(" + (progress * 100) + "%)");
                                            }
                                        }
                                        error2 = new FileState.OnProgress(onProgress.getProgress(), onProgress.getMax());
                                    } else if (netState instanceof NetState.Error) {
                                        WebCacheLog webCacheLog4 = WebCacheLog.INSTANCE;
                                        if (webCacheLog4.getCanLog()) {
                                            NetState.Error error3 = (NetState.Error) netState;
                                            webCacheLog4.e(this.this$0.getName(), "Error in downloading file[" + this.$url$inlined + "]. Code = " + error3.getCode() + ", Exception = " + error3.getThrowable());
                                        }
                                        NetState.Error error4 = (NetState.Error) netState;
                                        error2 = new FileState.Error(error4.getCode(), error4.getThrowable());
                                    } else {
                                        if (!(netState instanceof NetState.Redirect)) {
                                            throw new l();
                                        }
                                        WebCacheLog webCacheLog5 = WebCacheLog.INSTANCE;
                                        if (webCacheLog5.getCanLog()) {
                                            webCacheLog5.e(this.this$0.getName(), "Redirect in downloading file[" + this.$url$inlined + "]");
                                        }
                                        error = new FileState.Error(-1, new Exception("Redirect in downloading file"));
                                    }
                                    error = error2;
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(error, anonymousClass1) == obj3) {
                                    return obj3;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                g.M(obj2);
                            }
                            return Unit.f38893a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    @Nullable
                    public Object collect(@NotNull FlowCollector<? super FileState> flowCollector, @NotNull Continuation continuation) {
                        Object objCollect = flowDownloadFlow.collect(new AnonymousClass2(flowCollector, url, this, c6), continuation);
                        return objCollect == a.f2423a ? objCollect : Unit.f38893a;
                    }
                };
            }
        }
        return null;
    }

    private final boolean deleteFile(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return true;
            }
            for (File file2 : fileArrListFiles) {
                deleteFile(file2);
            }
        }
        return file.delete();
    }
}
