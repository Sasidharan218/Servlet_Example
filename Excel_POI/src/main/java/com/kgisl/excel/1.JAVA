public static Object[] TradecsvtoBean(String path) throws IOException
{   
    try (
        Reader reader = Files.newBufferedReader(Paths.get(path));
    ) {
        ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
        strategy.setType(Project_Pojo.class);
        String[] emps ={ "id" , "UccCode", "TradeDate", "Scrip", "TradeType", "Quantity", "TradePrice" };
        strategy.setColumnMapping(emps);

        CsvToBean<Project_Pojo> csvToBean = new CsvToBeanBuilder(reader)
                .withMappingStrategy(strategy)
                .withSkipLines(0)
                .withIgnoreLeadingWhiteSpace(true)
                .build();

        Iterator<Project_Pojo> myUserIterator = csvToBean.iterator();

        List<Project_Pojo> al = csvToBean.parse(strategy, reader);




    Object[] obj_arr1 = al.toArray();
    // System.out.println("Object Array from List: "+Arrays.toString(obj_arr));
    System.out.println("Object Array from List: Trade");
    for (Object var : obj_arr1)
    {
        System.out.println(var);

    }
    return obj_arr1;

}
}
