package org.example.dataprocessor.output;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class FileOutput implements OutputStrategy {
    @Override
    public void output(double result) throws IOException {
        Path path = Paths.get("target/result.txt");
        Files.createDirectories(path.getParent());
        Files.writeString(path, "Result = " + result, StandardCharsets.UTF_8,
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }
}

