import org.eclipse.lsp4j.*;
import org.eclipse.lsp4j.services.WorkspaceService;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class LSPWorkspaceService implements WorkspaceService {

    @Override
    public CompletableFuture<List<? extends SymbolInformation>> symbol(WorkspaceSymbolParams params) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'symbol'");
    }

    @Override
    public void didChangeConfiguration(DidChangeConfigurationParams params) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'didChangeConfiguration'");
    }

    @Override
    public void didChangeWatchedFiles(DidChangeWatchedFilesParams params) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'didChangeWatchedFiles'");
    }

}
