package ir.hajitsu.abstract_factory.media_converter.factory;

import ir.hajitsu.abstract_factory.media_converter.Converter;

import java.io.File;

public class VideoConverterFactory implements MediaFactory {
    @Override
    public Converter createConverter(File file, Converter.CodecTypes codecType) {
        String fileName = file.getName().toLowerCase();

        throw new IllegalStateException("Converter not found");
    }
}
