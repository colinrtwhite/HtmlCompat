# HtmlCompat
HtmlCompat is an *extremely* simple library to handle the changes to the Html class in Android Nougat in a way that is compatible with older versions of Android.

**NOTE**: This library doesn't attempt to backport the Html class functionality introduced in Android Nougat. The library will always use `FROM_HTML_MODE_LEGACY` on pre-Nougat versions of Android. If you need the full Android Nougat functionality backported, check out [this](https://github.com/Pixplicity/HtmlCompat) library.

## Including in Your Project

Add the repository to your **project** build.gradle:
```Groovy 
repositories {
    jcenter()
    maven {
        url 'https://jitpack.io'
    }
}
```

And add the library to your **module** build.gradle:
```Groovy 
dependencies {
    compile 'com.github.colinrtwhite:HtmlCompat:1.0'
}
```
