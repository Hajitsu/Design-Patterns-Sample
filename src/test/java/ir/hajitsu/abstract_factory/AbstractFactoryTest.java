package ir.hajitsu.abstract_factory;

import ir.hajitsu.abstract_factory.media_converter.Converter;
import ir.hajitsu.abstract_factory.media_converter.factory.MediaConverterAbstractFactory;
import ir.hajitsu.abstract_factory.media_converter.factory.MediaFactory;
import org.junit.jupiter.api.Test;

import java.io.File;

class AbstractFactoryTest {
    @Test
    void getInstance() throws Exception {
        MediaFactory factory = MediaConverterAbstractFactory.createFactory(MediaConverterAbstractFactory.FactoryType.IMAGE);
        System.out.println(factory.getClass());

        Converter converter = factory.createConverter(new File(""), Converter.CodecTypes.JPG);
        System.out.println(converter.getClass());

        byte[] convert = converter.convert();

    }
}
