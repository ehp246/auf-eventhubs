package me.ehp246.test.embedded.enablebyjms.propertycase.to;

import org.springframework.context.annotation.Import;

import me.ehp246.aufjms.api.annotation.ByJms;
import me.ehp246.aufjms.api.annotation.ByJms.To;
import me.ehp246.test.EmbeddedArtemisConfig;
import me.ehp246.aufjms.api.annotation.EnableByJms;

/**
 * @author Lei Yang
 *
 */
@EnableByJms
@Import(EmbeddedArtemisConfig.class)
class AppConfig {
    @ByJms(value = @To("${holder}"))
    interface Case01 {
    }
}
