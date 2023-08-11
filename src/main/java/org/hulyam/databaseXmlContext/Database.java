package org.hulyam.databaseXmlContext;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Database {
    String username;
    String password;
    String url;

    public abstract void log();
}
