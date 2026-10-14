export default function EmployeeAdd(props)
{
    function addName(e)
    {
        e.preventDefault()

    }
    return(
        <>
            <form onSubmit={addName}>
                Enter name <input type="text" name="txtnm"></input><br></br>
                <input type="submit"></input>
            </form>
        </>
    )
}