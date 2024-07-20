package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import javafx.stage.Stage;

public class WordCounterController {

    @FXML
    private TextArea textArea;
    @FXML
    private Label wordCountLabel;
    @FXML
    private Label charCountLabel;
    @FXML
    private Label paraCountLabel;

    private Stage stage;
    private File currentFile;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private void handleCount() {
        String text = textArea.getText();

        int wordCount = countWords(text);
        int charCount = countChars(text);
        int paraCount = countParagraphs(text);

        wordCountLabel.setText(String.valueOf(wordCount));
        charCountLabel.setText(String.valueOf(charCount));
        paraCountLabel.setText(String.valueOf(paraCount));
    }

    @FXML
    private void handleOpenFile() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text Files", "*.txt"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
            loadFileContent(file);
            currentFile = file;
        }
    }

    @FXML
    private void handleSaveFile() {
        if (currentFile != null) {
            saveFileContent(currentFile);
        } else {
            handleSaveFileAs();
        }
    }

    @FXML
    private void handleSaveFileAs() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text Files", "*.txt"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );
        File file = fileChooser.showSaveDialog(stage);
        if (file != null) {
            saveFileContent(file);
            currentFile = file;
        }
    }

    @FXML
    private void handleExit() {
        stage.close();
    }

    @FXML
    private void handleCut() {
        textArea.cut();
    }

    @FXML
    private void handleCopy() {
        textArea.copy();
    }

    @FXML
    private void handlePaste() {
        textArea.paste();
    }

    @FXML
    private void handleSelectAll() {
        textArea.selectAll();
    }

    private void loadFileContent(File file) {
        try {
            List<String> lines = Files.readAllLines(file.toPath());
            textArea.clear();
            for (String line : lines) {
                textArea.appendText(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveFileContent(File file) {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(textArea.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int countWords(String text) {
        String trimmed = text.trim();
        if (trimmed.isEmpty()) {
            return 0;
        }
        return trimmed.split("\\s+").length;
    }

    private int countChars(String text) {
        return text.length();
    }

    private int countParagraphs(String text) {
        if (text.isEmpty()) {
            return 0;
        }
        return text.split("\n\n|\r\n\r\n").length;
    }
}
