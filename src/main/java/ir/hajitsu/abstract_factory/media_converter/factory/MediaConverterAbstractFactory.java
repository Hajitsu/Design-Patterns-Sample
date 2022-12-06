package ir.hajitsu.abstract_factory.media_converter.factory;

public interface MediaConverterAbstractFactory {
    public enum FactoryType {
        IMAGE, MUSIC, VIDEO
    }

    public static MediaFactory createFactory(FactoryType factoryType) {
        switch (factoryType) {
            case IMAGE:
                return new ImageConverterFactory();
            case MUSIC:
                return new MusicConverterFactory();
            case VIDEO:
                return new VideoConverterFactory();
        }
        throw new IllegalStateException("BAD FACTORY TYPE");
    }
}
