package com.googlecode.mp4parser.authoring.tracks;

import com.googlecode.mp4parser.authoring.Track;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public interface CencEncryptedTrack extends Track {
    UUID getDefaultKeyId();

    List<Object> getSampleEncryptionEntries();

    boolean hasSubSampleEncryption();
}
