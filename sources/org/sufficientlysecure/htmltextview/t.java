package org.sufficientlysecure.htmltextview;

import android.text.Editable;
import android.text.Html;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements ContentHandler, Html.TagHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ContentHandler f41146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f41147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Editable f41148c;

    public t(p pVar) {
        this.f41147b = pVar;
    }

    @Override // org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i7, int i10) throws SAXException {
        this.f41146a.characters(cArr, i7, i10);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endDocument() throws SAXException {
        this.f41146a.endDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) throws SAXException {
        if (this.f41147b.handleTag(false, str2, this.f41148c, null)) {
            return;
        }
        this.f41146a.endElement(str, str2, str3);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endPrefixMapping(String str) throws SAXException {
        this.f41146a.endPrefixMapping(str);
    }

    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z3, String str, Editable editable, XMLReader xMLReader) {
        if (this.f41146a == null) {
            this.f41148c = editable;
            this.f41146a = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
        }
    }

    @Override // org.xml.sax.ContentHandler
    public final void ignorableWhitespace(char[] cArr, int i7, int i10) throws SAXException {
        this.f41146a.ignorableWhitespace(cArr, i7, i10);
    }

    @Override // org.xml.sax.ContentHandler
    public final void processingInstruction(String str, String str2) throws SAXException {
        this.f41146a.processingInstruction(str, str2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void setDocumentLocator(Locator locator) {
        this.f41146a.setDocumentLocator(locator);
    }

    @Override // org.xml.sax.ContentHandler
    public final void skippedEntity(String str) throws SAXException {
        this.f41146a.skippedEntity(str);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startDocument() throws SAXException {
        this.f41146a.startDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        if (this.f41147b.handleTag(true, str2, this.f41148c, attributes)) {
            return;
        }
        this.f41146a.startElement(str, str2, str3, attributes);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startPrefixMapping(String str, String str2) throws SAXException {
        this.f41146a.startPrefixMapping(str, str2);
    }
}
