import {useEffect, useState} from "react";
import axios from "axios";

type DataType = {
    id: bigint,
    name: string,
    devMode: boolean,
    someNumber: bigint
}

export const GetDataComponent = () => {
    const [data, setData] = useState<DataType[]>();
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState();
    const [value, setValue] = useState<String>("");

    useEffect(() => {
        axios.get('http://localhost:8080/api/data' + value, {
            // headers: {'Access-Control-Allow-Origin': '*'}
        })
            .then(response => setData(response.data))
            .then(() => console.log(data))
            .catch(error => {
                console.log("Error fetching: " , error);
                setError(error);
            })
            .finally(() => {
                setLoading(false);
            })
    },[value])

    if(error || data == null) return (<>Error!</>);
    if(loading) return (<>Loading...</>);

    function changeDataOutput(option : string) {
        if(option == null) option = "";
        setValue(option);
    }

    return(
        <>
            <div>
                <button onClick={() => changeDataOutput("")}>All</button>
                <button onClick={() => changeDataOutput("/1")}>1</button>
                <button onClick={() => changeDataOutput("/2")}>2</button>
                <button onClick={() => changeDataOutput("/3")}>3</button>
                <button onClick={() => changeDataOutput("/4")}>4</button>
                <button onClick={() => changeDataOutput("/5")}>5</button>
            </div>
            <div>
                Ergebnis in die Konsole!
            </div>
            <div>
                Ergebnislänge: {data.length == 5 ? 5 : 1}
            </div>
            <div>
                Unterschied im frontend!
            </div>
        </>
    );
}