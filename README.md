# Localized SunriseSet Explorer

Course: Mobile Device Application CS473

Assignment Name: Localized SunriseSet Explorer

### LocalizationManager

```kotlin
import android.content.Context
import android.content.res.Configuration
import java.util.Locale

object LocalizationManager {
    
    fun setLanguage(context: Context, languageCode: LocalizationCode) {
        val locale = Locale(languageCode.getLocalizeCodeString())
        Locale.setDefault(locale)

        val config = Configuration(context.resources.configuration)
        config.setLocale(locale)

        context.resources.updateConfiguration(config, context.resources.displayMetrics)
    }
}
```

### LocalizationManager

```kotlin
enum class LocalizationCode {
    EN, ZH;

    fun getLocalizeCodeString(): String {
        return when (this) {
            EN -> "en"
            ZH -> "zh"
        }
    }
}
```

### Usage

```kotlin
  LocalizationManager.setLanguage(this, LocalizationCode.ZH)
```

#### in case you want to have a function switch to reload

```kotlin
LocalizationManager.setLanguage(this, LocalizationCode.ZH)
recreate()
```

