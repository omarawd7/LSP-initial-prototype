import java.util.concurrent.CompletableFuture;

import org.eclipse.lsp4j.*;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import org.eclipse.lsp4j.services.*;

public class MyLanguageClient implements LanguageClient {
    private LanguageServer server;

    @Override
    public void connect(LanguageServer server) {
        this.server = server;
    }

    @Override
    public void initialized(InitializedParams params) {
        // Logic to handle the initialized notification from the server
    }

    public void requestHover() {
        TextDocumentPositionParams params = new TextDocumentPositionParams();
        // Set appropriate values for the `params` object, such as the file URI and
        // position

        CompletableFuture<Hover> hoverResult = server.getTextDocumentService().hover(params);
        hoverResult.thenAccept(hover -> {
            // Logic to handle the hover result
            System.out.println(hover.getContents().getLeft());
        });
    }

    @Override
    public void logMessage(MessageParams arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'logMessage'");
    }

    @Override
    public void publishDiagnostics(PublishDiagnosticsParams arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'publishDiagnostics'");
    }

    @Override
    public void showMessage(MessageParams arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showMessage'");
    }

    @Override
    public CompletableFuture<MessageActionItem> showMessageRequest(ShowMessageRequestParams arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showMessageRequest'");
    }

    @Override
    public void telemetryEvent(Object arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'telemetryEvent'");
    }

    // Other required methods from the LanguageClient interface

    // Additional methods and logic specific to your language client
}