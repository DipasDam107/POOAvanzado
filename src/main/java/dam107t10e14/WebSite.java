package dam107t10e14;

class WebSite {
    private final String ip;
    private final String web;
    private final int puerto;
    
    public WebSite(final String ip, final String web, final int puerto){
        this.ip=ip;
        this.web=web;
        this.puerto=puerto;
    }

    @Override
    public String toString() {
        return "WebSite{" + "ip=" + ip + ", web=" + web + ", puerto=" + puerto + '}';
    }
    
}
