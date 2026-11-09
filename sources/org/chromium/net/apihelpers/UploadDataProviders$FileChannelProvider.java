package org.chromium.net.apihelpers;

import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
public interface UploadDataProviders$FileChannelProvider {
    FileChannel getChannel() throws IOException;
}
