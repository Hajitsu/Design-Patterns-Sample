package ir.hajitsu.abstract_factory.media_converter.factory;

import ir.hajitsu.abstract_factory.media_converter.Converter;

import java.io.File;

public interface MediaFactory {
    Converter createConverter(File file, Converter.CodecTypes codecType);
}
