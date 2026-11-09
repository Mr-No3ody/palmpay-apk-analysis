package androidx.multidex;

import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
interface MultiDex$V14$ElementConstructor {
    Object newInstance(File file, DexFile dexFile) throws IllegalAccessException, InstantiationException, IOException, IllegalArgumentException, InvocationTargetException;
}
