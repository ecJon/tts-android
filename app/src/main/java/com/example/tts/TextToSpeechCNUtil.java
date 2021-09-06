package com.example.tts;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import java.util.Locale;

public class TextToSpeechCNUtil {
    private static TextToSpeech mTextToSpeech;

    public static void playTextSpeech(final Context context, final String str) {
        TextToSpeech textToSpeech = mTextToSpeech;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }

        mTextToSpeech = new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            /* class com.leqinzn.scanpen.common.util.TextToSpeechCNUtil.AnonymousClass1 */

            public void onInit(int i) {
                int i2 = i;
                if (i2 == 1) {
                    TextToSpeechCNUtil.mTextToSpeech.setLanguage(Locale.UK);
                } else if (i2 == 2) {
                    TextToSpeechCNUtil.mTextToSpeech.setLanguage(Locale.US);
                } else if (i2 == 3) {
                    TextToSpeechCNUtil.mTextToSpeech.setLanguage(Locale.CHINESE);
                } else if (i2 == 4) {
                    TextToSpeechCNUtil.mTextToSpeech.setLanguage(Locale.ENGLISH);
                }
                TextToSpeechCNUtil.mTextToSpeech.setSpeechRate(0.75f);
                TextToSpeechCNUtil.mTextToSpeech.speak(String.valueOf(str), 1, null, "UniqueID");
            }
        }, "com.iflytek.speechcloud");

    }

    public static void stopTextSpeech() {
        TextToSpeech textToSpeech = mTextToSpeech;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
    }
}
