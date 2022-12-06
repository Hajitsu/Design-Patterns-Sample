package ir.hajitsu.abstract_factory.media_converter.image;

import ir.hajitsu.abstract_factory.media_converter.ConversionException;
import ir.hajitsu.abstract_factory.media_converter.Converter;

import java.io.File;

public class Bmp2JpgConverter extends Converter {
    public Bmp2JpgConverter(byte[] input) {
        super(input);
    }

    public Bmp2JpgConverter(File file) {
        super(file);
    }

    @Override
    public byte[] convert() throws ConversionException {
        return new byte[0];
    }
}
