// 14.5.2 requres 구문

module expenses.readers {
    requires java.base;
    
    exports com.example.expenses.readers;
    exports com.example.expenses.readers.file;
    exports com.example.expenses.readers.http;
}
