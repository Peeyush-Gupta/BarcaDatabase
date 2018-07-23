package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@ComponentScan("soundsystem")
@ComponentScan(basePackages = "soundsystem")
//@ComponentScan(basePackageClasses=CDPlayer.class, DVDPlayer.class})
public class CDPlayerConfig {

}
