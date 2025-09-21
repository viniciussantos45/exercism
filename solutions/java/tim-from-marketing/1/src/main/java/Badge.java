class Badge {
    public String print(Integer id, String name, String department) {
        var badge = new StringBuilder();
        var separator = " - ";
        
        if(id != null) {
            badge
                .append("[")
                .append(id.toString())
                .append("]")
                .append(separator);
        }

        badge.append(name).append(separator);
        
        if(department == null) badge.append("OWNER");
        else badge.append(department.toUpperCase());
        
        return badge.toString(); 
    }
}
