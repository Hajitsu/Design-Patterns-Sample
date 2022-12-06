package ir.hajitsu.abstract_factory.media_converter;

import java.io.File;

public abstract class Converter {
    private byte[] input;


    public Converter(byte[] input) {
        this.input = input;
    }

    public Converter(File file) {
    }

    public abstract byte[] convert() throws ConversionException;

    public enum CodecTypes {
        BPM, JPG, PNG,
        MP3, AAC, WAV,
        MP4, AVI, MKV
    }
}
