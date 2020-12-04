// 14.8 모듈 정의와 구문들

module com.iteratrlearning.application {

}


// 14.8.1 requires

module com.iteratrlearning.application {
    requires com.iteratrlearning.ui;
}


// 14.8.2 exports

module com.iteratrlearning.ui {
    requires com.iteratrlearning.core;
    exports com.iteratrlearning.ui.panels;
    exports com.iteratrlearning.ui.widgets;
}


// 14.8.3 requires transitive

module com.iteratrlearning.ui {
    require transitive com.iteratrlearning.core;

    exports com.iteratrlearning.ui.panels;
    exports com.iteratrlearning.ui.widgets;
}

module com.iteratrlearning.application {
    require com.iteratrlearning.ui;
}


// 14.8.4 exports to

module com.iteratrlearning.ui {
    require com.iteratrlearning.core;

    exports com.iteratrlearning.ui.panels;
    exports com.iteratrlearning.ui.widgets to
      com.iteratrlearning.ui.widgetuser;
}


// 14.8.5 open과 opens

open module com.iteratrlearning.ui {

}


// 14.8.6 uses와 provides
