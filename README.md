# Word Counter Application

This JavaFX application is designed to count the number of words, characters, and paragraphs in a given text. It also includes basic text editor functionalities, allowing users to open, edit, and save text files. The application is user-friendly and aesthetically pleasing, making it an ideal project for beginners and those looking to enhance their JavaFX skills.

## Features

1. **Word Count**: Calculates the number of words in the text.
2. **Character Count**: Calculates the number of characters in the text.
3. **Paragraph Count**: Calculates the number of paragraphs in the text.
4. **File Operations**:
    - **Open**: Opens a text file and loads its content into the text area.
    - **Save**: Saves the current content of the text area to the open file.
    - **Save As**: Saves the current content of the text area to a new file.
    - **Close**: Clears the text area and closes the current file.
    - **Exit**: Exits the application.
5. **Edit Operations**:
    - **Cut**: Cuts the selected text to the clipboard.
    - **Copy**: Copies the selected text to the clipboard.
    - **Paste**: Pastes the text from the clipboard.
    - **Select All**: Selects all text in the text area.
6. **Count Button**: Triggers the word, character, and paragraph count operations.
7. **Aesthetic Improvements**: Enhanced UI with a modern look and feel.

## Project Structure

```
- src
  - com
    - example
      - WordCounterApp.java
      - WordCounterController.java
      - word_counter.fxml
```

## How to Run

1. **Clone the repository**:
    ```bash
    git clone https://github.com/Salah1098/Word-Counter-and-Simple-text-editor.git
    cd word-counter
    ```

2. **Compile and run the application**:
    - If you are using an IDE like IntelliJ IDEA or Eclipse, open the project and run `Main.java`.
    - If you prefer to use the command line, navigate to the `src` directory and run:
        ```bash
        javac com/example/WordCounterApp.java
        java com.example.WordCounterApp
        ```

## Usage

1. **Open a File**:
    - Click on `File -> Open` to open a text file. The content of the file will be loaded into the text area.
2. **Edit the Text**:
    - Use the `Edit` menu to cut, copy, paste, and select all text.
3. **Count Words, Characters, and Paragraphs**:
    - Click the `Count` button to see the number of words, characters, and paragraphs in the text area.
4. **Save the File**:
    - Click on `File -> Save` to save the current content to the open file, or `File -> Save As` to save it to a new file.
5. **Close the File**:
    - Click on `File -> Close` to clear the text area and close the current file.
6. **Exit the Application**:
    - Click on `File -> Exit` to close the application.

## Dependencies

This project requires JavaFX. If you are using a JDK that includes JavaFX, you should be able to run the application without any additional setup. If not, ensure that JavaFX is properly installed and configured in your development environment.

## Contributing

If you would like to contribute to this project, please fork the repository and submit a pull request. We welcome all contributions, including bug fixes, feature additions, and documentation improvements.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.

## Contact

For any questions or suggestions, please contact [Salah](programsites123@gmail.com).
