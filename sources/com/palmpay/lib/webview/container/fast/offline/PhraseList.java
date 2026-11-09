package com.palmpay.lib.webview.container.fast.offline;

import com.google.mlkit.common.MlKitException;
import com.transsnet.palmpay.core.bean.message.MessageEvent;

/* JADX INFO: loaded from: classes3.dex */
class PhraseList {
    public static String getPhrase(int i7) {
        if (i7 == 100) {
            return "Continue";
        }
        if (i7 == 101) {
            return "Switching Protocols";
        }
        switch (i7) {
            case 200:
                return "OK";
            case MlKitException.CODE_SCANNER_CANCELLED /* 201 */:
                return "Created";
            case MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED /* 202 */:
                return "Accepted";
            case MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE /* 203 */:
                return "Non-Authoritative Information";
            case MlKitException.CODE_SCANNER_TASK_IN_PROGRESS /* 204 */:
                return "No Content";
            case MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR /* 205 */:
                return "Reset Content";
            case MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR /* 206 */:
                return "Partial Content";
            default:
                switch (i7) {
                    case 300:
                        return "Multiple Choices";
                    case 301:
                        return "Moved Permanently";
                    case 302:
                        return "Found";
                    case 303:
                        return "See Other";
                    case 304:
                        return "Not Modified";
                    case 305:
                        return "Use Proxy";
                    case MessageEvent.EVENT_FINISH_QUTELLER_PAY_PREVIEW_PAGE /* 306 */:
                        return "Unused";
                    case MessageEvent.EVENT_SIGN_UP_SUCCESS /* 307 */:
                        return "Temporary Redirect";
                    default:
                        switch (i7) {
                            case 400:
                                return "Bad Request";
                            case MessageEvent.EVENT_OC_EXIT_APPLY /* 401 */:
                                return "Unauthorized";
                            case 402:
                                return "Payment Required";
                            case MessageEvent.EVENT_BILL_SUCCESS /* 403 */:
                                return "Forbidden";
                            case MessageEvent.EVENT_BILL_PENDING /* 404 */:
                                return "Not Found";
                            case MessageEvent.EVENT_BILL_FAIL /* 405 */:
                                return "Method Not Allowed";
                            case MessageEvent.EVENT_ACCOUNT_LOG_OUT /* 406 */:
                                return "Not Acceptable";
                            case 407:
                                return "Proxy Authentication Required";
                            case MessageEvent.EVENT_SYNC_CONTACTS /* 408 */:
                                return "Request Time-out";
                            case MessageEvent.EVENT_OPEN_CASHBOX_AUTO_TRANSFER /* 409 */:
                                return "Conflict";
                            case 410:
                                return "Gone";
                            case 411:
                                return "Length Required";
                            case 412:
                                return "Precondition Failed";
                            case 413:
                                return "Request Entity Too Large";
                            case 414:
                                return "Request-URI Too Large";
                            case 415:
                                return "Unsupported Media Type";
                            case 416:
                                return "Requested range not satisfiable";
                            case 417:
                                return "Expectation Failed";
                            default:
                                switch (i7) {
                                    case 500:
                                        return "Internal Server Error";
                                    case 501:
                                        return "Not Implemented";
                                    case 502:
                                        return "Bad Gateway";
                                    case 503:
                                        return "Service Unavailable";
                                    case 504:
                                        return "Gateway Time-out";
                                    case 505:
                                        return "HTTP Version not supported";
                                    default:
                                        return "unknown";
                                }
                        }
                }
        }
    }
}
