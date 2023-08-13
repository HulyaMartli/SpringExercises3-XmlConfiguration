package org.hulyam.gameConsoleIoC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class IocConfig {

    @Bean
    @Primary
    public IRunnable getMario(){
        return new Mario();
    }

    @Bean
    public IRunnable getContra(){
        return new Contra();
    }

    @Bean
    public IRunnable getPacman(){
        return new Pacman();
    }

    @Bean
    public GameRunner gameRunner(){
        return new GameRunner(getPacman());
    }
}
