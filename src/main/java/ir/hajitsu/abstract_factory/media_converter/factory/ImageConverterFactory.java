package ir.hajitsu.abstract_factory.media_converter.factory;

import ir.hajitsu.abstract_factory.media_converter.Converter;
import ir.hajitsu.abstract_factory.media_converter.image.Bmp2JpgConverter;

import java.io.File;

public class ImageConverterFactory implements MediaFactory {
    @Override
    public Converter createConverter(File file, Converter.CodecTypes codecType) {
        String fileName = file.getName().toLowerCase();
        if (fileName.endsWith(".bmp")) {
            switch (codecType) {
                case JPG:
                    return new Bmp2JpgConverter(file);
            }
        }
        throw new IllegalStateException("Converter not found");
    }
}
