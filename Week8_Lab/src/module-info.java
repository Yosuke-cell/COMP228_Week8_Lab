module Week8_Lab {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.base;
	requires java.desktop;
	requires javafx.media;
	
	exports application;
	opens application to javafx.graphics;
}
