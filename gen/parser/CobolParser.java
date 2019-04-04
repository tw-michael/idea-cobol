// This is a generated file. Not intended for manual editing.
package parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static psi.CobolTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CobolParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ABBREVIATION_LEAF) {
      r = AbbreviationLeaf(b, 0);
    }
    else if (t == ABBREVIATION_REST) {
      r = AbbreviationRest(b, 0);
    }
    else if (t == ACCEPT_STATEMENT) {
      r = AcceptStatement(b, 0);
    }
    else if (t == ACCESS_MODE_CLAUSE) {
      r = AccessModeClause(b, 0);
    }
    else if (t == ADD_STATEMENT) {
      r = AddStatement(b, 0);
    }
    else if (t == ADVANCING_PHRASE) {
      r = AdvancingPhrase(b, 0);
    }
    else if (t == ALPHABET_CLAUSE) {
      r = AlphabetClause(b, 0);
    }
    else if (t == ALPHABET_NAME) {
      r = AlphabetName(b, 0);
    }
    else if (t == ALTER_STATEMENT) {
      r = AlterStatement(b, 0);
    }
    else if (t == ALTERED_GOTO) {
      r = AlteredGoto(b, 0);
    }
    else if (t == ALTERNATE_RECORD_KEY_CLAUSE) {
      r = AlternateRecordKeyClause(b, 0);
    }
    else if (t == ARITHMETIC_EXPRESSION) {
      r = ArithmeticExpression(b, 0);
    }
    else if (t == ASSIGN_CLAUSE) {
      r = AssignClause(b, 0);
    }
    else if (t == ASSIGNMENT_NAME) {
      r = AssignmentName(b, 0);
    }
    else if (t == AUTHOR_PARAGRAPH) {
      r = AuthorParagraph(b, 0);
    }
    else if (t == BASIS) {
      r = Basis(b, 0);
    }
    else if (t == BASIS_NAME) {
      r = BasisName(b, 0);
    }
    else if (t == BEFORE_AFTER_PHRASE) {
      r = BeforeAfterPhrase(b, 0);
    }
    else if (t == BLOCK_CONTAINS_CLAUSE) {
      r = BlockContainsClause(b, 0);
    }
    else if (t == CALL_STATEMENT) {
      r = CallStatement(b, 0);
    }
    else if (t == CANCEL_STATEMENT) {
      r = CancelStatement(b, 0);
    }
    else if (t == CHARACTER_SET_CLAUSE) {
      r = CharacterSetClause(b, 0);
    }
    else if (t == CLASS_CLAUSE) {
      r = ClassClause(b, 0);
    }
    else if (t == CLASS_CONDITION) {
      r = ClassCondition(b, 0);
    }
    else if (t == CLASS_NAME) {
      r = ClassName(b, 0);
    }
    else if (t == CLOSE_STATEMENT) {
      r = CloseStatement(b, 0);
    }
    else if (t == CODE_SET_CLAUSE) {
      r = CodeSetClause(b, 0);
    }
    else if (t == COLLATING_SEQUENCE_CLAUSE) {
      r = CollatingSequenceClause(b, 0);
    }
    else if (t == COMBINABLE_CONDITION) {
      r = CombinableCondition(b, 0);
    }
    else if (t == COMMENT_LINE) {
      r = CommentLine(b, 0);
    }
    else if (t == COMPILATION_UNIT) {
      r = CompilationUnit(b, 0);
    }
    else if (t == COMPUTE_STATEMENT) {
      r = ComputeStatement(b, 0);
    }
    else if (t == COMPUTER_NAME) {
      r = ComputerName(b, 0);
    }
    else if (t == CONDITION) {
      r = Condition(b, 0);
    }
    else if (t == CONDITION_NAME) {
      r = ConditionName(b, 0);
    }
    else if (t == CONDITION_NAME_CONDITION) {
      r = ConditionNameCondition(b, 0);
    }
    else if (t == CONDITION_NAME_REFERENCE) {
      r = ConditionNameReference(b, 0);
    }
    else if (t == CONDITION_VALUE_CLAUSE) {
      r = ConditionValueClause(b, 0);
    }
    else if (t == CONFIGURATION_SECTION) {
      r = ConfigurationSection(b, 0);
    }
    else if (t == CONFIGURATION_SECTION_PARAGRAPH) {
      r = ConfigurationSectionParagraph(b, 0);
    }
    else if (t == CONTINUE_STATEMENT) {
      r = ContinueStatement(b, 0);
    }
    else if (t == CONVERTING_PHRASE) {
      r = ConvertingPhrase(b, 0);
    }
    else if (t == CURRENCY_SIGN_CLAUSE) {
      r = CurrencySignClause(b, 0);
    }
    else if (t == DATA_BLANK_WHEN_ZERO_CLAUSE) {
      r = DataBlankWhenZeroClause(b, 0);
    }
    else if (t == DATA_DESCRIPTION_ENTRY) {
      r = DataDescriptionEntry(b, 0);
    }
    else if (t == DATA_DESCRIPTION_ENTRY_CLAUSE) {
      r = DataDescriptionEntryClause(b, 0);
    }
    else if (t == DATA_DIVISION) {
      r = DataDivision(b, 0);
    }
    else if (t == DATA_DIVISION_SECTION) {
      r = DataDivisionSection(b, 0);
    }
    else if (t == DATA_EXTERNAL_CLAUSE) {
      r = DataExternalClause(b, 0);
    }
    else if (t == DATA_GLOBAL_CLAUSE) {
      r = DataGlobalClause(b, 0);
    }
    else if (t == DATA_JUSTIFIED_CLAUSE) {
      r = DataJustifiedClause(b, 0);
    }
    else if (t == DATA_NAME) {
      r = DataName(b, 0);
    }
    else if (t == DATA_OCCURS_CLAUSE) {
      r = DataOccursClause(b, 0);
    }
    else if (t == DATA_PICTURE_CLAUSE) {
      r = DataPictureClause(b, 0);
    }
    else if (t == DATA_RECORD_CLAUSE) {
      r = DataRecordClause(b, 0);
    }
    else if (t == DATA_REDEFINES_CLAUSE) {
      r = DataRedefinesClause(b, 0);
    }
    else if (t == DATA_SIGN_CLAUSE) {
      r = DataSignClause(b, 0);
    }
    else if (t == DATA_SYNCHRONIZED_CLAUSE) {
      r = DataSynchronizedClause(b, 0);
    }
    else if (t == DATA_USAGE_CLAUSE) {
      r = DataUsageClause(b, 0);
    }
    else if (t == DATA_VALUE_CLAUSE) {
      r = DataValueClause(b, 0);
    }
    else if (t == DATE_COMPILED_PARAGRAPH) {
      r = DateCompiledParagraph(b, 0);
    }
    else if (t == DATE_WRITTEN_PARAGRAPH) {
      r = DateWrittenParagraph(b, 0);
    }
    else if (t == DECIMAL_POINT_CLAUSE) {
      r = DecimalPointClause(b, 0);
    }
    else if (t == DECLARATIVES) {
      r = Declaratives(b, 0);
    }
    else if (t == DELETE_STATEMENT) {
      r = DeleteStatement(b, 0);
    }
    else if (t == DISPLAY_STATEMENT) {
      r = DisplayStatement(b, 0);
    }
    else if (t == DIVIDE_STATEMENT) {
      r = DivideStatement(b, 0);
    }
    else if (t == DYNAMIC_ACCESS_MODE) {
      r = DynamicAccessMode(b, 0);
    }
    else if (t == END_PROGRAM_STATEMENT) {
      r = EndProgramStatement(b, 0);
    }
    else if (t == ENTRY_STATEMENT) {
      r = EntryStatement(b, 0);
    }
    else if (t == ENVIRONMENT_DIVISION) {
      r = EnvironmentDivision(b, 0);
    }
    else if (t == ENVIRONMENT_NAME) {
      r = EnvironmentName(b, 0);
    }
    else if (t == ENVIRONMENT_NAME_IS_MNEMONIC_NAME_CLAUSE) {
      r = EnvironmentNameIsMnemonicNameClause(b, 0);
    }
    else if (t == ENVIRONMENT_SECTION) {
      r = EnvironmentSection(b, 0);
    }
    else if (t == EVALUATE_PHRASE) {
      r = EvaluatePhrase(b, 0);
    }
    else if (t == EVALUATE_STATEMENT) {
      r = EvaluateStatement(b, 0);
    }
    else if (t == EVALUATE_VALUE) {
      r = EvaluateValue(b, 0);
    }
    else if (t == EXIT_PROGRAM_STATEMENT) {
      r = ExitProgramStatement(b, 0);
    }
    else if (t == EXIT_STATEMENT) {
      r = ExitStatement(b, 0);
    }
    else if (t == EXTERNAL_CLAUSE) {
      r = ExternalClause(b, 0);
    }
    else if (t == FIGURATIVE_CONSTANT) {
      r = FigurativeConstant(b, 0);
    }
    else if (t == FILE_AND_SORT_DESCRIPTION_ENTRY) {
      r = FileAndSortDescriptionEntry(b, 0);
    }
    else if (t == FILE_AND_SORT_DESCRIPTION_ENTRY_CLAUSE) {
      r = FileAndSortDescriptionEntryClause(b, 0);
    }
    else if (t == FILE_CONTROL_CLAUSE) {
      r = FileControlClause(b, 0);
    }
    else if (t == FILE_CONTROL_ENTRY) {
      r = FileControlEntry(b, 0);
    }
    else if (t == FILE_CONTROL_PARAGRAPH) {
      r = FileControlParagraph(b, 0);
    }
    else if (t == FILE_NAME) {
      r = FileName(b, 0);
    }
    else if (t == FILE_SECTION) {
      r = FileSection(b, 0);
    }
    else if (t == FILE_STATUS_CLAUSE) {
      r = FileStatusClause(b, 0);
    }
    else if (t == GLOBAL_CLAUSE) {
      r = GlobalClause(b, 0);
    }
    else if (t == GOBACK_STATEMENT) {
      r = GobackStatement(b, 0);
    }
    else if (t == GOTO_STATEMENT) {
      r = GotoStatement(b, 0);
    }
    else if (t == IO_CONTROL_CLAUSE) {
      r = IOControlClause(b, 0);
    }
    else if (t == IO_CONTROL_PARAGRAPH) {
      r = IOControlParagraph(b, 0);
    }
    else if (t == IDENTIFICATION_DIVISION) {
      r = IdentificationDivision(b, 0);
    }
    else if (t == IDENTIFICATION_DIVISION_PARAGRAPH) {
      r = IdentificationDivisionParagraph(b, 0);
    }
    else if (t == IDENTIFIER) {
      r = Identifier(b, 0);
    }
    else if (t == IF_STATEMENT) {
      r = IfStatement(b, 0);
    }
    else if (t == INDEX_NAME) {
      r = IndexName(b, 0);
    }
    else if (t == INDEXED_ORGANIZATION_CLAUSE) {
      r = IndexedOrganizationClause(b, 0);
    }
    else if (t == INITIAL_OR_COMMON) {
      r = InitialOrCommon(b, 0);
    }
    else if (t == INITIALIZE_STATEMENT) {
      r = InitializeStatement(b, 0);
    }
    else if (t == INPUT_OUTPUT_SECTION) {
      r = InputOutputSection(b, 0);
    }
    else if (t == INPUT_OUTPUT_SECTION_PARAGRAPH) {
      r = InputOutputSectionParagraph(b, 0);
    }
    else if (t == INSPECT_STATEMENT) {
      r = InspectStatement(b, 0);
    }
    else if (t == INSTALLATION_PARAGRAPH) {
      r = InstallationParagraph(b, 0);
    }
    else if (t == INTEGER_CONSTANT) {
      r = IntegerConstant(b, 0);
    }
    else if (t == LABEL_RECORDS_CLAUSE) {
      r = LabelRecordsClause(b, 0);
    }
    else if (t == LANGUAGE_NAME) {
      r = LanguageName(b, 0);
    }
    else if (t == LEFTMOST_CHARACTER_POSITION) {
      r = LeftmostCharacterPosition(b, 0);
    }
    else if (t == LENGTH) {
      r = Length(b, 0);
    }
    else if (t == LEVEL_NUMBER) {
      r = LevelNumber(b, 0);
    }
    else if (t == LIBRARY_NAME) {
      r = LibraryName(b, 0);
    }
    else if (t == LINAGE_CLAUSE) {
      r = LinageClause(b, 0);
    }
    else if (t == LINE_SEQUENTIAL_ORGANIZATION_CLAUSE) {
      r = LineSequentialOrganizationClause(b, 0);
    }
    else if (t == LINKAGE_SECTION) {
      r = LinkageSection(b, 0);
    }
    else if (t == LITERAL) {
      r = Literal(b, 0);
    }
    else if (t == MEMORY_SIZE_CLAUSE) {
      r = MemorySizeClause(b, 0);
    }
    else if (t == MERGE_STATEMENT) {
      r = MergeStatement(b, 0);
    }
    else if (t == MNEMONIC_NAME) {
      r = MnemonicName(b, 0);
    }
    else if (t == MODE) {
      r = Mode(b, 0);
    }
    else if (t == MOVE_STATEMENT) {
      r = MoveStatement(b, 0);
    }
    else if (t == MULTIPLE_FILE_CLAUSE) {
      r = MultipleFileClause(b, 0);
    }
    else if (t == MULTIPLY_STATEMENT) {
      r = MultiplyStatement(b, 0);
    }
    else if (t == NESTED_IDENTIFICATION_DIVISION) {
      r = NestedIdentificationDivision(b, 0);
    }
    else if (t == NESTED_PROGRAM_ID_PARAGRAPH) {
      r = NestedProgramIdParagraph(b, 0);
    }
    else if (t == NESTED_PROGRAM_UNIT) {
      r = NestedProgramUnit(b, 0);
    }
    else if (t == NON_NUMERIC_CONSTANT) {
      r = NonNumericConstant(b, 0);
    }
    else if (t == NUMERIC_CONSTANT) {
      r = NumericConstant(b, 0);
    }
    else if (t == OBJECT_COMPUTER_CLAUSE) {
      r = ObjectComputerClause(b, 0);
    }
    else if (t == OBJECT_COMPUTER_PARAGRAPH) {
      r = ObjectComputerParagraph(b, 0);
    }
    else if (t == OPEN_STATEMENT) {
      r = OpenStatement(b, 0);
    }
    else if (t == ORGANIZATION_CLAUSE) {
      r = OrganizationClause(b, 0);
    }
    else if (t == PADDING_CHARACTER_CLAUSE) {
      r = PaddingCharacterClause(b, 0);
    }
    else if (t == PARAGRAPH) {
      r = Paragraph(b, 0);
    }
    else if (t == PARAGRAPH_NAME) {
      r = ParagraphName(b, 0);
    }
    else if (t == PARAGRAPHS) {
      r = Paragraphs(b, 0);
    }
    else if (t == PASSWORD_CLAUSE) {
      r = PasswordClause(b, 0);
    }
    else if (t == PERFORM_FLAVOUR) {
      r = PerformFlavour(b, 0);
    }
    else if (t == PERFORM_PROCEDURE_SCOPE_CLAUSE) {
      r = PerformProcedureScopeClause(b, 0);
    }
    else if (t == PERFORM_STATEMENT) {
      r = PerformStatement(b, 0);
    }
    else if (t == PERFORM_TEST_POSITION_CLAUSE) {
      r = PerformTestPositionClause(b, 0);
    }
    else if (t == PERFORM_TIME_CLAUSE) {
      r = PerformTimeClause(b, 0);
    }
    else if (t == PERFORM_UNTIL_CLAUSE) {
      r = PerformUntilClause(b, 0);
    }
    else if (t == PERFORM_VARYING_CLAUSE) {
      r = PerformVaryingClause(b, 0);
    }
    else if (t == PERFORM_VARYING_WITH_TEST_CLAUSE) {
      r = PerformVaryingWithTestClause(b, 0);
    }
    else if (t == PICTURE_CHARS) {
      r = PictureChars(b, 0);
    }
    else if (t == PICTURE_CURRENCY) {
      r = PictureCurrency(b, 0);
    }
    else if (t == PICTURE_PUNCTUATION) {
      r = PicturePunctuation(b, 0);
    }
    else if (t == PICTURE_STRING) {
      r = PictureString(b, 0);
    }
    else if (t == POWER) {
      r = Power(b, 0);
    }
    else if (t == PROCEDURE_BODY) {
      r = ProcedureBody(b, 0);
    }
    else if (t == PROCEDURE_DIVISION) {
      r = ProcedureDivision(b, 0);
    }
    else if (t == PROCEDURE_NAME) {
      r = ProcedureName(b, 0);
    }
    else if (t == PROCEDURE_SECTION) {
      r = ProcedureSection(b, 0);
    }
    else if (t == PROGRAM_ID_PARAGRAPH) {
      r = ProgramIdParagraph(b, 0);
    }
    else if (t == PROGRAM_NAME) {
      r = ProgramName(b, 0);
    }
    else if (t == PROGRAM_UNIT) {
      r = ProgramUnit(b, 0);
    }
    else if (t == QUALIFIED_DATA_NAME) {
      r = QualifiedDataName(b, 0);
    }
    else if (t == RANDOM_ACCESS_MODE) {
      r = RandomAccessMode(b, 0);
    }
    else if (t == READ_STATEMENT) {
      r = ReadStatement(b, 0);
    }
    else if (t == RECORD_CONTAINS_CLAUSE) {
      r = RecordContainsClause(b, 0);
    }
    else if (t == RECORD_DELIMITER_CLAUSE) {
      r = RecordDelimiterClause(b, 0);
    }
    else if (t == RECORD_NAME) {
      r = RecordName(b, 0);
    }
    else if (t == RECORDING_MODE_CLAUSE) {
      r = RecordingModeClause(b, 0);
    }
    else if (t == RELATION_CONDITION) {
      r = RelationCondition(b, 0);
    }
    else if (t == RELATIONAL_OPERATOR) {
      r = RelationalOperator(b, 0);
    }
    else if (t == RELATIVE_KEY_CLAUSE) {
      r = RelativeKeyClause(b, 0);
    }
    else if (t == RELATIVE_ORGANIZATION_CLAUSE) {
      r = RelativeOrganizationClause(b, 0);
    }
    else if (t == RELEASE_STATEMENT) {
      r = ReleaseStatement(b, 0);
    }
    else if (t == RENAMES_CLAUSE) {
      r = RenamesClause(b, 0);
    }
    else if (t == REPLACING_PHRASE) {
      r = ReplacingPhrase(b, 0);
    }
    else if (t == REPORT_CLAUSE) {
      r = ReportClause(b, 0);
    }
    else if (t == RERUN_2) {
      r = Rerun2(b, 0);
    }
    else if (t == RERUN_CLAUSE) {
      r = RerunClause(b, 0);
    }
    else if (t == RESERVE_CLAUSE) {
      r = ReserveClause(b, 0);
    }
    else if (t == RETURN_STATEMENT) {
      r = ReturnStatement(b, 0);
    }
    else if (t == REWRITE_STATEMENT) {
      r = RewriteStatement(b, 0);
    }
    else if (t == ROUTINE_NAME) {
      r = RoutineName(b, 0);
    }
    else if (t == SAME_AREA_CLAUSE) {
      r = SameAreaClause(b, 0);
    }
    else if (t == SEARCH_STATEMENT) {
      r = SearchStatement(b, 0);
    }
    else if (t == SECTION_HEADER) {
      r = SectionHeader(b, 0);
    }
    else if (t == SECTION_NAME) {
      r = SectionName(b, 0);
    }
    else if (t == SECURITY_PARAGRAPH) {
      r = SecurityParagraph(b, 0);
    }
    else if (t == SEGMENT_LIMIT_CLAUSE) {
      r = SegmentLimitClause(b, 0);
    }
    else if (t == SELECT_CLAUSE) {
      r = SelectClause(b, 0);
    }
    else if (t == SENTENCE) {
      r = Sentence(b, 0);
    }
    else if (t == SEQUENTIAL_ACCESS_MODE) {
      r = SequentialAccessMode(b, 0);
    }
    else if (t == SEQUENTIAL_ORGANIZATION_CLAUSE) {
      r = SequentialOrganizationClause(b, 0);
    }
    else if (t == SET_STATEMENT) {
      r = SetStatement(b, 0);
    }
    else if (t == SIGN_CONDITION) {
      r = SignCondition(b, 0);
    }
    else if (t == SIMPLE_CONDITION) {
      r = SimpleCondition(b, 0);
    }
    else if (t == SORT_STATEMENT) {
      r = SortStatement(b, 0);
    }
    else if (t == SOURCE_COMPUTER_PARAGRAPH) {
      r = SourceComputerParagraph(b, 0);
    }
    else if (t == SPECIAL_NAME_CLAUSE) {
      r = SpecialNameClause(b, 0);
    }
    else if (t == SPECIAL_NAMES_PARAGRAPH) {
      r = SpecialNamesParagraph(b, 0);
    }
    else if (t == SPECIAL_NAMES_PARAGRAPH_STATUS_PHRASE) {
      r = SpecialNamesParagraphStatusPhrase(b, 0);
    }
    else if (t == SPECIAL_REGISTER) {
      r = SpecialRegister(b, 0);
    }
    else if (t == START_STATEMENT) {
      r = StartStatement(b, 0);
    }
    else if (t == STATEMENT) {
      r = Statement(b, 0);
    }
    else if (t == STATEMENT_LIST) {
      r = StatementList(b, 0);
    }
    else if (t == STOP_STATEMENT) {
      r = StopStatement(b, 0);
    }
    else if (t == STRING_STATEMENT) {
      r = StringStatement(b, 0);
    }
    else if (t == SUBSCRIPT) {
      r = Subscript(b, 0);
    }
    else if (t == SUBTRACT_STATEMENT) {
      r = SubtractStatement(b, 0);
    }
    else if (t == SYMBOLIC_CHARACTER) {
      r = SymbolicCharacter(b, 0);
    }
    else if (t == SYMBOLIC_CHARACTERS_CLAUSE) {
      r = SymbolicCharactersClause(b, 0);
    }
    else if (t == SYSTEM_NAME) {
      r = SystemName(b, 0);
    }
    else if (t == TALLYING_PHRASE) {
      r = TallyingPhrase(b, 0);
    }
    else if (t == TIMES_DIV) {
      r = TimesDiv(b, 0);
    }
    else if (t == UNSTRING_STATEMENT) {
      r = UnstringStatement(b, 0);
    }
    else if (t == USE_STATEMENT) {
      r = UseStatement(b, 0);
    }
    else if (t == VALUE_OF_CLAUSE) {
      r = ValueOfClause(b, 0);
    }
    else if (t == WORKING_STORAGE_SECTION) {
      r = WorkingStorageSection(b, 0);
    }
    else if (t == WRITE_STATEMENT) {
      r = WriteStatement(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return CobolWord(b, l + 1);
  }

  /* ********************************************************** */
  // ArithmeticExpression | LPARENCHAR ArithmeticExpression AbbreviationRest RPARENCHAR
  public static boolean AbbreviationLeaf(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbbreviationLeaf")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABBREVIATION_LEAF, "<abbreviation leaf>");
    r = ArithmeticExpression(b, l + 1);
    if (!r) r = AbbreviationLeaf_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LPARENCHAR ArithmeticExpression AbbreviationRest RPARENCHAR
  private static boolean AbbreviationLeaf_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbbreviationLeaf_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPARENCHAR);
    r = r && ArithmeticExpression(b, l + 1);
    r = r && AbbreviationRest(b, l + 1);
    r = r && consumeToken(b, RPARENCHAR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( ( NOT )? ( RelationalOperator )? AbbreviationLeaf )+
  public static boolean AbbreviationRest(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbbreviationRest")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABBREVIATION_REST, "<abbreviation rest>");
    r = AbbreviationRest_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!AbbreviationRest_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AbbreviationRest", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( NOT )? ( RelationalOperator )? AbbreviationLeaf
  private static boolean AbbreviationRest_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbbreviationRest_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AbbreviationRest_0_0(b, l + 1);
    r = r && AbbreviationRest_0_1(b, l + 1);
    r = r && AbbreviationLeaf(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( NOT )?
  private static boolean AbbreviationRest_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbbreviationRest_0_0")) return false;
    consumeToken(b, NOT);
    return true;
  }

  // ( RelationalOperator )?
  private static boolean AbbreviationRest_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbbreviationRest_0_1")) return false;
    AbbreviationRest_0_1_0(b, l + 1);
    return true;
  }

  // ( RelationalOperator )
  private static boolean AbbreviationRest_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbbreviationRest_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RelationalOperator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ACCEPT Identifier FROM ( MnemonicName | EnvironmentName | DATE | DAY | DAY_OF_WEEK | TIME )
  public static boolean AcceptStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AcceptStatement")) return false;
    if (!nextTokenIs(b, ACCEPT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ACCEPT);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, FROM);
    r = r && AcceptStatement_3(b, l + 1);
    exit_section_(b, m, ACCEPT_STATEMENT, r);
    return r;
  }

  // MnemonicName | EnvironmentName | DATE | DAY | DAY_OF_WEEK | TIME
  private static boolean AcceptStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AcceptStatement_3")) return false;
    boolean r;
    r = MnemonicName(b, l + 1);
    if (!r) r = EnvironmentName(b, l + 1);
    if (!r) r = consumeToken(b, DATE);
    if (!r) r = consumeToken(b, DAY);
    if (!r) r = consumeToken(b, DAY_OF_WEEK);
    if (!r) r = consumeToken(b, TIME);
    return r;
  }

  /* ********************************************************** */
  // ACCESS ( MODE )? ( IS )? ( SequentialAccessMode | RandomAccessMode | DynamicAccessMode )
  public static boolean AccessModeClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AccessModeClause")) return false;
    if (!nextTokenIs(b, ACCESS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ACCESS);
    r = r && AccessModeClause_1(b, l + 1);
    r = r && AccessModeClause_2(b, l + 1);
    r = r && AccessModeClause_3(b, l + 1);
    exit_section_(b, m, ACCESS_MODE_CLAUSE, r);
    return r;
  }

  // ( MODE )?
  private static boolean AccessModeClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AccessModeClause_1")) return false;
    consumeToken(b, MODE);
    return true;
  }

  // ( IS )?
  private static boolean AccessModeClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AccessModeClause_2")) return false;
    consumeToken(b, IS);
    return true;
  }

  // SequentialAccessMode | RandomAccessMode | DynamicAccessMode
  private static boolean AccessModeClause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AccessModeClause_3")) return false;
    boolean r;
    r = SequentialAccessMode(b, l + 1);
    if (!r) r = RandomAccessMode(b, l + 1);
    if (!r) r = DynamicAccessMode(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ADD ( ( CORRESPONDING | CORR ) Identifier TO Identifier | ( Identifier | Literal )+ ( TO ( Identifier ( ROUNDED )? )+ | ( TO Identifier )? GIVING ( Identifier ( ROUNDED )? )+ ) ) ( ( ON )? SIZE ERROR StatementList )? ( NOT ( ON )? SIZE ERROR StatementList )? ( END_ADD )?
  public static boolean AddStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement")) return false;
    if (!nextTokenIs(b, ADD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ADD);
    r = r && AddStatement_1(b, l + 1);
    r = r && AddStatement_2(b, l + 1);
    r = r && AddStatement_3(b, l + 1);
    r = r && AddStatement_4(b, l + 1);
    exit_section_(b, m, ADD_STATEMENT, r);
    return r;
  }

  // ( CORRESPONDING | CORR ) Identifier TO Identifier | ( Identifier | Literal )+ ( TO ( Identifier ( ROUNDED )? )+ | ( TO Identifier )? GIVING ( Identifier ( ROUNDED )? )+ )
  private static boolean AddStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AddStatement_1_0(b, l + 1);
    if (!r) r = AddStatement_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( CORRESPONDING | CORR ) Identifier TO Identifier
  private static boolean AddStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AddStatement_1_0_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, TO);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CORRESPONDING | CORR
  private static boolean AddStatement_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, CORRESPONDING);
    if (!r) r = consumeToken(b, CORR);
    return r;
  }

  // ( Identifier | Literal )+ ( TO ( Identifier ( ROUNDED )? )+ | ( TO Identifier )? GIVING ( Identifier ( ROUNDED )? )+ )
  private static boolean AddStatement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AddStatement_1_1_0(b, l + 1);
    r = r && AddStatement_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Identifier | Literal )+
  private static boolean AddStatement_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AddStatement_1_1_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!AddStatement_1_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AddStatement_1_1_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier | Literal
  private static boolean AddStatement_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement_1_1_0_0")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  // TO ( Identifier ( ROUNDED )? )+ | ( TO Identifier )? GIVING ( Identifier ( ROUNDED )? )+
  private static boolean AddStatement_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AddStatement_1_1_1_0(b, l + 1);
    if (!r) r = AddStatement_1_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TO ( Identifier ( ROUNDED )? )+
  private static boolean AddStatement_1_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement_1_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TO);
    r = r && AddStatement_1_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Identifier ( ROUNDED )? )+
  private static boolean AddStatement_1_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement_1_1_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AddStatement_1_1_1_0_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!AddStatement_1_1_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AddStatement_1_1_1_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier ( ROUNDED )?
  private static boolean AddStatement_1_1_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement_1_1_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && AddStatement_1_1_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ROUNDED )?
  private static boolean AddStatement_1_1_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement_1_1_1_0_1_0_1")) return false;
    consumeToken(b, ROUNDED);
    return true;
  }

  // ( TO Identifier )? GIVING ( Identifier ( ROUNDED )? )+
  private static boolean AddStatement_1_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement_1_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AddStatement_1_1_1_1_0(b, l + 1);
    r = r && consumeToken(b, GIVING);
    r = r && AddStatement_1_1_1_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TO Identifier )?
  private static boolean AddStatement_1_1_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement_1_1_1_1_0")) return false;
    AddStatement_1_1_1_1_0_0(b, l + 1);
    return true;
  }

  // TO Identifier
  private static boolean AddStatement_1_1_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement_1_1_1_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TO);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Identifier ( ROUNDED )? )+
  private static boolean AddStatement_1_1_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement_1_1_1_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AddStatement_1_1_1_1_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!AddStatement_1_1_1_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AddStatement_1_1_1_1_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier ( ROUNDED )?
  private static boolean AddStatement_1_1_1_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement_1_1_1_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && AddStatement_1_1_1_1_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ROUNDED )?
  private static boolean AddStatement_1_1_1_1_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement_1_1_1_1_2_0_1")) return false;
    consumeToken(b, ROUNDED);
    return true;
  }

  // ( ( ON )? SIZE ERROR StatementList )?
  private static boolean AddStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement_2")) return false;
    AddStatement_2_0(b, l + 1);
    return true;
  }

  // ( ON )? SIZE ERROR StatementList
  private static boolean AddStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AddStatement_2_0_0(b, l + 1);
    r = r && consumeTokens(b, 0, SIZE, ERROR);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ON )?
  private static boolean AddStatement_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement_2_0_0")) return false;
    consumeToken(b, ON);
    return true;
  }

  // ( NOT ( ON )? SIZE ERROR StatementList )?
  private static boolean AddStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement_3")) return false;
    AddStatement_3_0(b, l + 1);
    return true;
  }

  // NOT ( ON )? SIZE ERROR StatementList
  private static boolean AddStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && AddStatement_3_0_1(b, l + 1);
    r = r && consumeTokens(b, 0, SIZE, ERROR);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ON )?
  private static boolean AddStatement_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement_3_0_1")) return false;
    consumeToken(b, ON);
    return true;
  }

  // ( END_ADD )?
  private static boolean AddStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddStatement_4")) return false;
    consumeToken(b, END_ADD);
    return true;
  }

  /* ********************************************************** */
  // ( BEFORE | AFTER ) ( ADVANCING )? ( PAGE | ( Identifier | IntegerConstant ) ( ( LINE | LINES ) )? | MnemonicName )
  public static boolean AdvancingPhrase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AdvancingPhrase")) return false;
    if (!nextTokenIs(b, "<advancing phrase>", AFTER, BEFORE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADVANCING_PHRASE, "<advancing phrase>");
    r = AdvancingPhrase_0(b, l + 1);
    r = r && AdvancingPhrase_1(b, l + 1);
    r = r && AdvancingPhrase_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // BEFORE | AFTER
  private static boolean AdvancingPhrase_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AdvancingPhrase_0")) return false;
    boolean r;
    r = consumeToken(b, BEFORE);
    if (!r) r = consumeToken(b, AFTER);
    return r;
  }

  // ( ADVANCING )?
  private static boolean AdvancingPhrase_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AdvancingPhrase_1")) return false;
    consumeToken(b, ADVANCING);
    return true;
  }

  // PAGE | ( Identifier | IntegerConstant ) ( ( LINE | LINES ) )? | MnemonicName
  private static boolean AdvancingPhrase_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AdvancingPhrase_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PAGE);
    if (!r) r = AdvancingPhrase_2_1(b, l + 1);
    if (!r) r = MnemonicName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Identifier | IntegerConstant ) ( ( LINE | LINES ) )?
  private static boolean AdvancingPhrase_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AdvancingPhrase_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AdvancingPhrase_2_1_0(b, l + 1);
    r = r && AdvancingPhrase_2_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier | IntegerConstant
  private static boolean AdvancingPhrase_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AdvancingPhrase_2_1_0")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = IntegerConstant(b, l + 1);
    return r;
  }

  // ( ( LINE | LINES ) )?
  private static boolean AdvancingPhrase_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AdvancingPhrase_2_1_1")) return false;
    AdvancingPhrase_2_1_1_0(b, l + 1);
    return true;
  }

  // LINE | LINES
  private static boolean AdvancingPhrase_2_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AdvancingPhrase_2_1_1_0")) return false;
    boolean r;
    r = consumeToken(b, LINE);
    if (!r) r = consumeToken(b, LINES);
    return r;
  }

  /* ********************************************************** */
  // ALPHABET AlphabetName ( IS )? ( STANDARD_1 | STANDARD_2 | NATIVE | CobolWord | ( Literal ( ( ( THROUGH | THRU ) Literal | ( ALSO Literal )+ ) )? )+ )
  public static boolean AlphabetClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlphabetClause")) return false;
    if (!nextTokenIs(b, ALPHABET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALPHABET);
    r = r && AlphabetName(b, l + 1);
    r = r && AlphabetClause_2(b, l + 1);
    r = r && AlphabetClause_3(b, l + 1);
    exit_section_(b, m, ALPHABET_CLAUSE, r);
    return r;
  }

  // ( IS )?
  private static boolean AlphabetClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlphabetClause_2")) return false;
    consumeToken(b, IS);
    return true;
  }

  // STANDARD_1 | STANDARD_2 | NATIVE | CobolWord | ( Literal ( ( ( THROUGH | THRU ) Literal | ( ALSO Literal )+ ) )? )+
  private static boolean AlphabetClause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlphabetClause_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STANDARD_1);
    if (!r) r = consumeToken(b, STANDARD_2);
    if (!r) r = consumeToken(b, NATIVE);
    if (!r) r = CobolWord(b, l + 1);
    if (!r) r = AlphabetClause_3_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Literal ( ( ( THROUGH | THRU ) Literal | ( ALSO Literal )+ ) )? )+
  private static boolean AlphabetClause_3_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlphabetClause_3_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AlphabetClause_3_4_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!AlphabetClause_3_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AlphabetClause_3_4", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // Literal ( ( ( THROUGH | THRU ) Literal | ( ALSO Literal )+ ) )?
  private static boolean AlphabetClause_3_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlphabetClause_3_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Literal(b, l + 1);
    r = r && AlphabetClause_3_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( ( THROUGH | THRU ) Literal | ( ALSO Literal )+ ) )?
  private static boolean AlphabetClause_3_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlphabetClause_3_4_0_1")) return false;
    AlphabetClause_3_4_0_1_0(b, l + 1);
    return true;
  }

  // ( THROUGH | THRU ) Literal | ( ALSO Literal )+
  private static boolean AlphabetClause_3_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlphabetClause_3_4_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AlphabetClause_3_4_0_1_0_0(b, l + 1);
    if (!r) r = AlphabetClause_3_4_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( THROUGH | THRU ) Literal
  private static boolean AlphabetClause_3_4_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlphabetClause_3_4_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AlphabetClause_3_4_0_1_0_0_0(b, l + 1);
    r = r && Literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // THROUGH | THRU
  private static boolean AlphabetClause_3_4_0_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlphabetClause_3_4_0_1_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, THROUGH);
    if (!r) r = consumeToken(b, THRU);
    return r;
  }

  // ( ALSO Literal )+
  private static boolean AlphabetClause_3_4_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlphabetClause_3_4_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AlphabetClause_3_4_0_1_0_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!AlphabetClause_3_4_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AlphabetClause_3_4_0_1_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ALSO Literal
  private static boolean AlphabetClause_3_4_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlphabetClause_3_4_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALSO);
    r = r && Literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CobolWord
  public static boolean AlphabetName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlphabetName")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CobolWord(b, l + 1);
    exit_section_(b, m, ALPHABET_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // ALTER ( ProcedureName TO ( PROCEED TO )? ProcedureName )+
  public static boolean AlterStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlterStatement")) return false;
    if (!nextTokenIs(b, ALTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALTER);
    r = r && AlterStatement_1(b, l + 1);
    exit_section_(b, m, ALTER_STATEMENT, r);
    return r;
  }

  // ( ProcedureName TO ( PROCEED TO )? ProcedureName )+
  private static boolean AlterStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlterStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AlterStatement_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!AlterStatement_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AlterStatement_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ProcedureName TO ( PROCEED TO )? ProcedureName
  private static boolean AlterStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlterStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ProcedureName(b, l + 1);
    r = r && consumeToken(b, TO);
    r = r && AlterStatement_1_0_2(b, l + 1);
    r = r && ProcedureName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( PROCEED TO )?
  private static boolean AlterStatement_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlterStatement_1_0_2")) return false;
    AlterStatement_1_0_2_0(b, l + 1);
    return true;
  }

  // PROCEED TO
  private static boolean AlterStatement_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlterStatement_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PROCEED, TO);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // GO ( TO )? DOT
  public static boolean AlteredGoto(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlteredGoto")) return false;
    if (!nextTokenIs(b, GO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GO);
    r = r && AlteredGoto_1(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, ALTERED_GOTO, r);
    return r;
  }

  // ( TO )?
  private static boolean AlteredGoto_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlteredGoto_1")) return false;
    consumeToken(b, TO);
    return true;
  }

  /* ********************************************************** */
  // ALTERNATE RECORD ( KEY )? ( IS )? QualifiedDataName ( PasswordClause )? ( ( WITH )? DUPLICATES )?
  public static boolean AlternateRecordKeyClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlternateRecordKeyClause")) return false;
    if (!nextTokenIs(b, ALTERNATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ALTERNATE, RECORD);
    r = r && AlternateRecordKeyClause_2(b, l + 1);
    r = r && AlternateRecordKeyClause_3(b, l + 1);
    r = r && QualifiedDataName(b, l + 1);
    r = r && AlternateRecordKeyClause_5(b, l + 1);
    r = r && AlternateRecordKeyClause_6(b, l + 1);
    exit_section_(b, m, ALTERNATE_RECORD_KEY_CLAUSE, r);
    return r;
  }

  // ( KEY )?
  private static boolean AlternateRecordKeyClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlternateRecordKeyClause_2")) return false;
    consumeToken(b, KEY);
    return true;
  }

  // ( IS )?
  private static boolean AlternateRecordKeyClause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlternateRecordKeyClause_3")) return false;
    consumeToken(b, IS);
    return true;
  }

  // ( PasswordClause )?
  private static boolean AlternateRecordKeyClause_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlternateRecordKeyClause_5")) return false;
    AlternateRecordKeyClause_5_0(b, l + 1);
    return true;
  }

  // ( PasswordClause )
  private static boolean AlternateRecordKeyClause_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlternateRecordKeyClause_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PasswordClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( WITH )? DUPLICATES )?
  private static boolean AlternateRecordKeyClause_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlternateRecordKeyClause_6")) return false;
    AlternateRecordKeyClause_6_0(b, l + 1);
    return true;
  }

  // ( WITH )? DUPLICATES
  private static boolean AlternateRecordKeyClause_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlternateRecordKeyClause_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AlternateRecordKeyClause_6_0_0(b, l + 1);
    r = r && consumeToken(b, DUPLICATES);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WITH )?
  private static boolean AlternateRecordKeyClause_6_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlternateRecordKeyClause_6_0_0")) return false;
    consumeToken(b, WITH);
    return true;
  }

  /* ********************************************************** */
  // TimesDiv ( ( PLUSCHAR | MINUSCHAR ) TimesDiv )*
  public static boolean ArithmeticExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArithmeticExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARITHMETIC_EXPRESSION, "<arithmetic expression>");
    r = TimesDiv(b, l + 1);
    r = r && ArithmeticExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ( PLUSCHAR | MINUSCHAR ) TimesDiv )*
  private static boolean ArithmeticExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArithmeticExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ArithmeticExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ArithmeticExpression_1", c)) break;
    }
    return true;
  }

  // ( PLUSCHAR | MINUSCHAR ) TimesDiv
  private static boolean ArithmeticExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArithmeticExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArithmeticExpression_1_0_0(b, l + 1);
    r = r && TimesDiv(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PLUSCHAR | MINUSCHAR
  private static boolean ArithmeticExpression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArithmeticExpression_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, PLUSCHAR);
    if (!r) r = consumeToken(b, MINUSCHAR);
    return r;
  }

  /* ********************************************************** */
  // ASSIGN ( TO )? ( AssignmentName | Literal )
  public static boolean AssignClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignClause")) return false;
    if (!nextTokenIs(b, ASSIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && AssignClause_1(b, l + 1);
    r = r && AssignClause_2(b, l + 1);
    exit_section_(b, m, ASSIGN_CLAUSE, r);
    return r;
  }

  // ( TO )?
  private static boolean AssignClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignClause_1")) return false;
    consumeToken(b, TO);
    return true;
  }

  // AssignmentName | Literal
  private static boolean AssignClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignClause_2")) return false;
    boolean r;
    r = AssignmentName(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // SystemName
  public static boolean AssignmentName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentName")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SystemName(b, l + 1);
    exit_section_(b, m, ASSIGNMENT_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // AUTHOR DOT ( CommentLine )?
  public static boolean AuthorParagraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AuthorParagraph")) return false;
    if (!nextTokenIs(b, AUTHOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AUTHOR, DOT);
    r = r && AuthorParagraph_2(b, l + 1);
    exit_section_(b, m, AUTHOR_PARAGRAPH, r);
    return r;
  }

  // ( CommentLine )?
  private static boolean AuthorParagraph_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AuthorParagraph_2")) return false;
    AuthorParagraph_2_0(b, l + 1);
    return true;
  }

  // ( CommentLine )
  private static boolean AuthorParagraph_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AuthorParagraph_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CommentLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier | Literal | LPARENCHAR ArithmeticExpression RPARENCHAR
  public static boolean Basis(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Basis")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASIS, "<basis>");
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    if (!r) r = Basis_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LPARENCHAR ArithmeticExpression RPARENCHAR
  private static boolean Basis_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Basis_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPARENCHAR);
    r = r && ArithmeticExpression(b, l + 1);
    r = r && consumeToken(b, RPARENCHAR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ProgramName
  public static boolean BasisName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasisName")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ProgramName(b, l + 1);
    exit_section_(b, m, BASIS_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // ( BEFORE | AFTER ) ( INITIAL )? ( Identifier | Literal )
  public static boolean BeforeAfterPhrase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeforeAfterPhrase")) return false;
    if (!nextTokenIs(b, "<before after phrase>", AFTER, BEFORE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BEFORE_AFTER_PHRASE, "<before after phrase>");
    r = BeforeAfterPhrase_0(b, l + 1);
    r = r && BeforeAfterPhrase_1(b, l + 1);
    r = r && BeforeAfterPhrase_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // BEFORE | AFTER
  private static boolean BeforeAfterPhrase_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeforeAfterPhrase_0")) return false;
    boolean r;
    r = consumeToken(b, BEFORE);
    if (!r) r = consumeToken(b, AFTER);
    return r;
  }

  // ( INITIAL )?
  private static boolean BeforeAfterPhrase_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeforeAfterPhrase_1")) return false;
    consumeToken(b, INITIAL);
    return true;
  }

  // Identifier | Literal
  private static boolean BeforeAfterPhrase_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeforeAfterPhrase_2")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // BLOCK ( CONTAINS )? ( IntegerConstant TO )? IntegerConstant ( RECORDS | CHARACTERS )?
  public static boolean BlockContainsClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockContainsClause")) return false;
    if (!nextTokenIs(b, BLOCK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BLOCK);
    r = r && BlockContainsClause_1(b, l + 1);
    r = r && BlockContainsClause_2(b, l + 1);
    r = r && IntegerConstant(b, l + 1);
    r = r && BlockContainsClause_4(b, l + 1);
    exit_section_(b, m, BLOCK_CONTAINS_CLAUSE, r);
    return r;
  }

  // ( CONTAINS )?
  private static boolean BlockContainsClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockContainsClause_1")) return false;
    consumeToken(b, CONTAINS);
    return true;
  }

  // ( IntegerConstant TO )?
  private static boolean BlockContainsClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockContainsClause_2")) return false;
    BlockContainsClause_2_0(b, l + 1);
    return true;
  }

  // IntegerConstant TO
  private static boolean BlockContainsClause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockContainsClause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IntegerConstant(b, l + 1);
    r = r && consumeToken(b, TO);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( RECORDS | CHARACTERS )?
  private static boolean BlockContainsClause_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockContainsClause_4")) return false;
    BlockContainsClause_4_0(b, l + 1);
    return true;
  }

  // RECORDS | CHARACTERS
  private static boolean BlockContainsClause_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockContainsClause_4_0")) return false;
    boolean r;
    r = consumeToken(b, RECORDS);
    if (!r) r = consumeToken(b, CHARACTERS);
    return r;
  }

  /* ********************************************************** */
  // CALL ( Identifier | Literal ) ( USING ( ( ( ( BY )? REFERENCE )? ( ( Identifier | ADDRESS OF Identifier | FileName ) )+ | ( BY )? CONTENT ( ( ( LENGTH OF )? Identifier | ADDRESS OF Identifier | Literal ) )+ ) )+ )? ( ( ON )? OVERFLOW StatementList )? ( ( ON )? EXCEPTION StatementList )? ( NOT ( ON )? EXCEPTION StatementList )? ( END_CALL )?
  public static boolean CallStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement")) return false;
    if (!nextTokenIs(b, CALL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CALL);
    r = r && CallStatement_1(b, l + 1);
    r = r && CallStatement_2(b, l + 1);
    r = r && CallStatement_3(b, l + 1);
    r = r && CallStatement_4(b, l + 1);
    r = r && CallStatement_5(b, l + 1);
    r = r && CallStatement_6(b, l + 1);
    exit_section_(b, m, CALL_STATEMENT, r);
    return r;
  }

  // Identifier | Literal
  private static boolean CallStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_1")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  // ( USING ( ( ( ( BY )? REFERENCE )? ( ( Identifier | ADDRESS OF Identifier | FileName ) )+ | ( BY )? CONTENT ( ( ( LENGTH OF )? Identifier | ADDRESS OF Identifier | Literal ) )+ ) )+ )?
  private static boolean CallStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_2")) return false;
    CallStatement_2_0(b, l + 1);
    return true;
  }

  // USING ( ( ( ( BY )? REFERENCE )? ( ( Identifier | ADDRESS OF Identifier | FileName ) )+ | ( BY )? CONTENT ( ( ( LENGTH OF )? Identifier | ADDRESS OF Identifier | Literal ) )+ ) )+
  private static boolean CallStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USING);
    r = r && CallStatement_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( ( ( BY )? REFERENCE )? ( ( Identifier | ADDRESS OF Identifier | FileName ) )+ | ( BY )? CONTENT ( ( ( LENGTH OF )? Identifier | ADDRESS OF Identifier | Literal ) )+ ) )+
  private static boolean CallStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallStatement_2_0_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!CallStatement_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CallStatement_2_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( BY )? REFERENCE )? ( ( Identifier | ADDRESS OF Identifier | FileName ) )+ | ( BY )? CONTENT ( ( ( LENGTH OF )? Identifier | ADDRESS OF Identifier | Literal ) )+
  private static boolean CallStatement_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallStatement_2_0_1_0_0(b, l + 1);
    if (!r) r = CallStatement_2_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( BY )? REFERENCE )? ( ( Identifier | ADDRESS OF Identifier | FileName ) )+
  private static boolean CallStatement_2_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_2_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallStatement_2_0_1_0_0_0(b, l + 1);
    r = r && CallStatement_2_0_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( BY )? REFERENCE )?
  private static boolean CallStatement_2_0_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_2_0_1_0_0_0")) return false;
    CallStatement_2_0_1_0_0_0_0(b, l + 1);
    return true;
  }

  // ( BY )? REFERENCE
  private static boolean CallStatement_2_0_1_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_2_0_1_0_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallStatement_2_0_1_0_0_0_0_0(b, l + 1);
    r = r && consumeToken(b, REFERENCE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( BY )?
  private static boolean CallStatement_2_0_1_0_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_2_0_1_0_0_0_0_0")) return false;
    consumeToken(b, BY);
    return true;
  }

  // ( ( Identifier | ADDRESS OF Identifier | FileName ) )+
  private static boolean CallStatement_2_0_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_2_0_1_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallStatement_2_0_1_0_0_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!CallStatement_2_0_1_0_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CallStatement_2_0_1_0_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier | ADDRESS OF Identifier | FileName
  private static boolean CallStatement_2_0_1_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_2_0_1_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    if (!r) r = CallStatement_2_0_1_0_0_1_0_1(b, l + 1);
    if (!r) r = FileName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ADDRESS OF Identifier
  private static boolean CallStatement_2_0_1_0_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_2_0_1_0_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ADDRESS, OF);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( BY )? CONTENT ( ( ( LENGTH OF )? Identifier | ADDRESS OF Identifier | Literal ) )+
  private static boolean CallStatement_2_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_2_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallStatement_2_0_1_0_1_0(b, l + 1);
    r = r && consumeToken(b, CONTENT);
    r = r && CallStatement_2_0_1_0_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( BY )?
  private static boolean CallStatement_2_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_2_0_1_0_1_0")) return false;
    consumeToken(b, BY);
    return true;
  }

  // ( ( ( LENGTH OF )? Identifier | ADDRESS OF Identifier | Literal ) )+
  private static boolean CallStatement_2_0_1_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_2_0_1_0_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallStatement_2_0_1_0_1_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!CallStatement_2_0_1_0_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CallStatement_2_0_1_0_1_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( LENGTH OF )? Identifier | ADDRESS OF Identifier | Literal
  private static boolean CallStatement_2_0_1_0_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_2_0_1_0_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallStatement_2_0_1_0_1_2_0_0(b, l + 1);
    if (!r) r = CallStatement_2_0_1_0_1_2_0_1(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( LENGTH OF )? Identifier
  private static boolean CallStatement_2_0_1_0_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_2_0_1_0_1_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallStatement_2_0_1_0_1_2_0_0_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( LENGTH OF )?
  private static boolean CallStatement_2_0_1_0_1_2_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_2_0_1_0_1_2_0_0_0")) return false;
    CallStatement_2_0_1_0_1_2_0_0_0_0(b, l + 1);
    return true;
  }

  // LENGTH OF
  private static boolean CallStatement_2_0_1_0_1_2_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_2_0_1_0_1_2_0_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LENGTH, OF);
    exit_section_(b, m, null, r);
    return r;
  }

  // ADDRESS OF Identifier
  private static boolean CallStatement_2_0_1_0_1_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_2_0_1_0_1_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ADDRESS, OF);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( ON )? OVERFLOW StatementList )?
  private static boolean CallStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_3")) return false;
    CallStatement_3_0(b, l + 1);
    return true;
  }

  // ( ON )? OVERFLOW StatementList
  private static boolean CallStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallStatement_3_0_0(b, l + 1);
    r = r && consumeToken(b, OVERFLOW);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ON )?
  private static boolean CallStatement_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_3_0_0")) return false;
    consumeToken(b, ON);
    return true;
  }

  // ( ( ON )? EXCEPTION StatementList )?
  private static boolean CallStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_4")) return false;
    CallStatement_4_0(b, l + 1);
    return true;
  }

  // ( ON )? EXCEPTION StatementList
  private static boolean CallStatement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallStatement_4_0_0(b, l + 1);
    r = r && consumeToken(b, EXCEPTION);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ON )?
  private static boolean CallStatement_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_4_0_0")) return false;
    consumeToken(b, ON);
    return true;
  }

  // ( NOT ( ON )? EXCEPTION StatementList )?
  private static boolean CallStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_5")) return false;
    CallStatement_5_0(b, l + 1);
    return true;
  }

  // NOT ( ON )? EXCEPTION StatementList
  private static boolean CallStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && CallStatement_5_0_1(b, l + 1);
    r = r && consumeToken(b, EXCEPTION);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ON )?
  private static boolean CallStatement_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_5_0_1")) return false;
    consumeToken(b, ON);
    return true;
  }

  // ( END_CALL )?
  private static boolean CallStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_6")) return false;
    consumeToken(b, END_CALL);
    return true;
  }

  /* ********************************************************** */
  // CANCEL ( Identifier | Literal )+
  public static boolean CancelStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CancelStatement")) return false;
    if (!nextTokenIs(b, CANCEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CANCEL);
    r = r && CancelStatement_1(b, l + 1);
    exit_section_(b, m, CANCEL_STATEMENT, r);
    return r;
  }

  // ( Identifier | Literal )+
  private static boolean CancelStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CancelStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CancelStatement_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!CancelStatement_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CancelStatement_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier | Literal
  private static boolean CancelStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CancelStatement_1_0")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // CHARACTER SET ( CommentLine )?
  public static boolean CharacterSetClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CharacterSetClause")) return false;
    if (!nextTokenIs(b, CHARACTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CHARACTER, SET);
    r = r && CharacterSetClause_2(b, l + 1);
    exit_section_(b, m, CHARACTER_SET_CLAUSE, r);
    return r;
  }

  // ( CommentLine )?
  private static boolean CharacterSetClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CharacterSetClause_2")) return false;
    CharacterSetClause_2_0(b, l + 1);
    return true;
  }

  // ( CommentLine )
  private static boolean CharacterSetClause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CharacterSetClause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CommentLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CLASS ClassName ( IS )? ( Literal ( ( THROUGH | THRU ) Literal )? )+
  public static boolean ClassClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassClause")) return false;
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLASS);
    r = r && ClassName(b, l + 1);
    r = r && ClassClause_2(b, l + 1);
    r = r && ClassClause_3(b, l + 1);
    exit_section_(b, m, CLASS_CLAUSE, r);
    return r;
  }

  // ( IS )?
  private static boolean ClassClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassClause_2")) return false;
    consumeToken(b, IS);
    return true;
  }

  // ( Literal ( ( THROUGH | THRU ) Literal )? )+
  private static boolean ClassClause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassClause_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ClassClause_3_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ClassClause_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ClassClause_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // Literal ( ( THROUGH | THRU ) Literal )?
  private static boolean ClassClause_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassClause_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Literal(b, l + 1);
    r = r && ClassClause_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( THROUGH | THRU ) Literal )?
  private static boolean ClassClause_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassClause_3_0_1")) return false;
    ClassClause_3_0_1_0(b, l + 1);
    return true;
  }

  // ( THROUGH | THRU ) Literal
  private static boolean ClassClause_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassClause_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ClassClause_3_0_1_0_0(b, l + 1);
    r = r && Literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // THROUGH | THRU
  private static boolean ClassClause_3_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassClause_3_0_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, THROUGH);
    if (!r) r = consumeToken(b, THRU);
    return r;
  }

  /* ********************************************************** */
  // Identifier ( IS )? ( NOT )? ( NUMERIC | ALPHABETIC | ALPHABETIC_LOWER | ALPHABETIC_UPPER | ClassName | DBCS | KANJI )
  public static boolean ClassCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassCondition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_CONDITION, "<class condition>");
    r = Identifier(b, l + 1);
    r = r && ClassCondition_1(b, l + 1);
    r = r && ClassCondition_2(b, l + 1);
    r = r && ClassCondition_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( IS )?
  private static boolean ClassCondition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassCondition_1")) return false;
    consumeToken(b, IS);
    return true;
  }

  // ( NOT )?
  private static boolean ClassCondition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassCondition_2")) return false;
    consumeToken(b, NOT);
    return true;
  }

  // NUMERIC | ALPHABETIC | ALPHABETIC_LOWER | ALPHABETIC_UPPER | ClassName | DBCS | KANJI
  private static boolean ClassCondition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassCondition_3")) return false;
    boolean r;
    r = consumeToken(b, NUMERIC);
    if (!r) r = consumeToken(b, ALPHABETIC);
    if (!r) r = consumeToken(b, ALPHABETIC_LOWER);
    if (!r) r = consumeToken(b, ALPHABETIC_UPPER);
    if (!r) r = ClassName(b, l + 1);
    if (!r) r = consumeToken(b, DBCS);
    if (!r) r = consumeToken(b, KANJI);
    return r;
  }

  /* ********************************************************** */
  // CobolWord
  public static boolean ClassName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassName")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CobolWord(b, l + 1);
    exit_section_(b, m, CLASS_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // CLOSE ( FileName ( ( ( REEL | UNIT ) ( ( ( FOR )? REMOVAL | ( WITH )? NO REWIND ) )? | ( WITH )? ( NO REWIND | LOCK ) ) )? )+
  public static boolean CloseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CloseStatement")) return false;
    if (!nextTokenIs(b, CLOSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLOSE);
    r = r && CloseStatement_1(b, l + 1);
    exit_section_(b, m, CLOSE_STATEMENT, r);
    return r;
  }

  // ( FileName ( ( ( REEL | UNIT ) ( ( ( FOR )? REMOVAL | ( WITH )? NO REWIND ) )? | ( WITH )? ( NO REWIND | LOCK ) ) )? )+
  private static boolean CloseStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CloseStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CloseStatement_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!CloseStatement_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CloseStatement_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // FileName ( ( ( REEL | UNIT ) ( ( ( FOR )? REMOVAL | ( WITH )? NO REWIND ) )? | ( WITH )? ( NO REWIND | LOCK ) ) )?
  private static boolean CloseStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CloseStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FileName(b, l + 1);
    r = r && CloseStatement_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( ( REEL | UNIT ) ( ( ( FOR )? REMOVAL | ( WITH )? NO REWIND ) )? | ( WITH )? ( NO REWIND | LOCK ) ) )?
  private static boolean CloseStatement_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CloseStatement_1_0_1")) return false;
    CloseStatement_1_0_1_0(b, l + 1);
    return true;
  }

  // ( REEL | UNIT ) ( ( ( FOR )? REMOVAL | ( WITH )? NO REWIND ) )? | ( WITH )? ( NO REWIND | LOCK )
  private static boolean CloseStatement_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CloseStatement_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CloseStatement_1_0_1_0_0(b, l + 1);
    if (!r) r = CloseStatement_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( REEL | UNIT ) ( ( ( FOR )? REMOVAL | ( WITH )? NO REWIND ) )?
  private static boolean CloseStatement_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CloseStatement_1_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CloseStatement_1_0_1_0_0_0(b, l + 1);
    r = r && CloseStatement_1_0_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // REEL | UNIT
  private static boolean CloseStatement_1_0_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CloseStatement_1_0_1_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, REEL);
    if (!r) r = consumeToken(b, UNIT);
    return r;
  }

  // ( ( ( FOR )? REMOVAL | ( WITH )? NO REWIND ) )?
  private static boolean CloseStatement_1_0_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CloseStatement_1_0_1_0_0_1")) return false;
    CloseStatement_1_0_1_0_0_1_0(b, l + 1);
    return true;
  }

  // ( FOR )? REMOVAL | ( WITH )? NO REWIND
  private static boolean CloseStatement_1_0_1_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CloseStatement_1_0_1_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CloseStatement_1_0_1_0_0_1_0_0(b, l + 1);
    if (!r) r = CloseStatement_1_0_1_0_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FOR )? REMOVAL
  private static boolean CloseStatement_1_0_1_0_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CloseStatement_1_0_1_0_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CloseStatement_1_0_1_0_0_1_0_0_0(b, l + 1);
    r = r && consumeToken(b, REMOVAL);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FOR )?
  private static boolean CloseStatement_1_0_1_0_0_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CloseStatement_1_0_1_0_0_1_0_0_0")) return false;
    consumeToken(b, FOR);
    return true;
  }

  // ( WITH )? NO REWIND
  private static boolean CloseStatement_1_0_1_0_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CloseStatement_1_0_1_0_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CloseStatement_1_0_1_0_0_1_0_1_0(b, l + 1);
    r = r && consumeTokens(b, 0, NO, REWIND);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WITH )?
  private static boolean CloseStatement_1_0_1_0_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CloseStatement_1_0_1_0_0_1_0_1_0")) return false;
    consumeToken(b, WITH);
    return true;
  }

  // ( WITH )? ( NO REWIND | LOCK )
  private static boolean CloseStatement_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CloseStatement_1_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CloseStatement_1_0_1_0_1_0(b, l + 1);
    r = r && CloseStatement_1_0_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WITH )?
  private static boolean CloseStatement_1_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CloseStatement_1_0_1_0_1_0")) return false;
    consumeToken(b, WITH);
    return true;
  }

  // NO REWIND | LOCK
  private static boolean CloseStatement_1_0_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CloseStatement_1_0_1_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, NO, REWIND);
    if (!r) r = consumeToken(b, LOCK);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // COBOL_WORD
  static boolean CobolWord(PsiBuilder b, int l) {
    return consumeToken(b, COBOL_WORD);
  }

  /* ********************************************************** */
  // CODE_SET ( IS )? AlphabetName
  public static boolean CodeSetClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CodeSetClause")) return false;
    if (!nextTokenIs(b, CODE_SET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CODE_SET);
    r = r && CodeSetClause_1(b, l + 1);
    r = r && AlphabetName(b, l + 1);
    exit_section_(b, m, CODE_SET_CLAUSE, r);
    return r;
  }

  // ( IS )?
  private static boolean CodeSetClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CodeSetClause_1")) return false;
    consumeToken(b, IS);
    return true;
  }

  /* ********************************************************** */
  // ( PROGRAM )? ( COLLATING )? SEQUENCE ( IS )? AlphabetName
  public static boolean CollatingSequenceClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CollatingSequenceClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COLLATING_SEQUENCE_CLAUSE, "<collating sequence clause>");
    r = CollatingSequenceClause_0(b, l + 1);
    r = r && CollatingSequenceClause_1(b, l + 1);
    r = r && consumeToken(b, SEQUENCE);
    r = r && CollatingSequenceClause_3(b, l + 1);
    r = r && AlphabetName(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( PROGRAM )?
  private static boolean CollatingSequenceClause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CollatingSequenceClause_0")) return false;
    consumeToken(b, PROGRAM);
    return true;
  }

  // ( COLLATING )?
  private static boolean CollatingSequenceClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CollatingSequenceClause_1")) return false;
    consumeToken(b, COLLATING);
    return true;
  }

  // ( IS )?
  private static boolean CollatingSequenceClause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CollatingSequenceClause_3")) return false;
    consumeToken(b, IS);
    return true;
  }

  /* ********************************************************** */
  // ( NOT )? SimpleCondition
  public static boolean CombinableCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CombinableCondition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMBINABLE_CONDITION, "<combinable condition>");
    r = CombinableCondition_0(b, l + 1);
    r = r && SimpleCondition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( NOT )?
  private static boolean CombinableCondition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CombinableCondition_0")) return false;
    consumeToken(b, NOT);
    return true;
  }

  /* ********************************************************** */
  // ( ( ( COBOL_WORD )+ | QUOTEDSTRING ) DOT )+
  public static boolean CommentLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommentLine")) return false;
    if (!nextTokenIs(b, "<comment line>", COBOL_WORD, QUOTEDSTRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMENT_LINE, "<comment line>");
    r = CommentLine_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!CommentLine_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CommentLine", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ( COBOL_WORD )+ | QUOTEDSTRING ) DOT
  private static boolean CommentLine_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommentLine_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CommentLine_0_0(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( COBOL_WORD )+ | QUOTEDSTRING
  private static boolean CommentLine_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommentLine_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CommentLine_0_0_0(b, l + 1);
    if (!r) r = consumeToken(b, QUOTEDSTRING);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( COBOL_WORD )+
  private static boolean CommentLine_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommentLine_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COBOL_WORD);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, COBOL_WORD)) break;
      if (!empty_element_parsed_guard_(b, "CommentLine_0_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ProgramUnit ( NestedProgramUnit EndProgramStatement )* ( EndProgramStatement ( CompilationUnit )* )? EOF
  public static boolean CompilationUnit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompilationUnit")) return false;
    if (!nextTokenIs(b, IDENTIFICATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ProgramUnit(b, l + 1);
    r = r && CompilationUnit_1(b, l + 1);
    r = r && CompilationUnit_2(b, l + 1);
    r = r && consumeToken(b, EOF);
    exit_section_(b, m, COMPILATION_UNIT, r);
    return r;
  }

  // ( NestedProgramUnit EndProgramStatement )*
  private static boolean CompilationUnit_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompilationUnit_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CompilationUnit_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CompilationUnit_1", c)) break;
    }
    return true;
  }

  // NestedProgramUnit EndProgramStatement
  private static boolean CompilationUnit_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompilationUnit_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NestedProgramUnit(b, l + 1);
    r = r && EndProgramStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( EndProgramStatement ( CompilationUnit )* )?
  private static boolean CompilationUnit_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompilationUnit_2")) return false;
    CompilationUnit_2_0(b, l + 1);
    return true;
  }

  // EndProgramStatement ( CompilationUnit )*
  private static boolean CompilationUnit_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompilationUnit_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EndProgramStatement(b, l + 1);
    r = r && CompilationUnit_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( CompilationUnit )*
  private static boolean CompilationUnit_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompilationUnit_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CompilationUnit_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CompilationUnit_2_0_1", c)) break;
    }
    return true;
  }

  // ( CompilationUnit )
  private static boolean CompilationUnit_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompilationUnit_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CompilationUnit(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // COMPUTE ( QualifiedDataName ( ROUNDED )? )+ ( EQUALCHAR | EQUAL ) ArithmeticExpression ( ( ON )? SIZE ERROR StatementList )? ( NOT ( ON )? SIZE ERROR StatementList )? ( END_COMPUTE )?
  public static boolean ComputeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComputeStatement")) return false;
    if (!nextTokenIs(b, COMPUTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMPUTE);
    r = r && ComputeStatement_1(b, l + 1);
    r = r && ComputeStatement_2(b, l + 1);
    r = r && ArithmeticExpression(b, l + 1);
    r = r && ComputeStatement_4(b, l + 1);
    r = r && ComputeStatement_5(b, l + 1);
    r = r && ComputeStatement_6(b, l + 1);
    exit_section_(b, m, COMPUTE_STATEMENT, r);
    return r;
  }

  // ( QualifiedDataName ( ROUNDED )? )+
  private static boolean ComputeStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComputeStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ComputeStatement_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ComputeStatement_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ComputeStatement_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // QualifiedDataName ( ROUNDED )?
  private static boolean ComputeStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComputeStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedDataName(b, l + 1);
    r = r && ComputeStatement_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ROUNDED )?
  private static boolean ComputeStatement_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComputeStatement_1_0_1")) return false;
    consumeToken(b, ROUNDED);
    return true;
  }

  // EQUALCHAR | EQUAL
  private static boolean ComputeStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComputeStatement_2")) return false;
    boolean r;
    r = consumeToken(b, EQUALCHAR);
    if (!r) r = consumeToken(b, EQUAL);
    return r;
  }

  // ( ( ON )? SIZE ERROR StatementList )?
  private static boolean ComputeStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComputeStatement_4")) return false;
    ComputeStatement_4_0(b, l + 1);
    return true;
  }

  // ( ON )? SIZE ERROR StatementList
  private static boolean ComputeStatement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComputeStatement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ComputeStatement_4_0_0(b, l + 1);
    r = r && consumeTokens(b, 0, SIZE, ERROR);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ON )?
  private static boolean ComputeStatement_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComputeStatement_4_0_0")) return false;
    consumeToken(b, ON);
    return true;
  }

  // ( NOT ( ON )? SIZE ERROR StatementList )?
  private static boolean ComputeStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComputeStatement_5")) return false;
    ComputeStatement_5_0(b, l + 1);
    return true;
  }

  // NOT ( ON )? SIZE ERROR StatementList
  private static boolean ComputeStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComputeStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && ComputeStatement_5_0_1(b, l + 1);
    r = r && consumeTokens(b, 0, SIZE, ERROR);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ON )?
  private static boolean ComputeStatement_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComputeStatement_5_0_1")) return false;
    consumeToken(b, ON);
    return true;
  }

  // ( END_COMPUTE )?
  private static boolean ComputeStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComputeStatement_6")) return false;
    consumeToken(b, END_COMPUTE);
    return true;
  }

  /* ********************************************************** */
  // SystemName
  public static boolean ComputerName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComputerName")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SystemName(b, l + 1);
    exit_section_(b, m, COMPUTER_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // CombinableCondition ( ( AND | OR ) ( CombinableCondition | AbbreviationRest ) )*
  public static boolean Condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Condition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITION, "<condition>");
    r = CombinableCondition(b, l + 1);
    r = r && Condition_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ( AND | OR ) ( CombinableCondition | AbbreviationRest ) )*
  private static boolean Condition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Condition_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Condition_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Condition_1", c)) break;
    }
    return true;
  }

  // ( AND | OR ) ( CombinableCondition | AbbreviationRest )
  private static boolean Condition_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Condition_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Condition_1_0_0(b, l + 1);
    r = r && Condition_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AND | OR
  private static boolean Condition_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Condition_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, OR);
    return r;
  }

  // CombinableCondition | AbbreviationRest
  private static boolean Condition_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Condition_1_0_1")) return false;
    boolean r;
    r = CombinableCondition(b, l + 1);
    if (!r) r = AbbreviationRest(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // CobolWord
  public static boolean ConditionName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionName")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CobolWord(b, l + 1);
    exit_section_(b, m, CONDITION_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // ConditionNameReference
  public static boolean ConditionNameCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionNameCondition")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConditionNameReference(b, l + 1);
    exit_section_(b, m, CONDITION_NAME_CONDITION, r);
    return r;
  }

  /* ********************************************************** */
  // ConditionName ( ( ( IN | OF ) DataName )* ( ( IN | OF ) FileName )? ( LPARENCHAR Subscript RPARENCHAR )* | ( ( IN | OF ) MnemonicName )* )
  public static boolean ConditionNameReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionNameReference")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConditionName(b, l + 1);
    r = r && ConditionNameReference_1(b, l + 1);
    exit_section_(b, m, CONDITION_NAME_REFERENCE, r);
    return r;
  }

  // ( ( IN | OF ) DataName )* ( ( IN | OF ) FileName )? ( LPARENCHAR Subscript RPARENCHAR )* | ( ( IN | OF ) MnemonicName )*
  private static boolean ConditionNameReference_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionNameReference_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConditionNameReference_1_0(b, l + 1);
    if (!r) r = ConditionNameReference_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( IN | OF ) DataName )* ( ( IN | OF ) FileName )? ( LPARENCHAR Subscript RPARENCHAR )*
  private static boolean ConditionNameReference_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionNameReference_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConditionNameReference_1_0_0(b, l + 1);
    r = r && ConditionNameReference_1_0_1(b, l + 1);
    r = r && ConditionNameReference_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( IN | OF ) DataName )*
  private static boolean ConditionNameReference_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionNameReference_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ConditionNameReference_1_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ConditionNameReference_1_0_0", c)) break;
    }
    return true;
  }

  // ( IN | OF ) DataName
  private static boolean ConditionNameReference_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionNameReference_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConditionNameReference_1_0_0_0_0(b, l + 1);
    r = r && DataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IN | OF
  private static boolean ConditionNameReference_1_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionNameReference_1_0_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, OF);
    return r;
  }

  // ( ( IN | OF ) FileName )?
  private static boolean ConditionNameReference_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionNameReference_1_0_1")) return false;
    ConditionNameReference_1_0_1_0(b, l + 1);
    return true;
  }

  // ( IN | OF ) FileName
  private static boolean ConditionNameReference_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionNameReference_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConditionNameReference_1_0_1_0_0(b, l + 1);
    r = r && FileName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IN | OF
  private static boolean ConditionNameReference_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionNameReference_1_0_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, OF);
    return r;
  }

  // ( LPARENCHAR Subscript RPARENCHAR )*
  private static boolean ConditionNameReference_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionNameReference_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ConditionNameReference_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ConditionNameReference_1_0_2", c)) break;
    }
    return true;
  }

  // LPARENCHAR Subscript RPARENCHAR
  private static boolean ConditionNameReference_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionNameReference_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPARENCHAR);
    r = r && Subscript(b, l + 1);
    r = r && consumeToken(b, RPARENCHAR);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( IN | OF ) MnemonicName )*
  private static boolean ConditionNameReference_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionNameReference_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ConditionNameReference_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ConditionNameReference_1_1", c)) break;
    }
    return true;
  }

  // ( IN | OF ) MnemonicName
  private static boolean ConditionNameReference_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionNameReference_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConditionNameReference_1_1_0_0(b, l + 1);
    r = r && MnemonicName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IN | OF
  private static boolean ConditionNameReference_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionNameReference_1_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, OF);
    return r;
  }

  /* ********************************************************** */
  // DataValueClause
  public static boolean ConditionValueClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionValueClause")) return false;
    if (!nextTokenIs(b, "<condition value clause>", VALUE, VALUES)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITION_VALUE_CLAUSE, "<condition value clause>");
    r = DataValueClause(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CONFIGURATION SECTION DOT ( ConfigurationSectionParagraph )*
  public static boolean ConfigurationSection(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConfigurationSection")) return false;
    if (!nextTokenIs(b, CONFIGURATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CONFIGURATION, SECTION, DOT);
    r = r && ConfigurationSection_3(b, l + 1);
    exit_section_(b, m, CONFIGURATION_SECTION, r);
    return r;
  }

  // ( ConfigurationSectionParagraph )*
  private static boolean ConfigurationSection_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConfigurationSection_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ConfigurationSection_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ConfigurationSection_3", c)) break;
    }
    return true;
  }

  // ( ConfigurationSectionParagraph )
  private static boolean ConfigurationSection_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConfigurationSection_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConfigurationSectionParagraph(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SourceComputerParagraph
  // |	ObjectComputerParagraph
  // |	SpecialNamesParagraph
  public static boolean ConfigurationSectionParagraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConfigurationSectionParagraph")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONFIGURATION_SECTION_PARAGRAPH, "<configuration section paragraph>");
    r = SourceComputerParagraph(b, l + 1);
    if (!r) r = ObjectComputerParagraph(b, l + 1);
    if (!r) r = SpecialNamesParagraph(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CONTINUE
  public static boolean ContinueStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContinueStatement")) return false;
    if (!nextTokenIs(b, CONTINUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONTINUE);
    exit_section_(b, m, CONTINUE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // CONVERTING ( Identifier | Literal ) TO ( Identifier | Literal ) ( BeforeAfterPhrase )*
  public static boolean ConvertingPhrase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConvertingPhrase")) return false;
    if (!nextTokenIs(b, CONVERTING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONVERTING);
    r = r && ConvertingPhrase_1(b, l + 1);
    r = r && consumeToken(b, TO);
    r = r && ConvertingPhrase_3(b, l + 1);
    r = r && ConvertingPhrase_4(b, l + 1);
    exit_section_(b, m, CONVERTING_PHRASE, r);
    return r;
  }

  // Identifier | Literal
  private static boolean ConvertingPhrase_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConvertingPhrase_1")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  // Identifier | Literal
  private static boolean ConvertingPhrase_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConvertingPhrase_3")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  // ( BeforeAfterPhrase )*
  private static boolean ConvertingPhrase_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConvertingPhrase_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ConvertingPhrase_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ConvertingPhrase_4", c)) break;
    }
    return true;
  }

  // ( BeforeAfterPhrase )
  private static boolean ConvertingPhrase_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConvertingPhrase_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BeforeAfterPhrase(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CURRENCY ( SIGN )? ( IS )? Literal
  public static boolean CurrencySignClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CurrencySignClause")) return false;
    if (!nextTokenIs(b, CURRENCY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CURRENCY);
    r = r && CurrencySignClause_1(b, l + 1);
    r = r && CurrencySignClause_2(b, l + 1);
    r = r && Literal(b, l + 1);
    exit_section_(b, m, CURRENCY_SIGN_CLAUSE, r);
    return r;
  }

  // ( SIGN )?
  private static boolean CurrencySignClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CurrencySignClause_1")) return false;
    consumeToken(b, SIGN);
    return true;
  }

  // ( IS )?
  private static boolean CurrencySignClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CurrencySignClause_2")) return false;
    consumeToken(b, IS);
    return true;
  }

  /* ********************************************************** */
  // BLANK ( WHEN )? ( ZERO | ZEROS | ZEROES )
  public static boolean DataBlankWhenZeroClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataBlankWhenZeroClause")) return false;
    if (!nextTokenIs(b, BLANK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BLANK);
    r = r && DataBlankWhenZeroClause_1(b, l + 1);
    r = r && DataBlankWhenZeroClause_2(b, l + 1);
    exit_section_(b, m, DATA_BLANK_WHEN_ZERO_CLAUSE, r);
    return r;
  }

  // ( WHEN )?
  private static boolean DataBlankWhenZeroClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataBlankWhenZeroClause_1")) return false;
    consumeToken(b, WHEN);
    return true;
  }

  // ZERO | ZEROS | ZEROES
  private static boolean DataBlankWhenZeroClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataBlankWhenZeroClause_2")) return false;
    boolean r;
    r = consumeToken(b, ZERO);
    if (!r) r = consumeToken(b, ZEROS);
    if (!r) r = consumeToken(b, ZEROES);
    return r;
  }

  /* ********************************************************** */
  // LevelNumber ( DataName | FILLER ) ( DataDescriptionEntryClause )* DOT | LEVEL_66 DataName RenamesClause DOT | LEVEL_77 DataName ( DataDescriptionEntryClause )* DOT | LEVEL_88 ConditionName ConditionValueClause DOT
  public static boolean DataDescriptionEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataDescriptionEntry")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_DESCRIPTION_ENTRY, "<data description entry>");
    r = DataDescriptionEntry_0(b, l + 1);
    if (!r) r = DataDescriptionEntry_1(b, l + 1);
    if (!r) r = DataDescriptionEntry_2(b, l + 1);
    if (!r) r = DataDescriptionEntry_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LevelNumber ( DataName | FILLER ) ( DataDescriptionEntryClause )* DOT
  private static boolean DataDescriptionEntry_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataDescriptionEntry_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LevelNumber(b, l + 1);
    r = r && DataDescriptionEntry_0_1(b, l + 1);
    r = r && DataDescriptionEntry_0_2(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // DataName | FILLER
  private static boolean DataDescriptionEntry_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataDescriptionEntry_0_1")) return false;
    boolean r;
    r = DataName(b, l + 1);
    if (!r) r = consumeToken(b, FILLER);
    return r;
  }

  // ( DataDescriptionEntryClause )*
  private static boolean DataDescriptionEntry_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataDescriptionEntry_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DataDescriptionEntry_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DataDescriptionEntry_0_2", c)) break;
    }
    return true;
  }

  // ( DataDescriptionEntryClause )
  private static boolean DataDescriptionEntry_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataDescriptionEntry_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DataDescriptionEntryClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEVEL_66 DataName RenamesClause DOT
  private static boolean DataDescriptionEntry_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataDescriptionEntry_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEVEL_66);
    r = r && DataName(b, l + 1);
    r = r && RenamesClause(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEVEL_77 DataName ( DataDescriptionEntryClause )* DOT
  private static boolean DataDescriptionEntry_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataDescriptionEntry_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEVEL_77);
    r = r && DataName(b, l + 1);
    r = r && DataDescriptionEntry_2_2(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( DataDescriptionEntryClause )*
  private static boolean DataDescriptionEntry_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataDescriptionEntry_2_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DataDescriptionEntry_2_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DataDescriptionEntry_2_2", c)) break;
    }
    return true;
  }

  // ( DataDescriptionEntryClause )
  private static boolean DataDescriptionEntry_2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataDescriptionEntry_2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DataDescriptionEntryClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEVEL_88 ConditionName ConditionValueClause DOT
  private static boolean DataDescriptionEntry_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataDescriptionEntry_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEVEL_88);
    r = r && ConditionName(b, l + 1);
    r = r && ConditionValueClause(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DataPictureClause
  // |	DataValueClause
  // |	DataUsageClause
  // |	DataRedefinesClause
  // |	DataExternalClause
  // |	DataGlobalClause
  // |	DataSignClause
  // |	DataOccursClause
  // |	DataSynchronizedClause
  // |	DataJustifiedClause
  // |	DataBlankWhenZeroClause
  public static boolean DataDescriptionEntryClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataDescriptionEntryClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_DESCRIPTION_ENTRY_CLAUSE, "<data description entry clause>");
    r = DataPictureClause(b, l + 1);
    if (!r) r = DataValueClause(b, l + 1);
    if (!r) r = DataUsageClause(b, l + 1);
    if (!r) r = DataRedefinesClause(b, l + 1);
    if (!r) r = DataExternalClause(b, l + 1);
    if (!r) r = DataGlobalClause(b, l + 1);
    if (!r) r = DataSignClause(b, l + 1);
    if (!r) r = DataOccursClause(b, l + 1);
    if (!r) r = DataSynchronizedClause(b, l + 1);
    if (!r) r = DataJustifiedClause(b, l + 1);
    if (!r) r = DataBlankWhenZeroClause(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DATA DIVISION DOT ( DataDivisionSection )*
  public static boolean DataDivision(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataDivision")) return false;
    if (!nextTokenIs(b, DATA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DATA, DIVISION, DOT);
    r = r && DataDivision_3(b, l + 1);
    exit_section_(b, m, DATA_DIVISION, r);
    return r;
  }

  // ( DataDivisionSection )*
  private static boolean DataDivision_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataDivision_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DataDivision_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DataDivision_3", c)) break;
    }
    return true;
  }

  // ( DataDivisionSection )
  private static boolean DataDivision_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataDivision_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DataDivisionSection(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FileSection
  // |	WorkingStorageSection
  // |	LinkageSection
  public static boolean DataDivisionSection(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataDivisionSection")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_DIVISION_SECTION, "<data division section>");
    r = FileSection(b, l + 1);
    if (!r) r = WorkingStorageSection(b, l + 1);
    if (!r) r = LinkageSection(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( IS )?
  public static boolean DataExternalClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataExternalClause")) return false;
    Marker m = enter_section_(b, l, _NONE_, DATA_EXTERNAL_CLAUSE, "<data external clause>");
    consumeToken(b, IS);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // ( IS )? GLOBAL
  public static boolean DataGlobalClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataGlobalClause")) return false;
    if (!nextTokenIs(b, "<data global clause>", GLOBAL, IS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_GLOBAL_CLAUSE, "<data global clause>");
    r = DataGlobalClause_0(b, l + 1);
    r = r && consumeToken(b, GLOBAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( IS )?
  private static boolean DataGlobalClause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataGlobalClause_0")) return false;
    consumeToken(b, IS);
    return true;
  }

  /* ********************************************************** */
  // ( JUSTIFIED | JUST ) ( RIGHT )?
  public static boolean DataJustifiedClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataJustifiedClause")) return false;
    if (!nextTokenIs(b, "<data justified clause>", JUST, JUSTIFIED)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_JUSTIFIED_CLAUSE, "<data justified clause>");
    r = DataJustifiedClause_0(b, l + 1);
    r = r && DataJustifiedClause_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // JUSTIFIED | JUST
  private static boolean DataJustifiedClause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataJustifiedClause_0")) return false;
    boolean r;
    r = consumeToken(b, JUSTIFIED);
    if (!r) r = consumeToken(b, JUST);
    return r;
  }

  // ( RIGHT )?
  private static boolean DataJustifiedClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataJustifiedClause_1")) return false;
    consumeToken(b, RIGHT);
    return true;
  }

  /* ********************************************************** */
  // CobolWord
  public static boolean DataName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataName")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CobolWord(b, l + 1);
    exit_section_(b, m, DATA_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // OCCURS ( IntegerConstant TO )? IntegerConstant ( TIMES )? ( DEPENDING ( ON )? QualifiedDataName )? ( ( ASCENDING | DESCENDING ) ( KEY )? ( IS )? ( QualifiedDataName )+ )* ( INDEXED ( BY )? ( IndexName )+ )?
  public static boolean DataOccursClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataOccursClause")) return false;
    if (!nextTokenIs(b, OCCURS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OCCURS);
    r = r && DataOccursClause_1(b, l + 1);
    r = r && IntegerConstant(b, l + 1);
    r = r && DataOccursClause_3(b, l + 1);
    r = r && DataOccursClause_4(b, l + 1);
    r = r && DataOccursClause_5(b, l + 1);
    r = r && DataOccursClause_6(b, l + 1);
    exit_section_(b, m, DATA_OCCURS_CLAUSE, r);
    return r;
  }

  // ( IntegerConstant TO )?
  private static boolean DataOccursClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataOccursClause_1")) return false;
    DataOccursClause_1_0(b, l + 1);
    return true;
  }

  // IntegerConstant TO
  private static boolean DataOccursClause_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataOccursClause_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IntegerConstant(b, l + 1);
    r = r && consumeToken(b, TO);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TIMES )?
  private static boolean DataOccursClause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataOccursClause_3")) return false;
    consumeToken(b, TIMES);
    return true;
  }

  // ( DEPENDING ( ON )? QualifiedDataName )?
  private static boolean DataOccursClause_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataOccursClause_4")) return false;
    DataOccursClause_4_0(b, l + 1);
    return true;
  }

  // DEPENDING ( ON )? QualifiedDataName
  private static boolean DataOccursClause_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataOccursClause_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEPENDING);
    r = r && DataOccursClause_4_0_1(b, l + 1);
    r = r && QualifiedDataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ON )?
  private static boolean DataOccursClause_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataOccursClause_4_0_1")) return false;
    consumeToken(b, ON);
    return true;
  }

  // ( ( ASCENDING | DESCENDING ) ( KEY )? ( IS )? ( QualifiedDataName )+ )*
  private static boolean DataOccursClause_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataOccursClause_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DataOccursClause_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DataOccursClause_5", c)) break;
    }
    return true;
  }

  // ( ASCENDING | DESCENDING ) ( KEY )? ( IS )? ( QualifiedDataName )+
  private static boolean DataOccursClause_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataOccursClause_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DataOccursClause_5_0_0(b, l + 1);
    r = r && DataOccursClause_5_0_1(b, l + 1);
    r = r && DataOccursClause_5_0_2(b, l + 1);
    r = r && DataOccursClause_5_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ASCENDING | DESCENDING
  private static boolean DataOccursClause_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataOccursClause_5_0_0")) return false;
    boolean r;
    r = consumeToken(b, ASCENDING);
    if (!r) r = consumeToken(b, DESCENDING);
    return r;
  }

  // ( KEY )?
  private static boolean DataOccursClause_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataOccursClause_5_0_1")) return false;
    consumeToken(b, KEY);
    return true;
  }

  // ( IS )?
  private static boolean DataOccursClause_5_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataOccursClause_5_0_2")) return false;
    consumeToken(b, IS);
    return true;
  }

  // ( QualifiedDataName )+
  private static boolean DataOccursClause_5_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataOccursClause_5_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DataOccursClause_5_0_3_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!DataOccursClause_5_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DataOccursClause_5_0_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( QualifiedDataName )
  private static boolean DataOccursClause_5_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataOccursClause_5_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedDataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( INDEXED ( BY )? ( IndexName )+ )?
  private static boolean DataOccursClause_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataOccursClause_6")) return false;
    DataOccursClause_6_0(b, l + 1);
    return true;
  }

  // INDEXED ( BY )? ( IndexName )+
  private static boolean DataOccursClause_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataOccursClause_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INDEXED);
    r = r && DataOccursClause_6_0_1(b, l + 1);
    r = r && DataOccursClause_6_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( BY )?
  private static boolean DataOccursClause_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataOccursClause_6_0_1")) return false;
    consumeToken(b, BY);
    return true;
  }

  // ( IndexName )+
  private static boolean DataOccursClause_6_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataOccursClause_6_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DataOccursClause_6_0_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!DataOccursClause_6_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DataOccursClause_6_0_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IndexName )
  private static boolean DataOccursClause_6_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataOccursClause_6_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IndexName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( PICTURE | PIC ) ( IS )? PictureString
  public static boolean DataPictureClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataPictureClause")) return false;
    if (!nextTokenIs(b, "<data picture clause>", PIC, PICTURE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_PICTURE_CLAUSE, "<data picture clause>");
    r = DataPictureClause_0(b, l + 1);
    r = r && DataPictureClause_1(b, l + 1);
    r = r && PictureString(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PICTURE | PIC
  private static boolean DataPictureClause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataPictureClause_0")) return false;
    boolean r;
    r = consumeToken(b, PICTURE);
    if (!r) r = consumeToken(b, PIC);
    return r;
  }

  // ( IS )?
  private static boolean DataPictureClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataPictureClause_1")) return false;
    consumeToken(b, IS);
    return true;
  }

  /* ********************************************************** */
  // DATA ( RECORD ( IS )? | RECORDS ( ARE )? ) ( DataName )+
  public static boolean DataRecordClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataRecordClause")) return false;
    if (!nextTokenIs(b, DATA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DATA);
    r = r && DataRecordClause_1(b, l + 1);
    r = r && DataRecordClause_2(b, l + 1);
    exit_section_(b, m, DATA_RECORD_CLAUSE, r);
    return r;
  }

  // RECORD ( IS )? | RECORDS ( ARE )?
  private static boolean DataRecordClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataRecordClause_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DataRecordClause_1_0(b, l + 1);
    if (!r) r = DataRecordClause_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // RECORD ( IS )?
  private static boolean DataRecordClause_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataRecordClause_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RECORD);
    r = r && DataRecordClause_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IS )?
  private static boolean DataRecordClause_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataRecordClause_1_0_1")) return false;
    consumeToken(b, IS);
    return true;
  }

  // RECORDS ( ARE )?
  private static boolean DataRecordClause_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataRecordClause_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RECORDS);
    r = r && DataRecordClause_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ARE )?
  private static boolean DataRecordClause_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataRecordClause_1_1_1")) return false;
    consumeToken(b, ARE);
    return true;
  }

  // ( DataName )+
  private static boolean DataRecordClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataRecordClause_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DataRecordClause_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!DataRecordClause_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DataRecordClause_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( DataName )
  private static boolean DataRecordClause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataRecordClause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // REDEFINES DataName
  public static boolean DataRedefinesClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataRedefinesClause")) return false;
    if (!nextTokenIs(b, REDEFINES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REDEFINES);
    r = r && DataName(b, l + 1);
    exit_section_(b, m, DATA_REDEFINES_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // ( SIGN ( IS )? )? ( LEADING | TRAILING ) ( SEPARATE ( CHARACTER )? )?
  public static boolean DataSignClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataSignClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_SIGN_CLAUSE, "<data sign clause>");
    r = DataSignClause_0(b, l + 1);
    r = r && DataSignClause_1(b, l + 1);
    r = r && DataSignClause_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( SIGN ( IS )? )?
  private static boolean DataSignClause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataSignClause_0")) return false;
    DataSignClause_0_0(b, l + 1);
    return true;
  }

  // SIGN ( IS )?
  private static boolean DataSignClause_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataSignClause_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SIGN);
    r = r && DataSignClause_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IS )?
  private static boolean DataSignClause_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataSignClause_0_0_1")) return false;
    consumeToken(b, IS);
    return true;
  }

  // LEADING | TRAILING
  private static boolean DataSignClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataSignClause_1")) return false;
    boolean r;
    r = consumeToken(b, LEADING);
    if (!r) r = consumeToken(b, TRAILING);
    return r;
  }

  // ( SEPARATE ( CHARACTER )? )?
  private static boolean DataSignClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataSignClause_2")) return false;
    DataSignClause_2_0(b, l + 1);
    return true;
  }

  // SEPARATE ( CHARACTER )?
  private static boolean DataSignClause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataSignClause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEPARATE);
    r = r && DataSignClause_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( CHARACTER )?
  private static boolean DataSignClause_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataSignClause_2_0_1")) return false;
    consumeToken(b, CHARACTER);
    return true;
  }

  /* ********************************************************** */
  // ( SYNCHRONIZED | SYNC ) ( ( LEFT | RIGHT ) )?
  public static boolean DataSynchronizedClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataSynchronizedClause")) return false;
    if (!nextTokenIs(b, "<data synchronized clause>", SYNC, SYNCHRONIZED)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_SYNCHRONIZED_CLAUSE, "<data synchronized clause>");
    r = DataSynchronizedClause_0(b, l + 1);
    r = r && DataSynchronizedClause_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SYNCHRONIZED | SYNC
  private static boolean DataSynchronizedClause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataSynchronizedClause_0")) return false;
    boolean r;
    r = consumeToken(b, SYNCHRONIZED);
    if (!r) r = consumeToken(b, SYNC);
    return r;
  }

  // ( ( LEFT | RIGHT ) )?
  private static boolean DataSynchronizedClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataSynchronizedClause_1")) return false;
    DataSynchronizedClause_1_0(b, l + 1);
    return true;
  }

  // LEFT | RIGHT
  private static boolean DataSynchronizedClause_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataSynchronizedClause_1_0")) return false;
    boolean r;
    r = consumeToken(b, LEFT);
    if (!r) r = consumeToken(b, RIGHT);
    return r;
  }

  /* ********************************************************** */
  // ( USAGE ( IS )? )? ( BINARY | COMP | COMP_1 | COMP_2 | COMP_3 | COMP_4 | COMPUTATIONAL | COMPUTATIONAL_1 | COMPUTATIONAL_2 | COMPUTATIONAL_3 | COMPUTATIONAL_4 | DISPLAY | DISPLAY_1 | INDEX | PACKED_DECIMAL | POINTER )
  public static boolean DataUsageClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataUsageClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_USAGE_CLAUSE, "<data usage clause>");
    r = DataUsageClause_0(b, l + 1);
    r = r && DataUsageClause_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( USAGE ( IS )? )?
  private static boolean DataUsageClause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataUsageClause_0")) return false;
    DataUsageClause_0_0(b, l + 1);
    return true;
  }

  // USAGE ( IS )?
  private static boolean DataUsageClause_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataUsageClause_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USAGE);
    r = r && DataUsageClause_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IS )?
  private static boolean DataUsageClause_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataUsageClause_0_0_1")) return false;
    consumeToken(b, IS);
    return true;
  }

  // BINARY | COMP | COMP_1 | COMP_2 | COMP_3 | COMP_4 | COMPUTATIONAL | COMPUTATIONAL_1 | COMPUTATIONAL_2 | COMPUTATIONAL_3 | COMPUTATIONAL_4 | DISPLAY | DISPLAY_1 | INDEX | PACKED_DECIMAL | POINTER
  private static boolean DataUsageClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataUsageClause_1")) return false;
    boolean r;
    r = consumeToken(b, BINARY);
    if (!r) r = consumeToken(b, COMP);
    if (!r) r = consumeToken(b, COMP_1);
    if (!r) r = consumeToken(b, COMP_2);
    if (!r) r = consumeToken(b, COMP_3);
    if (!r) r = consumeToken(b, COMP_4);
    if (!r) r = consumeToken(b, COMPUTATIONAL);
    if (!r) r = consumeToken(b, COMPUTATIONAL_1);
    if (!r) r = consumeToken(b, COMPUTATIONAL_2);
    if (!r) r = consumeToken(b, COMPUTATIONAL_3);
    if (!r) r = consumeToken(b, COMPUTATIONAL_4);
    if (!r) r = consumeToken(b, DISPLAY);
    if (!r) r = consumeToken(b, DISPLAY_1);
    if (!r) r = consumeToken(b, INDEX);
    if (!r) r = consumeToken(b, PACKED_DECIMAL);
    if (!r) r = consumeToken(b, POINTER);
    return r;
  }

  /* ********************************************************** */
  // ( VALUE ( IS )? | VALUES ( ARE )? ) ( Literal ( ( THROUGH | THRU ) Literal )? )+
  public static boolean DataValueClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataValueClause")) return false;
    if (!nextTokenIs(b, "<data value clause>", VALUE, VALUES)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_VALUE_CLAUSE, "<data value clause>");
    r = DataValueClause_0(b, l + 1);
    r = r && DataValueClause_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // VALUE ( IS )? | VALUES ( ARE )?
  private static boolean DataValueClause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataValueClause_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DataValueClause_0_0(b, l + 1);
    if (!r) r = DataValueClause_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VALUE ( IS )?
  private static boolean DataValueClause_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataValueClause_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VALUE);
    r = r && DataValueClause_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IS )?
  private static boolean DataValueClause_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataValueClause_0_0_1")) return false;
    consumeToken(b, IS);
    return true;
  }

  // VALUES ( ARE )?
  private static boolean DataValueClause_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataValueClause_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VALUES);
    r = r && DataValueClause_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ARE )?
  private static boolean DataValueClause_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataValueClause_0_1_1")) return false;
    consumeToken(b, ARE);
    return true;
  }

  // ( Literal ( ( THROUGH | THRU ) Literal )? )+
  private static boolean DataValueClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataValueClause_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DataValueClause_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!DataValueClause_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DataValueClause_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // Literal ( ( THROUGH | THRU ) Literal )?
  private static boolean DataValueClause_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataValueClause_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Literal(b, l + 1);
    r = r && DataValueClause_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( THROUGH | THRU ) Literal )?
  private static boolean DataValueClause_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataValueClause_1_0_1")) return false;
    DataValueClause_1_0_1_0(b, l + 1);
    return true;
  }

  // ( THROUGH | THRU ) Literal
  private static boolean DataValueClause_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataValueClause_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DataValueClause_1_0_1_0_0(b, l + 1);
    r = r && Literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // THROUGH | THRU
  private static boolean DataValueClause_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataValueClause_1_0_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, THROUGH);
    if (!r) r = consumeToken(b, THRU);
    return r;
  }

  /* ********************************************************** */
  // DATE_COMPILED DOT ( CommentLine )?
  public static boolean DateCompiledParagraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DateCompiledParagraph")) return false;
    if (!nextTokenIs(b, DATE_COMPILED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DATE_COMPILED, DOT);
    r = r && DateCompiledParagraph_2(b, l + 1);
    exit_section_(b, m, DATE_COMPILED_PARAGRAPH, r);
    return r;
  }

  // ( CommentLine )?
  private static boolean DateCompiledParagraph_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DateCompiledParagraph_2")) return false;
    DateCompiledParagraph_2_0(b, l + 1);
    return true;
  }

  // ( CommentLine )
  private static boolean DateCompiledParagraph_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DateCompiledParagraph_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CommentLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DATE_WRITTEN DOT ( CommentLine )?
  public static boolean DateWrittenParagraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DateWrittenParagraph")) return false;
    if (!nextTokenIs(b, DATE_WRITTEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DATE_WRITTEN, DOT);
    r = r && DateWrittenParagraph_2(b, l + 1);
    exit_section_(b, m, DATE_WRITTEN_PARAGRAPH, r);
    return r;
  }

  // ( CommentLine )?
  private static boolean DateWrittenParagraph_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DateWrittenParagraph_2")) return false;
    DateWrittenParagraph_2_0(b, l + 1);
    return true;
  }

  // ( CommentLine )
  private static boolean DateWrittenParagraph_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DateWrittenParagraph_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CommentLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DECIMAL_POINT ( IS )? COMMA
  public static boolean DecimalPointClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DecimalPointClause")) return false;
    if (!nextTokenIs(b, DECIMAL_POINT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DECIMAL_POINT);
    r = r && DecimalPointClause_1(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, DECIMAL_POINT_CLAUSE, r);
    return r;
  }

  // ( IS )?
  private static boolean DecimalPointClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DecimalPointClause_1")) return false;
    consumeToken(b, IS);
    return true;
  }

  /* ********************************************************** */
  // DECLARATIVES DOT ( SectionHeader DOT UseStatement DOT Paragraphs )+ END DECLARATIVES DOT
  public static boolean Declaratives(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declaratives")) return false;
    if (!nextTokenIs(b, DECLARATIVES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DECLARATIVES, DOT);
    r = r && Declaratives_2(b, l + 1);
    r = r && consumeTokens(b, 0, END, DECLARATIVES, DOT);
    exit_section_(b, m, DECLARATIVES, r);
    return r;
  }

  // ( SectionHeader DOT UseStatement DOT Paragraphs )+
  private static boolean Declaratives_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declaratives_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Declaratives_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Declaratives_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Declaratives_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // SectionHeader DOT UseStatement DOT Paragraphs
  private static boolean Declaratives_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declaratives_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SectionHeader(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && UseStatement(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && Paragraphs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DELETE FileName ( RECORD )? ( INVALID ( KEY )? StatementList )? ( NOT INVALID ( KEY )? StatementList )? ( END_DELETE )?
  public static boolean DeleteStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeleteStatement")) return false;
    if (!nextTokenIs(b, DELETE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DELETE);
    r = r && FileName(b, l + 1);
    r = r && DeleteStatement_2(b, l + 1);
    r = r && DeleteStatement_3(b, l + 1);
    r = r && DeleteStatement_4(b, l + 1);
    r = r && DeleteStatement_5(b, l + 1);
    exit_section_(b, m, DELETE_STATEMENT, r);
    return r;
  }

  // ( RECORD )?
  private static boolean DeleteStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeleteStatement_2")) return false;
    consumeToken(b, RECORD);
    return true;
  }

  // ( INVALID ( KEY )? StatementList )?
  private static boolean DeleteStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeleteStatement_3")) return false;
    DeleteStatement_3_0(b, l + 1);
    return true;
  }

  // INVALID ( KEY )? StatementList
  private static boolean DeleteStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeleteStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INVALID);
    r = r && DeleteStatement_3_0_1(b, l + 1);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( KEY )?
  private static boolean DeleteStatement_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeleteStatement_3_0_1")) return false;
    consumeToken(b, KEY);
    return true;
  }

  // ( NOT INVALID ( KEY )? StatementList )?
  private static boolean DeleteStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeleteStatement_4")) return false;
    DeleteStatement_4_0(b, l + 1);
    return true;
  }

  // NOT INVALID ( KEY )? StatementList
  private static boolean DeleteStatement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeleteStatement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NOT, INVALID);
    r = r && DeleteStatement_4_0_2(b, l + 1);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( KEY )?
  private static boolean DeleteStatement_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeleteStatement_4_0_2")) return false;
    consumeToken(b, KEY);
    return true;
  }

  // ( END_DELETE )?
  private static boolean DeleteStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeleteStatement_5")) return false;
    consumeToken(b, END_DELETE);
    return true;
  }

  /* ********************************************************** */
  // DISPLAY ( Identifier | Literal )+ ( UPON ( MnemonicName | EnvironmentName ) )? ( ( WITH )? NO ADVANCING )?
  public static boolean DisplayStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisplayStatement")) return false;
    if (!nextTokenIs(b, DISPLAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DISPLAY);
    r = r && DisplayStatement_1(b, l + 1);
    r = r && DisplayStatement_2(b, l + 1);
    r = r && DisplayStatement_3(b, l + 1);
    exit_section_(b, m, DISPLAY_STATEMENT, r);
    return r;
  }

  // ( Identifier | Literal )+
  private static boolean DisplayStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisplayStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DisplayStatement_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!DisplayStatement_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DisplayStatement_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier | Literal
  private static boolean DisplayStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisplayStatement_1_0")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  // ( UPON ( MnemonicName | EnvironmentName ) )?
  private static boolean DisplayStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisplayStatement_2")) return false;
    DisplayStatement_2_0(b, l + 1);
    return true;
  }

  // UPON ( MnemonicName | EnvironmentName )
  private static boolean DisplayStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisplayStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UPON);
    r = r && DisplayStatement_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MnemonicName | EnvironmentName
  private static boolean DisplayStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisplayStatement_2_0_1")) return false;
    boolean r;
    r = MnemonicName(b, l + 1);
    if (!r) r = EnvironmentName(b, l + 1);
    return r;
  }

  // ( ( WITH )? NO ADVANCING )?
  private static boolean DisplayStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisplayStatement_3")) return false;
    DisplayStatement_3_0(b, l + 1);
    return true;
  }

  // ( WITH )? NO ADVANCING
  private static boolean DisplayStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisplayStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DisplayStatement_3_0_0(b, l + 1);
    r = r && consumeTokens(b, 0, NO, ADVANCING);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WITH )?
  private static boolean DisplayStatement_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisplayStatement_3_0_0")) return false;
    consumeToken(b, WITH);
    return true;
  }

  /* ********************************************************** */
  // DIVIDE ( QualifiedDataName | Literal ) ( INTO Literal ( GIVING ( Identifier ( ROUNDED )? )+ )? | INTO ( Identifier ( ROUNDED )? )+ | BY ( Identifier | Literal ) ( GIVING ( Identifier ( ROUNDED )? )+ )? ) ( REMAINDER Identifier )? ( ( ON )? SIZE ERROR StatementList )? ( NOT ( ON )? SIZE ERROR StatementList )? ( END_DIVIDE )?
  public static boolean DivideStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement")) return false;
    if (!nextTokenIs(b, DIVIDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DIVIDE);
    r = r && DivideStatement_1(b, l + 1);
    r = r && DivideStatement_2(b, l + 1);
    r = r && DivideStatement_3(b, l + 1);
    r = r && DivideStatement_4(b, l + 1);
    r = r && DivideStatement_5(b, l + 1);
    r = r && DivideStatement_6(b, l + 1);
    exit_section_(b, m, DIVIDE_STATEMENT, r);
    return r;
  }

  // QualifiedDataName | Literal
  private static boolean DivideStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_1")) return false;
    boolean r;
    r = QualifiedDataName(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  // INTO Literal ( GIVING ( Identifier ( ROUNDED )? )+ )? | INTO ( Identifier ( ROUNDED )? )+ | BY ( Identifier | Literal ) ( GIVING ( Identifier ( ROUNDED )? )+ )?
  private static boolean DivideStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DivideStatement_2_0(b, l + 1);
    if (!r) r = DivideStatement_2_1(b, l + 1);
    if (!r) r = DivideStatement_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INTO Literal ( GIVING ( Identifier ( ROUNDED )? )+ )?
  private static boolean DivideStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTO);
    r = r && Literal(b, l + 1);
    r = r && DivideStatement_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( GIVING ( Identifier ( ROUNDED )? )+ )?
  private static boolean DivideStatement_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_2_0_2")) return false;
    DivideStatement_2_0_2_0(b, l + 1);
    return true;
  }

  // GIVING ( Identifier ( ROUNDED )? )+
  private static boolean DivideStatement_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GIVING);
    r = r && DivideStatement_2_0_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Identifier ( ROUNDED )? )+
  private static boolean DivideStatement_2_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_2_0_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DivideStatement_2_0_2_0_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!DivideStatement_2_0_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DivideStatement_2_0_2_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier ( ROUNDED )?
  private static boolean DivideStatement_2_0_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_2_0_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && DivideStatement_2_0_2_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ROUNDED )?
  private static boolean DivideStatement_2_0_2_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_2_0_2_0_1_0_1")) return false;
    consumeToken(b, ROUNDED);
    return true;
  }

  // INTO ( Identifier ( ROUNDED )? )+
  private static boolean DivideStatement_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTO);
    r = r && DivideStatement_2_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Identifier ( ROUNDED )? )+
  private static boolean DivideStatement_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_2_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DivideStatement_2_1_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!DivideStatement_2_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DivideStatement_2_1_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier ( ROUNDED )?
  private static boolean DivideStatement_2_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_2_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && DivideStatement_2_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ROUNDED )?
  private static boolean DivideStatement_2_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_2_1_1_0_1")) return false;
    consumeToken(b, ROUNDED);
    return true;
  }

  // BY ( Identifier | Literal ) ( GIVING ( Identifier ( ROUNDED )? )+ )?
  private static boolean DivideStatement_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_2_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BY);
    r = r && DivideStatement_2_2_1(b, l + 1);
    r = r && DivideStatement_2_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier | Literal
  private static boolean DivideStatement_2_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_2_2_1")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  // ( GIVING ( Identifier ( ROUNDED )? )+ )?
  private static boolean DivideStatement_2_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_2_2_2")) return false;
    DivideStatement_2_2_2_0(b, l + 1);
    return true;
  }

  // GIVING ( Identifier ( ROUNDED )? )+
  private static boolean DivideStatement_2_2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_2_2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GIVING);
    r = r && DivideStatement_2_2_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Identifier ( ROUNDED )? )+
  private static boolean DivideStatement_2_2_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_2_2_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DivideStatement_2_2_2_0_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!DivideStatement_2_2_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DivideStatement_2_2_2_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier ( ROUNDED )?
  private static boolean DivideStatement_2_2_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_2_2_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && DivideStatement_2_2_2_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ROUNDED )?
  private static boolean DivideStatement_2_2_2_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_2_2_2_0_1_0_1")) return false;
    consumeToken(b, ROUNDED);
    return true;
  }

  // ( REMAINDER Identifier )?
  private static boolean DivideStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_3")) return false;
    DivideStatement_3_0(b, l + 1);
    return true;
  }

  // REMAINDER Identifier
  private static boolean DivideStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REMAINDER);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( ON )? SIZE ERROR StatementList )?
  private static boolean DivideStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_4")) return false;
    DivideStatement_4_0(b, l + 1);
    return true;
  }

  // ( ON )? SIZE ERROR StatementList
  private static boolean DivideStatement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DivideStatement_4_0_0(b, l + 1);
    r = r && consumeTokens(b, 0, SIZE, ERROR);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ON )?
  private static boolean DivideStatement_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_4_0_0")) return false;
    consumeToken(b, ON);
    return true;
  }

  // ( NOT ( ON )? SIZE ERROR StatementList )?
  private static boolean DivideStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_5")) return false;
    DivideStatement_5_0(b, l + 1);
    return true;
  }

  // NOT ( ON )? SIZE ERROR StatementList
  private static boolean DivideStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && DivideStatement_5_0_1(b, l + 1);
    r = r && consumeTokens(b, 0, SIZE, ERROR);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ON )?
  private static boolean DivideStatement_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_5_0_1")) return false;
    consumeToken(b, ON);
    return true;
  }

  // ( END_DIVIDE )?
  private static boolean DivideStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DivideStatement_6")) return false;
    consumeToken(b, END_DIVIDE);
    return true;
  }

  /* ********************************************************** */
  // DYNAMIC ( RelativeKeyClause )?
  public static boolean DynamicAccessMode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DynamicAccessMode")) return false;
    if (!nextTokenIs(b, DYNAMIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DYNAMIC);
    r = r && DynamicAccessMode_1(b, l + 1);
    exit_section_(b, m, DYNAMIC_ACCESS_MODE, r);
    return r;
  }

  // ( RelativeKeyClause )?
  private static boolean DynamicAccessMode_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DynamicAccessMode_1")) return false;
    DynamicAccessMode_1_0(b, l + 1);
    return true;
  }

  // ( RelativeKeyClause )
  private static boolean DynamicAccessMode_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DynamicAccessMode_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RelativeKeyClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // END PROGRAM ProgramName DOT
  public static boolean EndProgramStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndProgramStatement")) return false;
    if (!nextTokenIs(b, END)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, END, PROGRAM);
    r = r && ProgramName(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, END_PROGRAM_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // ENTRY Literal ( USING ( Identifier )+ )?
  public static boolean EntryStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EntryStatement")) return false;
    if (!nextTokenIs(b, ENTRY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENTRY);
    r = r && Literal(b, l + 1);
    r = r && EntryStatement_2(b, l + 1);
    exit_section_(b, m, ENTRY_STATEMENT, r);
    return r;
  }

  // ( USING ( Identifier )+ )?
  private static boolean EntryStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EntryStatement_2")) return false;
    EntryStatement_2_0(b, l + 1);
    return true;
  }

  // USING ( Identifier )+
  private static boolean EntryStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EntryStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USING);
    r = r && EntryStatement_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Identifier )+
  private static boolean EntryStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EntryStatement_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EntryStatement_2_0_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!EntryStatement_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EntryStatement_2_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Identifier )
  private static boolean EntryStatement_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EntryStatement_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ENVIRONMENT DIVISION DOT ( EnvironmentSection )*
  public static boolean EnvironmentDivision(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnvironmentDivision")) return false;
    if (!nextTokenIs(b, ENVIRONMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ENVIRONMENT, DIVISION, DOT);
    r = r && EnvironmentDivision_3(b, l + 1);
    exit_section_(b, m, ENVIRONMENT_DIVISION, r);
    return r;
  }

  // ( EnvironmentSection )*
  private static boolean EnvironmentDivision_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnvironmentDivision_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!EnvironmentDivision_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EnvironmentDivision_3", c)) break;
    }
    return true;
  }

  // ( EnvironmentSection )
  private static boolean EnvironmentDivision_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnvironmentDivision_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EnvironmentSection(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SystemName
  public static boolean EnvironmentName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnvironmentName")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SystemName(b, l + 1);
    exit_section_(b, m, ENVIRONMENT_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // EnvironmentName ( IS )? MnemonicName ( SpecialNamesParagraphStatusPhrase )? | SpecialNamesParagraphStatusPhrase
  public static boolean EnvironmentNameIsMnemonicNameClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnvironmentNameIsMnemonicNameClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENVIRONMENT_NAME_IS_MNEMONIC_NAME_CLAUSE, "<environment name is mnemonic name clause>");
    r = EnvironmentNameIsMnemonicNameClause_0(b, l + 1);
    if (!r) r = SpecialNamesParagraphStatusPhrase(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // EnvironmentName ( IS )? MnemonicName ( SpecialNamesParagraphStatusPhrase )?
  private static boolean EnvironmentNameIsMnemonicNameClause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnvironmentNameIsMnemonicNameClause_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EnvironmentName(b, l + 1);
    r = r && EnvironmentNameIsMnemonicNameClause_0_1(b, l + 1);
    r = r && MnemonicName(b, l + 1);
    r = r && EnvironmentNameIsMnemonicNameClause_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IS )?
  private static boolean EnvironmentNameIsMnemonicNameClause_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnvironmentNameIsMnemonicNameClause_0_1")) return false;
    consumeToken(b, IS);
    return true;
  }

  // ( SpecialNamesParagraphStatusPhrase )?
  private static boolean EnvironmentNameIsMnemonicNameClause_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnvironmentNameIsMnemonicNameClause_0_3")) return false;
    EnvironmentNameIsMnemonicNameClause_0_3_0(b, l + 1);
    return true;
  }

  // ( SpecialNamesParagraphStatusPhrase )
  private static boolean EnvironmentNameIsMnemonicNameClause_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnvironmentNameIsMnemonicNameClause_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SpecialNamesParagraphStatusPhrase(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ConfigurationSection
  // |	InputOutputSection
  public static boolean EnvironmentSection(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnvironmentSection")) return false;
    if (!nextTokenIs(b, "<environment section>", CONFIGURATION, INPUT_OUTPUT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENVIRONMENT_SECTION, "<environment section>");
    r = ConfigurationSection(b, l + 1);
    if (!r) r = InputOutputSection(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ANY | Condition | TRUE | FALSE | ( NOT )? ( Identifier | Literal | ArithmeticExpression ) ( ( THROUGH | THRU ) ( Identifier | Literal | ArithmeticExpression ) )?
  public static boolean EvaluatePhrase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EvaluatePhrase")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EVALUATE_PHRASE, "<evaluate phrase>");
    r = consumeToken(b, ANY);
    if (!r) r = Condition(b, l + 1);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = EvaluatePhrase_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( NOT )? ( Identifier | Literal | ArithmeticExpression ) ( ( THROUGH | THRU ) ( Identifier | Literal | ArithmeticExpression ) )?
  private static boolean EvaluatePhrase_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EvaluatePhrase_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EvaluatePhrase_4_0(b, l + 1);
    r = r && EvaluatePhrase_4_1(b, l + 1);
    r = r && EvaluatePhrase_4_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( NOT )?
  private static boolean EvaluatePhrase_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EvaluatePhrase_4_0")) return false;
    consumeToken(b, NOT);
    return true;
  }

  // Identifier | Literal | ArithmeticExpression
  private static boolean EvaluatePhrase_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EvaluatePhrase_4_1")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    if (!r) r = ArithmeticExpression(b, l + 1);
    return r;
  }

  // ( ( THROUGH | THRU ) ( Identifier | Literal | ArithmeticExpression ) )?
  private static boolean EvaluatePhrase_4_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EvaluatePhrase_4_2")) return false;
    EvaluatePhrase_4_2_0(b, l + 1);
    return true;
  }

  // ( THROUGH | THRU ) ( Identifier | Literal | ArithmeticExpression )
  private static boolean EvaluatePhrase_4_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EvaluatePhrase_4_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EvaluatePhrase_4_2_0_0(b, l + 1);
    r = r && EvaluatePhrase_4_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // THROUGH | THRU
  private static boolean EvaluatePhrase_4_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EvaluatePhrase_4_2_0_0")) return false;
    boolean r;
    r = consumeToken(b, THROUGH);
    if (!r) r = consumeToken(b, THRU);
    return r;
  }

  // Identifier | Literal | ArithmeticExpression
  private static boolean EvaluatePhrase_4_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EvaluatePhrase_4_2_0_1")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    if (!r) r = ArithmeticExpression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // EVALUATE EvaluateValue ( ALSO EvaluateValue )* ( ( WHEN EvaluatePhrase ( ALSO EvaluatePhrase )* )+ StatementList )+ ( WHEN OTHER StatementList )? ( END_EVALUATE )?
  public static boolean EvaluateStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EvaluateStatement")) return false;
    if (!nextTokenIs(b, EVALUATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EVALUATE);
    r = r && EvaluateValue(b, l + 1);
    r = r && EvaluateStatement_2(b, l + 1);
    r = r && EvaluateStatement_3(b, l + 1);
    r = r && EvaluateStatement_4(b, l + 1);
    r = r && EvaluateStatement_5(b, l + 1);
    exit_section_(b, m, EVALUATE_STATEMENT, r);
    return r;
  }

  // ( ALSO EvaluateValue )*
  private static boolean EvaluateStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EvaluateStatement_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!EvaluateStatement_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EvaluateStatement_2", c)) break;
    }
    return true;
  }

  // ALSO EvaluateValue
  private static boolean EvaluateStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EvaluateStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALSO);
    r = r && EvaluateValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( WHEN EvaluatePhrase ( ALSO EvaluatePhrase )* )+ StatementList )+
  private static boolean EvaluateStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EvaluateStatement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EvaluateStatement_3_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!EvaluateStatement_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EvaluateStatement_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WHEN EvaluatePhrase ( ALSO EvaluatePhrase )* )+ StatementList
  private static boolean EvaluateStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EvaluateStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EvaluateStatement_3_0_0(b, l + 1);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WHEN EvaluatePhrase ( ALSO EvaluatePhrase )* )+
  private static boolean EvaluateStatement_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EvaluateStatement_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EvaluateStatement_3_0_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!EvaluateStatement_3_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EvaluateStatement_3_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // WHEN EvaluatePhrase ( ALSO EvaluatePhrase )*
  private static boolean EvaluateStatement_3_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EvaluateStatement_3_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && EvaluatePhrase(b, l + 1);
    r = r && EvaluateStatement_3_0_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ALSO EvaluatePhrase )*
  private static boolean EvaluateStatement_3_0_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EvaluateStatement_3_0_0_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!EvaluateStatement_3_0_0_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EvaluateStatement_3_0_0_0_2", c)) break;
    }
    return true;
  }

  // ALSO EvaluatePhrase
  private static boolean EvaluateStatement_3_0_0_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EvaluateStatement_3_0_0_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALSO);
    r = r && EvaluatePhrase(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WHEN OTHER StatementList )?
  private static boolean EvaluateStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EvaluateStatement_4")) return false;
    EvaluateStatement_4_0(b, l + 1);
    return true;
  }

  // WHEN OTHER StatementList
  private static boolean EvaluateStatement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EvaluateStatement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WHEN, OTHER);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( END_EVALUATE )?
  private static boolean EvaluateStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EvaluateStatement_5")) return false;
    consumeToken(b, END_EVALUATE);
    return true;
  }

  /* ********************************************************** */
  // ArithmeticExpression | Identifier | Literal | Condition | TRUE | FALSE
  public static boolean EvaluateValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EvaluateValue")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EVALUATE_VALUE, "<evaluate value>");
    r = ArithmeticExpression(b, l + 1);
    if (!r) r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    if (!r) r = Condition(b, l + 1);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EXIT PROGRAM
  public static boolean ExitProgramStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExitProgramStatement")) return false;
    if (!nextTokenIs(b, EXIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, EXIT, PROGRAM);
    exit_section_(b, m, EXIT_PROGRAM_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // EXIT DOT
  public static boolean ExitStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExitStatement")) return false;
    if (!nextTokenIs(b, EXIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, EXIT, DOT);
    exit_section_(b, m, EXIT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // ( IS )?
  public static boolean ExternalClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExternalClause")) return false;
    Marker m = enter_section_(b, l, _NONE_, EXTERNAL_CLAUSE, "<external clause>");
    consumeToken(b, IS);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // ZERO
  // |	ZEROS
  // |	ZEROES
  // |	SPACE
  // |	SPACES
  // |	HIGH_VALUE
  // |	HIGH_VALUES
  // |	LOW_VALUE
  // |	LOW_VALUES
  // |	QUOTE
  // |	QUOTES
  // |	NULL
  // |	NULLS
  public static boolean FigurativeConstant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FigurativeConstant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIGURATIVE_CONSTANT, "<figurative constant>");
    r = consumeToken(b, ZERO);
    if (!r) r = consumeToken(b, ZEROS);
    if (!r) r = consumeToken(b, ZEROES);
    if (!r) r = consumeToken(b, SPACE);
    if (!r) r = consumeToken(b, SPACES);
    if (!r) r = consumeToken(b, HIGH_VALUE);
    if (!r) r = consumeToken(b, HIGH_VALUES);
    if (!r) r = consumeToken(b, LOW_VALUE);
    if (!r) r = consumeToken(b, LOW_VALUES);
    if (!r) r = consumeToken(b, QUOTE);
    if (!r) r = consumeToken(b, QUOTES);
    if (!r) r = consumeToken(b, NULL);
    if (!r) r = consumeToken(b, NULLS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( FD | SD ) FileName ( ( DOT )? FileAndSortDescriptionEntryClause )* DOT
  public static boolean FileAndSortDescriptionEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileAndSortDescriptionEntry")) return false;
    if (!nextTokenIs(b, "<file and sort description entry>", FD, SD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FILE_AND_SORT_DESCRIPTION_ENTRY, "<file and sort description entry>");
    r = FileAndSortDescriptionEntry_0(b, l + 1);
    r = r && FileName(b, l + 1);
    r = r && FileAndSortDescriptionEntry_2(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // FD | SD
  private static boolean FileAndSortDescriptionEntry_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileAndSortDescriptionEntry_0")) return false;
    boolean r;
    r = consumeToken(b, FD);
    if (!r) r = consumeToken(b, SD);
    return r;
  }

  // ( ( DOT )? FileAndSortDescriptionEntryClause )*
  private static boolean FileAndSortDescriptionEntry_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileAndSortDescriptionEntry_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FileAndSortDescriptionEntry_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FileAndSortDescriptionEntry_2", c)) break;
    }
    return true;
  }

  // ( DOT )? FileAndSortDescriptionEntryClause
  private static boolean FileAndSortDescriptionEntry_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileAndSortDescriptionEntry_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FileAndSortDescriptionEntry_2_0_0(b, l + 1);
    r = r && FileAndSortDescriptionEntryClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( DOT )?
  private static boolean FileAndSortDescriptionEntry_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileAndSortDescriptionEntry_2_0_0")) return false;
    consumeToken(b, DOT);
    return true;
  }

  /* ********************************************************** */
  // ExternalClause
  // |	GlobalClause
  // |	BlockContainsClause
  // |	RecordContainsClause
  // |	LabelRecordsClause
  // |	ValueOfClause
  // |	DataRecordClause
  // |	LinageClause
  // |	CodeSetClause
  // |	ReportClause
  // |	RecordingModeClause
  public static boolean FileAndSortDescriptionEntryClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileAndSortDescriptionEntryClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FILE_AND_SORT_DESCRIPTION_ENTRY_CLAUSE, "<file and sort description entry clause>");
    r = ExternalClause(b, l + 1);
    if (!r) r = GlobalClause(b, l + 1);
    if (!r) r = BlockContainsClause(b, l + 1);
    if (!r) r = RecordContainsClause(b, l + 1);
    if (!r) r = LabelRecordsClause(b, l + 1);
    if (!r) r = ValueOfClause(b, l + 1);
    if (!r) r = DataRecordClause(b, l + 1);
    if (!r) r = LinageClause(b, l + 1);
    if (!r) r = CodeSetClause(b, l + 1);
    if (!r) r = ReportClause(b, l + 1);
    if (!r) r = RecordingModeClause(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ReserveClause
  // |	OrganizationClause
  // |	PaddingCharacterClause
  // |	RecordDelimiterClause
  // |	AccessModeClause
  // |	AlternateRecordKeyClause
  // |	FileStatusClause
  // |	PasswordClause
  public static boolean FileControlClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileControlClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FILE_CONTROL_CLAUSE, "<file control clause>");
    r = ReserveClause(b, l + 1);
    if (!r) r = OrganizationClause(b, l + 1);
    if (!r) r = PaddingCharacterClause(b, l + 1);
    if (!r) r = RecordDelimiterClause(b, l + 1);
    if (!r) r = AccessModeClause(b, l + 1);
    if (!r) r = AlternateRecordKeyClause(b, l + 1);
    if (!r) r = FileStatusClause(b, l + 1);
    if (!r) r = PasswordClause(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SelectClause AssignClause ( FileControlClause )*
  public static boolean FileControlEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileControlEntry")) return false;
    if (!nextTokenIs(b, SELECT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SelectClause(b, l + 1);
    r = r && AssignClause(b, l + 1);
    r = r && FileControlEntry_2(b, l + 1);
    exit_section_(b, m, FILE_CONTROL_ENTRY, r);
    return r;
  }

  // ( FileControlClause )*
  private static boolean FileControlEntry_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileControlEntry_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FileControlEntry_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FileControlEntry_2", c)) break;
    }
    return true;
  }

  // ( FileControlClause )
  private static boolean FileControlEntry_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileControlEntry_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FileControlClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FILE_CONTROL ( ( DOT )? FileControlEntry )+ DOT
  public static boolean FileControlParagraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileControlParagraph")) return false;
    if (!nextTokenIs(b, FILE_CONTROL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FILE_CONTROL);
    r = r && FileControlParagraph_1(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, FILE_CONTROL_PARAGRAPH, r);
    return r;
  }

  // ( ( DOT )? FileControlEntry )+
  private static boolean FileControlParagraph_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileControlParagraph_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FileControlParagraph_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!FileControlParagraph_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FileControlParagraph_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( DOT )? FileControlEntry
  private static boolean FileControlParagraph_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileControlParagraph_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FileControlParagraph_1_0_0(b, l + 1);
    r = r && FileControlEntry(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( DOT )?
  private static boolean FileControlParagraph_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileControlParagraph_1_0_0")) return false;
    consumeToken(b, DOT);
    return true;
  }

  /* ********************************************************** */
  // CobolWord
  public static boolean FileName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileName")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CobolWord(b, l + 1);
    exit_section_(b, m, FILE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // FILE SECTION DOT ( FileAndSortDescriptionEntry ( DataDescriptionEntry )+ )*
  public static boolean FileSection(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileSection")) return false;
    if (!nextTokenIs(b, FILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FILE, SECTION, DOT);
    r = r && FileSection_3(b, l + 1);
    exit_section_(b, m, FILE_SECTION, r);
    return r;
  }

  // ( FileAndSortDescriptionEntry ( DataDescriptionEntry )+ )*
  private static boolean FileSection_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileSection_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FileSection_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FileSection_3", c)) break;
    }
    return true;
  }

  // FileAndSortDescriptionEntry ( DataDescriptionEntry )+
  private static boolean FileSection_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileSection_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FileAndSortDescriptionEntry(b, l + 1);
    r = r && FileSection_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( DataDescriptionEntry )+
  private static boolean FileSection_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileSection_3_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FileSection_3_0_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!FileSection_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FileSection_3_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( DataDescriptionEntry )
  private static boolean FileSection_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileSection_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DataDescriptionEntry(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( FILE )? STATUS ( IS )? QualifiedDataName ( QualifiedDataName )?
  public static boolean FileStatusClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileStatusClause")) return false;
    if (!nextTokenIs(b, "<file status clause>", FILE, STATUS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FILE_STATUS_CLAUSE, "<file status clause>");
    r = FileStatusClause_0(b, l + 1);
    r = r && consumeToken(b, STATUS);
    r = r && FileStatusClause_2(b, l + 1);
    r = r && QualifiedDataName(b, l + 1);
    r = r && FileStatusClause_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( FILE )?
  private static boolean FileStatusClause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileStatusClause_0")) return false;
    consumeToken(b, FILE);
    return true;
  }

  // ( IS )?
  private static boolean FileStatusClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileStatusClause_2")) return false;
    consumeToken(b, IS);
    return true;
  }

  // ( QualifiedDataName )?
  private static boolean FileStatusClause_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileStatusClause_4")) return false;
    FileStatusClause_4_0(b, l + 1);
    return true;
  }

  // ( QualifiedDataName )
  private static boolean FileStatusClause_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileStatusClause_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedDataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( IS )? GLOBAL
  public static boolean GlobalClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GlobalClause")) return false;
    if (!nextTokenIs(b, "<global clause>", GLOBAL, IS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GLOBAL_CLAUSE, "<global clause>");
    r = GlobalClause_0(b, l + 1);
    r = r && consumeToken(b, GLOBAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( IS )?
  private static boolean GlobalClause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GlobalClause_0")) return false;
    consumeToken(b, IS);
    return true;
  }

  /* ********************************************************** */
  // GOBACK
  public static boolean GobackStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GobackStatement")) return false;
    if (!nextTokenIs(b, GOBACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GOBACK);
    exit_section_(b, m, GOBACK_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // GO ( TO )? ( ProcedureName ( DEPENDING ( ON )? QualifiedDataName )? | MORE_LABELS )
  public static boolean GotoStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GotoStatement")) return false;
    if (!nextTokenIs(b, GO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GO);
    r = r && GotoStatement_1(b, l + 1);
    r = r && GotoStatement_2(b, l + 1);
    exit_section_(b, m, GOTO_STATEMENT, r);
    return r;
  }

  // ( TO )?
  private static boolean GotoStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GotoStatement_1")) return false;
    consumeToken(b, TO);
    return true;
  }

  // ProcedureName ( DEPENDING ( ON )? QualifiedDataName )? | MORE_LABELS
  private static boolean GotoStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GotoStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GotoStatement_2_0(b, l + 1);
    if (!r) r = consumeToken(b, MORE_LABELS);
    exit_section_(b, m, null, r);
    return r;
  }

  // ProcedureName ( DEPENDING ( ON )? QualifiedDataName )?
  private static boolean GotoStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GotoStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ProcedureName(b, l + 1);
    r = r && GotoStatement_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( DEPENDING ( ON )? QualifiedDataName )?
  private static boolean GotoStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GotoStatement_2_0_1")) return false;
    GotoStatement_2_0_1_0(b, l + 1);
    return true;
  }

  // DEPENDING ( ON )? QualifiedDataName
  private static boolean GotoStatement_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GotoStatement_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEPENDING);
    r = r && GotoStatement_2_0_1_0_1(b, l + 1);
    r = r && QualifiedDataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ON )?
  private static boolean GotoStatement_2_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GotoStatement_2_0_1_0_1")) return false;
    consumeToken(b, ON);
    return true;
  }

  /* ********************************************************** */
  // RerunClause
  // |	SameAreaClause
  // |	MultipleFileClause
  public static boolean IOControlClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IOControlClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IO_CONTROL_CLAUSE, "<io control clause>");
    r = RerunClause(b, l + 1);
    if (!r) r = SameAreaClause(b, l + 1);
    if (!r) r = MultipleFileClause(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // I_O_CONTROL DOT ( IOControlClause ( ( DOT )? IOControlClause )* DOT )?
  public static boolean IOControlParagraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IOControlParagraph")) return false;
    if (!nextTokenIs(b, I_O_CONTROL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, I_O_CONTROL, DOT);
    r = r && IOControlParagraph_2(b, l + 1);
    exit_section_(b, m, IO_CONTROL_PARAGRAPH, r);
    return r;
  }

  // ( IOControlClause ( ( DOT )? IOControlClause )* DOT )?
  private static boolean IOControlParagraph_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IOControlParagraph_2")) return false;
    IOControlParagraph_2_0(b, l + 1);
    return true;
  }

  // IOControlClause ( ( DOT )? IOControlClause )* DOT
  private static boolean IOControlParagraph_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IOControlParagraph_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IOControlClause(b, l + 1);
    r = r && IOControlParagraph_2_0_1(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( DOT )? IOControlClause )*
  private static boolean IOControlParagraph_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IOControlParagraph_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!IOControlParagraph_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IOControlParagraph_2_0_1", c)) break;
    }
    return true;
  }

  // ( DOT )? IOControlClause
  private static boolean IOControlParagraph_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IOControlParagraph_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IOControlParagraph_2_0_1_0_0(b, l + 1);
    r = r && IOControlClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( DOT )?
  private static boolean IOControlParagraph_2_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IOControlParagraph_2_0_1_0_0")) return false;
    consumeToken(b, DOT);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFICATION DIVISION DOT ProgramIdParagraph ( IdentificationDivisionParagraph )*
  public static boolean IdentificationDivision(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentificationDivision")) return false;
    if (!nextTokenIs(b, IDENTIFICATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFICATION, DIVISION, DOT);
    r = r && ProgramIdParagraph(b, l + 1);
    r = r && IdentificationDivision_4(b, l + 1);
    exit_section_(b, m, IDENTIFICATION_DIVISION, r);
    return r;
  }

  // ( IdentificationDivisionParagraph )*
  private static boolean IdentificationDivision_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentificationDivision_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!IdentificationDivision_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IdentificationDivision_4", c)) break;
    }
    return true;
  }

  // ( IdentificationDivisionParagraph )
  private static boolean IdentificationDivision_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentificationDivision_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IdentificationDivisionParagraph(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AuthorParagraph
  // |	InstallationParagraph
  // |	DateWrittenParagraph
  // |	DateCompiledParagraph
  // |	SecurityParagraph
  public static boolean IdentificationDivisionParagraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentificationDivisionParagraph")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFICATION_DIVISION_PARAGRAPH, "<identification division paragraph>");
    r = AuthorParagraph(b, l + 1);
    if (!r) r = InstallationParagraph(b, l + 1);
    if (!r) r = DateWrittenParagraph(b, l + 1);
    if (!r) r = DateCompiledParagraph(b, l + 1);
    if (!r) r = SecurityParagraph(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // QualifiedDataName ( LPARENCHAR Subscript RPARENCHAR )* ( LPARENCHAR LeftmostCharacterPosition COLONCHAR ( Length )? RPARENCHAR )? | LINAGE_COUNTER ( ( IN | OF ) FileName )?
  public static boolean Identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER, "<identifier>");
    r = Identifier_0(b, l + 1);
    if (!r) r = Identifier_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // QualifiedDataName ( LPARENCHAR Subscript RPARENCHAR )* ( LPARENCHAR LeftmostCharacterPosition COLONCHAR ( Length )? RPARENCHAR )?
  private static boolean Identifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedDataName(b, l + 1);
    r = r && Identifier_0_1(b, l + 1);
    r = r && Identifier_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( LPARENCHAR Subscript RPARENCHAR )*
  private static boolean Identifier_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Identifier_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Identifier_0_1", c)) break;
    }
    return true;
  }

  // LPARENCHAR Subscript RPARENCHAR
  private static boolean Identifier_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPARENCHAR);
    r = r && Subscript(b, l + 1);
    r = r && consumeToken(b, RPARENCHAR);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( LPARENCHAR LeftmostCharacterPosition COLONCHAR ( Length )? RPARENCHAR )?
  private static boolean Identifier_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier_0_2")) return false;
    Identifier_0_2_0(b, l + 1);
    return true;
  }

  // LPARENCHAR LeftmostCharacterPosition COLONCHAR ( Length )? RPARENCHAR
  private static boolean Identifier_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPARENCHAR);
    r = r && LeftmostCharacterPosition(b, l + 1);
    r = r && consumeToken(b, COLONCHAR);
    r = r && Identifier_0_2_0_3(b, l + 1);
    r = r && consumeToken(b, RPARENCHAR);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Length )?
  private static boolean Identifier_0_2_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier_0_2_0_3")) return false;
    Identifier_0_2_0_3_0(b, l + 1);
    return true;
  }

  // ( Length )
  private static boolean Identifier_0_2_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier_0_2_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Length(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINAGE_COUNTER ( ( IN | OF ) FileName )?
  private static boolean Identifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINAGE_COUNTER);
    r = r && Identifier_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( IN | OF ) FileName )?
  private static boolean Identifier_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier_1_1")) return false;
    Identifier_1_1_0(b, l + 1);
    return true;
  }

  // ( IN | OF ) FileName
  private static boolean Identifier_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier_1_1_0_0(b, l + 1);
    r = r && FileName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IN | OF
  private static boolean Identifier_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier_1_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, OF);
    return r;
  }

  /* ********************************************************** */
  // IF Condition ( THEN )? ( ( Statement )+ | NEXT SENTENCE ) ( ELSE ( ( Statement )+ | NEXT SENTENCE ) )? ( END_IF )?
  public static boolean IfStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && Condition(b, l + 1);
    r = r && IfStatement_2(b, l + 1);
    r = r && IfStatement_3(b, l + 1);
    r = r && IfStatement_4(b, l + 1);
    r = r && IfStatement_5(b, l + 1);
    exit_section_(b, m, IF_STATEMENT, r);
    return r;
  }

  // ( THEN )?
  private static boolean IfStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_2")) return false;
    consumeToken(b, THEN);
    return true;
  }

  // ( Statement )+ | NEXT SENTENCE
  private static boolean IfStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IfStatement_3_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, NEXT, SENTENCE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Statement )+
  private static boolean IfStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IfStatement_3_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!IfStatement_3_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IfStatement_3_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Statement )
  private static boolean IfStatement_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ELSE ( ( Statement )+ | NEXT SENTENCE ) )?
  private static boolean IfStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_4")) return false;
    IfStatement_4_0(b, l + 1);
    return true;
  }

  // ELSE ( ( Statement )+ | NEXT SENTENCE )
  private static boolean IfStatement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && IfStatement_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Statement )+ | NEXT SENTENCE
  private static boolean IfStatement_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_4_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IfStatement_4_0_1_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, NEXT, SENTENCE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Statement )+
  private static boolean IfStatement_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_4_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IfStatement_4_0_1_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!IfStatement_4_0_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IfStatement_4_0_1_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Statement )
  private static boolean IfStatement_4_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_4_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( END_IF )?
  private static boolean IfStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_5")) return false;
    consumeToken(b, END_IF);
    return true;
  }

  /* ********************************************************** */
  // CobolWord
  public static boolean IndexName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexName")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CobolWord(b, l + 1);
    exit_section_(b, m, INDEX_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // INDEXED
  public static boolean IndexedOrganizationClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexedOrganizationClause")) return false;
    if (!nextTokenIs(b, INDEXED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INDEXED);
    exit_section_(b, m, INDEXED_ORGANIZATION_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // INITIAL ( COMMON )? | COMMON ( INITIAL )?
  public static boolean InitialOrCommon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InitialOrCommon")) return false;
    if (!nextTokenIs(b, "<initial or common>", COMMON, INITIAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INITIAL_OR_COMMON, "<initial or common>");
    r = InitialOrCommon_0(b, l + 1);
    if (!r) r = InitialOrCommon_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // INITIAL ( COMMON )?
  private static boolean InitialOrCommon_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InitialOrCommon_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INITIAL);
    r = r && InitialOrCommon_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( COMMON )?
  private static boolean InitialOrCommon_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InitialOrCommon_0_1")) return false;
    consumeToken(b, COMMON);
    return true;
  }

  // COMMON ( INITIAL )?
  private static boolean InitialOrCommon_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InitialOrCommon_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMON);
    r = r && InitialOrCommon_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( INITIAL )?
  private static boolean InitialOrCommon_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InitialOrCommon_1_1")) return false;
    consumeToken(b, INITIAL);
    return true;
  }

  /* ********************************************************** */
  // INITIALIZE ( Identifier )+ ( REPLACING ( ( ALPHABETIC | ALPHANUMERIC | NUMERIC | ALPHANUMERIC_EDITED | NUMERIC_EDITED | DBCS | EGCS ) ( DATA )? BY ( Identifier | Literal ) )+ )?
  public static boolean InitializeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InitializeStatement")) return false;
    if (!nextTokenIs(b, INITIALIZE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INITIALIZE);
    r = r && InitializeStatement_1(b, l + 1);
    r = r && InitializeStatement_2(b, l + 1);
    exit_section_(b, m, INITIALIZE_STATEMENT, r);
    return r;
  }

  // ( Identifier )+
  private static boolean InitializeStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InitializeStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InitializeStatement_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!InitializeStatement_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InitializeStatement_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Identifier )
  private static boolean InitializeStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InitializeStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( REPLACING ( ( ALPHABETIC | ALPHANUMERIC | NUMERIC | ALPHANUMERIC_EDITED | NUMERIC_EDITED | DBCS | EGCS ) ( DATA )? BY ( Identifier | Literal ) )+ )?
  private static boolean InitializeStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InitializeStatement_2")) return false;
    InitializeStatement_2_0(b, l + 1);
    return true;
  }

  // REPLACING ( ( ALPHABETIC | ALPHANUMERIC | NUMERIC | ALPHANUMERIC_EDITED | NUMERIC_EDITED | DBCS | EGCS ) ( DATA )? BY ( Identifier | Literal ) )+
  private static boolean InitializeStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InitializeStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REPLACING);
    r = r && InitializeStatement_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( ALPHABETIC | ALPHANUMERIC | NUMERIC | ALPHANUMERIC_EDITED | NUMERIC_EDITED | DBCS | EGCS ) ( DATA )? BY ( Identifier | Literal ) )+
  private static boolean InitializeStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InitializeStatement_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InitializeStatement_2_0_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!InitializeStatement_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InitializeStatement_2_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ALPHABETIC | ALPHANUMERIC | NUMERIC | ALPHANUMERIC_EDITED | NUMERIC_EDITED | DBCS | EGCS ) ( DATA )? BY ( Identifier | Literal )
  private static boolean InitializeStatement_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InitializeStatement_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InitializeStatement_2_0_1_0_0(b, l + 1);
    r = r && InitializeStatement_2_0_1_0_1(b, l + 1);
    r = r && consumeToken(b, BY);
    r = r && InitializeStatement_2_0_1_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ALPHABETIC | ALPHANUMERIC | NUMERIC | ALPHANUMERIC_EDITED | NUMERIC_EDITED | DBCS | EGCS
  private static boolean InitializeStatement_2_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InitializeStatement_2_0_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, ALPHABETIC);
    if (!r) r = consumeToken(b, ALPHANUMERIC);
    if (!r) r = consumeToken(b, NUMERIC);
    if (!r) r = consumeToken(b, ALPHANUMERIC_EDITED);
    if (!r) r = consumeToken(b, NUMERIC_EDITED);
    if (!r) r = consumeToken(b, DBCS);
    if (!r) r = consumeToken(b, EGCS);
    return r;
  }

  // ( DATA )?
  private static boolean InitializeStatement_2_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InitializeStatement_2_0_1_0_1")) return false;
    consumeToken(b, DATA);
    return true;
  }

  // Identifier | Literal
  private static boolean InitializeStatement_2_0_1_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InitializeStatement_2_0_1_0_3")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // INPUT_OUTPUT SECTION DOT ( InputOutputSectionParagraph )*
  public static boolean InputOutputSection(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InputOutputSection")) return false;
    if (!nextTokenIs(b, INPUT_OUTPUT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INPUT_OUTPUT, SECTION, DOT);
    r = r && InputOutputSection_3(b, l + 1);
    exit_section_(b, m, INPUT_OUTPUT_SECTION, r);
    return r;
  }

  // ( InputOutputSectionParagraph )*
  private static boolean InputOutputSection_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InputOutputSection_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!InputOutputSection_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InputOutputSection_3", c)) break;
    }
    return true;
  }

  // ( InputOutputSectionParagraph )
  private static boolean InputOutputSection_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InputOutputSection_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InputOutputSectionParagraph(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FileControlParagraph
  // |	IOControlParagraph
  public static boolean InputOutputSectionParagraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InputOutputSectionParagraph")) return false;
    if (!nextTokenIs(b, "<input output section paragraph>", FILE_CONTROL, I_O_CONTROL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INPUT_OUTPUT_SECTION_PARAGRAPH, "<input output section paragraph>");
    r = FileControlParagraph(b, l + 1);
    if (!r) r = IOControlParagraph(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // INSPECT QualifiedDataName ( TallyingPhrase | ConvertingPhrase | ReplacingPhrase )
  public static boolean InspectStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InspectStatement")) return false;
    if (!nextTokenIs(b, INSPECT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INSPECT);
    r = r && QualifiedDataName(b, l + 1);
    r = r && InspectStatement_2(b, l + 1);
    exit_section_(b, m, INSPECT_STATEMENT, r);
    return r;
  }

  // TallyingPhrase | ConvertingPhrase | ReplacingPhrase
  private static boolean InspectStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InspectStatement_2")) return false;
    boolean r;
    r = TallyingPhrase(b, l + 1);
    if (!r) r = ConvertingPhrase(b, l + 1);
    if (!r) r = ReplacingPhrase(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // INSTALLATION DOT ( CommentLine )?
  public static boolean InstallationParagraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InstallationParagraph")) return false;
    if (!nextTokenIs(b, INSTALLATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INSTALLATION, DOT);
    r = r && InstallationParagraph_2(b, l + 1);
    exit_section_(b, m, INSTALLATION_PARAGRAPH, r);
    return r;
  }

  // ( CommentLine )?
  private static boolean InstallationParagraph_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InstallationParagraph_2")) return false;
    InstallationParagraph_2_0(b, l + 1);
    return true;
  }

  // ( CommentLine )
  private static boolean InstallationParagraph_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InstallationParagraph_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CommentLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LEVEL_66
  // |	LEVEL_77
  // |	LEVEL_88
  // |	LEVEL_NUMBER
  // |	INTEGER
  public static boolean IntegerConstant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IntegerConstant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTEGER_CONSTANT, "<integer constant>");
    r = consumeToken(b, LEVEL_66);
    if (!r) r = consumeToken(b, LEVEL_77);
    if (!r) r = consumeToken(b, LEVEL_88);
    if (!r) r = consumeToken(b, LEVEL_NUMBER);
    if (!r) r = consumeToken(b, INTEGER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LABEL ( RECORD ( IS )? | RECORDS ( ARE )? ) OMITTED
  // |	STANDARD
  // |	( DataName )+
  public static boolean LabelRecordsClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelRecordsClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LABEL_RECORDS_CLAUSE, "<label records clause>");
    r = LabelRecordsClause_0(b, l + 1);
    if (!r) r = consumeToken(b, STANDARD);
    if (!r) r = LabelRecordsClause_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LABEL ( RECORD ( IS )? | RECORDS ( ARE )? ) OMITTED
  private static boolean LabelRecordsClause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelRecordsClause_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LABEL);
    r = r && LabelRecordsClause_0_1(b, l + 1);
    r = r && consumeToken(b, OMITTED);
    exit_section_(b, m, null, r);
    return r;
  }

  // RECORD ( IS )? | RECORDS ( ARE )?
  private static boolean LabelRecordsClause_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelRecordsClause_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LabelRecordsClause_0_1_0(b, l + 1);
    if (!r) r = LabelRecordsClause_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // RECORD ( IS )?
  private static boolean LabelRecordsClause_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelRecordsClause_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RECORD);
    r = r && LabelRecordsClause_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IS )?
  private static boolean LabelRecordsClause_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelRecordsClause_0_1_0_1")) return false;
    consumeToken(b, IS);
    return true;
  }

  // RECORDS ( ARE )?
  private static boolean LabelRecordsClause_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelRecordsClause_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RECORDS);
    r = r && LabelRecordsClause_0_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ARE )?
  private static boolean LabelRecordsClause_0_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelRecordsClause_0_1_1_1")) return false;
    consumeToken(b, ARE);
    return true;
  }

  // ( DataName )+
  private static boolean LabelRecordsClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelRecordsClause_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LabelRecordsClause_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!LabelRecordsClause_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LabelRecordsClause_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( DataName )
  private static boolean LabelRecordsClause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelRecordsClause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SystemName
  public static boolean LanguageName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LanguageName")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SystemName(b, l + 1);
    exit_section_(b, m, LANGUAGE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // ArithmeticExpression
  public static boolean LeftmostCharacterPosition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LeftmostCharacterPosition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LEFTMOST_CHARACTER_POSITION, "<leftmost character position>");
    r = ArithmeticExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ArithmeticExpression
  public static boolean Length(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Length")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LENGTH, "<length>");
    r = ArithmeticExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LEVEL_NUMBER
  public static boolean LevelNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LevelNumber")) return false;
    if (!nextTokenIs(b, LEVEL_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEVEL_NUMBER);
    exit_section_(b, m, LEVEL_NUMBER, r);
    return r;
  }

  /* ********************************************************** */
  // CobolWord
  public static boolean LibraryName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LibraryName")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CobolWord(b, l + 1);
    exit_section_(b, m, LIBRARY_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // LINAGE ( IS )? ( DataName | IntegerConstant ) ( LINES )? ( ( WITH )? FOOTING ( AT )? ( DataName | IntegerConstant ) | ( LINES )? ( AT )? TOP ( DataName | IntegerConstant ) | ( LINES )? ( AT )? BOTTOM ( DataName | IntegerConstant ) )*
  public static boolean LinageClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinageClause")) return false;
    if (!nextTokenIs(b, LINAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINAGE);
    r = r && LinageClause_1(b, l + 1);
    r = r && LinageClause_2(b, l + 1);
    r = r && LinageClause_3(b, l + 1);
    r = r && LinageClause_4(b, l + 1);
    exit_section_(b, m, LINAGE_CLAUSE, r);
    return r;
  }

  // ( IS )?
  private static boolean LinageClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinageClause_1")) return false;
    consumeToken(b, IS);
    return true;
  }

  // DataName | IntegerConstant
  private static boolean LinageClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinageClause_2")) return false;
    boolean r;
    r = DataName(b, l + 1);
    if (!r) r = IntegerConstant(b, l + 1);
    return r;
  }

  // ( LINES )?
  private static boolean LinageClause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinageClause_3")) return false;
    consumeToken(b, LINES);
    return true;
  }

  // ( ( WITH )? FOOTING ( AT )? ( DataName | IntegerConstant ) | ( LINES )? ( AT )? TOP ( DataName | IntegerConstant ) | ( LINES )? ( AT )? BOTTOM ( DataName | IntegerConstant ) )*
  private static boolean LinageClause_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinageClause_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LinageClause_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LinageClause_4", c)) break;
    }
    return true;
  }

  // ( WITH )? FOOTING ( AT )? ( DataName | IntegerConstant ) | ( LINES )? ( AT )? TOP ( DataName | IntegerConstant ) | ( LINES )? ( AT )? BOTTOM ( DataName | IntegerConstant )
  private static boolean LinageClause_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinageClause_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LinageClause_4_0_0(b, l + 1);
    if (!r) r = LinageClause_4_0_1(b, l + 1);
    if (!r) r = LinageClause_4_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WITH )? FOOTING ( AT )? ( DataName | IntegerConstant )
  private static boolean LinageClause_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinageClause_4_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LinageClause_4_0_0_0(b, l + 1);
    r = r && consumeToken(b, FOOTING);
    r = r && LinageClause_4_0_0_2(b, l + 1);
    r = r && LinageClause_4_0_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WITH )?
  private static boolean LinageClause_4_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinageClause_4_0_0_0")) return false;
    consumeToken(b, WITH);
    return true;
  }

  // ( AT )?
  private static boolean LinageClause_4_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinageClause_4_0_0_2")) return false;
    consumeToken(b, AT);
    return true;
  }

  // DataName | IntegerConstant
  private static boolean LinageClause_4_0_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinageClause_4_0_0_3")) return false;
    boolean r;
    r = DataName(b, l + 1);
    if (!r) r = IntegerConstant(b, l + 1);
    return r;
  }

  // ( LINES )? ( AT )? TOP ( DataName | IntegerConstant )
  private static boolean LinageClause_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinageClause_4_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LinageClause_4_0_1_0(b, l + 1);
    r = r && LinageClause_4_0_1_1(b, l + 1);
    r = r && consumeToken(b, TOP);
    r = r && LinageClause_4_0_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( LINES )?
  private static boolean LinageClause_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinageClause_4_0_1_0")) return false;
    consumeToken(b, LINES);
    return true;
  }

  // ( AT )?
  private static boolean LinageClause_4_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinageClause_4_0_1_1")) return false;
    consumeToken(b, AT);
    return true;
  }

  // DataName | IntegerConstant
  private static boolean LinageClause_4_0_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinageClause_4_0_1_3")) return false;
    boolean r;
    r = DataName(b, l + 1);
    if (!r) r = IntegerConstant(b, l + 1);
    return r;
  }

  // ( LINES )? ( AT )? BOTTOM ( DataName | IntegerConstant )
  private static boolean LinageClause_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinageClause_4_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LinageClause_4_0_2_0(b, l + 1);
    r = r && LinageClause_4_0_2_1(b, l + 1);
    r = r && consumeToken(b, BOTTOM);
    r = r && LinageClause_4_0_2_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( LINES )?
  private static boolean LinageClause_4_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinageClause_4_0_2_0")) return false;
    consumeToken(b, LINES);
    return true;
  }

  // ( AT )?
  private static boolean LinageClause_4_0_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinageClause_4_0_2_1")) return false;
    consumeToken(b, AT);
    return true;
  }

  // DataName | IntegerConstant
  private static boolean LinageClause_4_0_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinageClause_4_0_2_3")) return false;
    boolean r;
    r = DataName(b, l + 1);
    if (!r) r = IntegerConstant(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // LINE SEQUENTIAL
  public static boolean LineSequentialOrganizationClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LineSequentialOrganizationClause")) return false;
    if (!nextTokenIs(b, LINE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINE, SEQUENTIAL);
    exit_section_(b, m, LINE_SEQUENTIAL_ORGANIZATION_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // LINKAGE SECTION DOT ( DataDescriptionEntry )*
  public static boolean LinkageSection(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinkageSection")) return false;
    if (!nextTokenIs(b, LINKAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINKAGE, SECTION, DOT);
    r = r && LinkageSection_3(b, l + 1);
    exit_section_(b, m, LINKAGE_SECTION, r);
    return r;
  }

  // ( DataDescriptionEntry )*
  private static boolean LinkageSection_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinkageSection_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LinkageSection_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LinkageSection_3", c)) break;
    }
    return true;
  }

  // ( DataDescriptionEntry )
  private static boolean LinkageSection_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LinkageSection_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DataDescriptionEntry(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( ALL )? ( NonNumericConstant | NumericConstant | FigurativeConstant )
  public static boolean Literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = Literal_0(b, l + 1);
    r = r && Literal_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ALL )?
  private static boolean Literal_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Literal_0")) return false;
    consumeToken(b, ALL);
    return true;
  }

  // NonNumericConstant | NumericConstant | FigurativeConstant
  private static boolean Literal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Literal_1")) return false;
    boolean r;
    r = NonNumericConstant(b, l + 1);
    if (!r) r = NumericConstant(b, l + 1);
    if (!r) r = FigurativeConstant(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // MEMORY ( SIZE )? IntegerConstant ( WORDS | CHARACTERS | MODULES )?
  public static boolean MemorySizeClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemorySizeClause")) return false;
    if (!nextTokenIs(b, MEMORY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MEMORY);
    r = r && MemorySizeClause_1(b, l + 1);
    r = r && IntegerConstant(b, l + 1);
    r = r && MemorySizeClause_3(b, l + 1);
    exit_section_(b, m, MEMORY_SIZE_CLAUSE, r);
    return r;
  }

  // ( SIZE )?
  private static boolean MemorySizeClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemorySizeClause_1")) return false;
    consumeToken(b, SIZE);
    return true;
  }

  // ( WORDS | CHARACTERS | MODULES )?
  private static boolean MemorySizeClause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemorySizeClause_3")) return false;
    MemorySizeClause_3_0(b, l + 1);
    return true;
  }

  // WORDS | CHARACTERS | MODULES
  private static boolean MemorySizeClause_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemorySizeClause_3_0")) return false;
    boolean r;
    r = consumeToken(b, WORDS);
    if (!r) r = consumeToken(b, CHARACTERS);
    if (!r) r = consumeToken(b, MODULES);
    return r;
  }

  /* ********************************************************** */
  // MERGE FileName ( ( ON )? ( ASCENDING | DESCENDING ) ( KEY )? ( QualifiedDataName )+ )+ ( ( COLLATING )? SEQUENCE ( IS )? AlphabetName )? USING FileName ( FileName )+ ( OUTPUT PROCEDURE ( IS )? ProcedureName ( ( THROUGH | THRU ) ProcedureName )? | GIVING ( FileName )+ )
  public static boolean MergeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeStatement")) return false;
    if (!nextTokenIs(b, MERGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MERGE);
    r = r && FileName(b, l + 1);
    r = r && MergeStatement_2(b, l + 1);
    r = r && MergeStatement_3(b, l + 1);
    r = r && consumeToken(b, USING);
    r = r && FileName(b, l + 1);
    r = r && MergeStatement_6(b, l + 1);
    r = r && MergeStatement_7(b, l + 1);
    exit_section_(b, m, MERGE_STATEMENT, r);
    return r;
  }

  // ( ( ON )? ( ASCENDING | DESCENDING ) ( KEY )? ( QualifiedDataName )+ )+
  private static boolean MergeStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MergeStatement_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!MergeStatement_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MergeStatement_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ON )? ( ASCENDING | DESCENDING ) ( KEY )? ( QualifiedDataName )+
  private static boolean MergeStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MergeStatement_2_0_0(b, l + 1);
    r = r && MergeStatement_2_0_1(b, l + 1);
    r = r && MergeStatement_2_0_2(b, l + 1);
    r = r && MergeStatement_2_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ON )?
  private static boolean MergeStatement_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeStatement_2_0_0")) return false;
    consumeToken(b, ON);
    return true;
  }

  // ASCENDING | DESCENDING
  private static boolean MergeStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeStatement_2_0_1")) return false;
    boolean r;
    r = consumeToken(b, ASCENDING);
    if (!r) r = consumeToken(b, DESCENDING);
    return r;
  }

  // ( KEY )?
  private static boolean MergeStatement_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeStatement_2_0_2")) return false;
    consumeToken(b, KEY);
    return true;
  }

  // ( QualifiedDataName )+
  private static boolean MergeStatement_2_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeStatement_2_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MergeStatement_2_0_3_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!MergeStatement_2_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MergeStatement_2_0_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( QualifiedDataName )
  private static boolean MergeStatement_2_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeStatement_2_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedDataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( COLLATING )? SEQUENCE ( IS )? AlphabetName )?
  private static boolean MergeStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeStatement_3")) return false;
    MergeStatement_3_0(b, l + 1);
    return true;
  }

  // ( COLLATING )? SEQUENCE ( IS )? AlphabetName
  private static boolean MergeStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MergeStatement_3_0_0(b, l + 1);
    r = r && consumeToken(b, SEQUENCE);
    r = r && MergeStatement_3_0_2(b, l + 1);
    r = r && AlphabetName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( COLLATING )?
  private static boolean MergeStatement_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeStatement_3_0_0")) return false;
    consumeToken(b, COLLATING);
    return true;
  }

  // ( IS )?
  private static boolean MergeStatement_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeStatement_3_0_2")) return false;
    consumeToken(b, IS);
    return true;
  }

  // ( FileName )+
  private static boolean MergeStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeStatement_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MergeStatement_6_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!MergeStatement_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MergeStatement_6", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FileName )
  private static boolean MergeStatement_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeStatement_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FileName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OUTPUT PROCEDURE ( IS )? ProcedureName ( ( THROUGH | THRU ) ProcedureName )? | GIVING ( FileName )+
  private static boolean MergeStatement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeStatement_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MergeStatement_7_0(b, l + 1);
    if (!r) r = MergeStatement_7_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OUTPUT PROCEDURE ( IS )? ProcedureName ( ( THROUGH | THRU ) ProcedureName )?
  private static boolean MergeStatement_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeStatement_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OUTPUT, PROCEDURE);
    r = r && MergeStatement_7_0_2(b, l + 1);
    r = r && ProcedureName(b, l + 1);
    r = r && MergeStatement_7_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IS )?
  private static boolean MergeStatement_7_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeStatement_7_0_2")) return false;
    consumeToken(b, IS);
    return true;
  }

  // ( ( THROUGH | THRU ) ProcedureName )?
  private static boolean MergeStatement_7_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeStatement_7_0_4")) return false;
    MergeStatement_7_0_4_0(b, l + 1);
    return true;
  }

  // ( THROUGH | THRU ) ProcedureName
  private static boolean MergeStatement_7_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeStatement_7_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MergeStatement_7_0_4_0_0(b, l + 1);
    r = r && ProcedureName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // THROUGH | THRU
  private static boolean MergeStatement_7_0_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeStatement_7_0_4_0_0")) return false;
    boolean r;
    r = consumeToken(b, THROUGH);
    if (!r) r = consumeToken(b, THRU);
    return r;
  }

  // GIVING ( FileName )+
  private static boolean MergeStatement_7_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeStatement_7_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GIVING);
    r = r && MergeStatement_7_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FileName )+
  private static boolean MergeStatement_7_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeStatement_7_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MergeStatement_7_1_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!MergeStatement_7_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MergeStatement_7_1_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FileName )
  private static boolean MergeStatement_7_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeStatement_7_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FileName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CobolWord
  public static boolean MnemonicName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MnemonicName")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CobolWord(b, l + 1);
    exit_section_(b, m, MNEMONIC_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // CobolWord
  public static boolean Mode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Mode")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CobolWord(b, l + 1);
    exit_section_(b, m, MODE, r);
    return r;
  }

  /* ********************************************************** */
  // MOVE ( ( Identifier | Literal ) TO ( Identifier )+ | ( CORRESPONDING | CORR ) QualifiedDataName TO ( QualifiedDataName )+ )
  public static boolean MoveStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MoveStatement")) return false;
    if (!nextTokenIs(b, MOVE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MOVE);
    r = r && MoveStatement_1(b, l + 1);
    exit_section_(b, m, MOVE_STATEMENT, r);
    return r;
  }

  // ( Identifier | Literal ) TO ( Identifier )+ | ( CORRESPONDING | CORR ) QualifiedDataName TO ( QualifiedDataName )+
  private static boolean MoveStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MoveStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MoveStatement_1_0(b, l + 1);
    if (!r) r = MoveStatement_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Identifier | Literal ) TO ( Identifier )+
  private static boolean MoveStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MoveStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MoveStatement_1_0_0(b, l + 1);
    r = r && consumeToken(b, TO);
    r = r && MoveStatement_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier | Literal
  private static boolean MoveStatement_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MoveStatement_1_0_0")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  // ( Identifier )+
  private static boolean MoveStatement_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MoveStatement_1_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MoveStatement_1_0_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!MoveStatement_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MoveStatement_1_0_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Identifier )
  private static boolean MoveStatement_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MoveStatement_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( CORRESPONDING | CORR ) QualifiedDataName TO ( QualifiedDataName )+
  private static boolean MoveStatement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MoveStatement_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MoveStatement_1_1_0(b, l + 1);
    r = r && QualifiedDataName(b, l + 1);
    r = r && consumeToken(b, TO);
    r = r && MoveStatement_1_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CORRESPONDING | CORR
  private static boolean MoveStatement_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MoveStatement_1_1_0")) return false;
    boolean r;
    r = consumeToken(b, CORRESPONDING);
    if (!r) r = consumeToken(b, CORR);
    return r;
  }

  // ( QualifiedDataName )+
  private static boolean MoveStatement_1_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MoveStatement_1_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MoveStatement_1_1_3_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!MoveStatement_1_1_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MoveStatement_1_1_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( QualifiedDataName )
  private static boolean MoveStatement_1_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MoveStatement_1_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedDataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MULTIPLE FILE ( TAPE )? ( CONTAINS )? FileName ( POSITION )? ( IntegerConstant )?
  public static boolean MultipleFileClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultipleFileClause")) return false;
    if (!nextTokenIs(b, MULTIPLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MULTIPLE, FILE);
    r = r && MultipleFileClause_2(b, l + 1);
    r = r && MultipleFileClause_3(b, l + 1);
    r = r && FileName(b, l + 1);
    r = r && MultipleFileClause_5(b, l + 1);
    r = r && MultipleFileClause_6(b, l + 1);
    exit_section_(b, m, MULTIPLE_FILE_CLAUSE, r);
    return r;
  }

  // ( TAPE )?
  private static boolean MultipleFileClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultipleFileClause_2")) return false;
    consumeToken(b, TAPE);
    return true;
  }

  // ( CONTAINS )?
  private static boolean MultipleFileClause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultipleFileClause_3")) return false;
    consumeToken(b, CONTAINS);
    return true;
  }

  // ( POSITION )?
  private static boolean MultipleFileClause_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultipleFileClause_5")) return false;
    consumeToken(b, POSITION);
    return true;
  }

  // ( IntegerConstant )?
  private static boolean MultipleFileClause_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultipleFileClause_6")) return false;
    MultipleFileClause_6_0(b, l + 1);
    return true;
  }

  // ( IntegerConstant )
  private static boolean MultipleFileClause_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultipleFileClause_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IntegerConstant(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MULTIPLY ( Identifier | Literal ) BY ( Identifier | Literal ) ( GIVING ( Identifier ( ROUNDED )? )+ )? ( ( ON )? SIZE ERROR StatementList )? ( NOT ( ON )? SIZE ERROR StatementList )? ( END_MULTIPLY )?
  public static boolean MultiplyStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiplyStatement")) return false;
    if (!nextTokenIs(b, MULTIPLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MULTIPLY);
    r = r && MultiplyStatement_1(b, l + 1);
    r = r && consumeToken(b, BY);
    r = r && MultiplyStatement_3(b, l + 1);
    r = r && MultiplyStatement_4(b, l + 1);
    r = r && MultiplyStatement_5(b, l + 1);
    r = r && MultiplyStatement_6(b, l + 1);
    r = r && MultiplyStatement_7(b, l + 1);
    exit_section_(b, m, MULTIPLY_STATEMENT, r);
    return r;
  }

  // Identifier | Literal
  private static boolean MultiplyStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiplyStatement_1")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  // Identifier | Literal
  private static boolean MultiplyStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiplyStatement_3")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  // ( GIVING ( Identifier ( ROUNDED )? )+ )?
  private static boolean MultiplyStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiplyStatement_4")) return false;
    MultiplyStatement_4_0(b, l + 1);
    return true;
  }

  // GIVING ( Identifier ( ROUNDED )? )+
  private static boolean MultiplyStatement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiplyStatement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GIVING);
    r = r && MultiplyStatement_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Identifier ( ROUNDED )? )+
  private static boolean MultiplyStatement_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiplyStatement_4_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MultiplyStatement_4_0_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!MultiplyStatement_4_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MultiplyStatement_4_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier ( ROUNDED )?
  private static boolean MultiplyStatement_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiplyStatement_4_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && MultiplyStatement_4_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ROUNDED )?
  private static boolean MultiplyStatement_4_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiplyStatement_4_0_1_0_1")) return false;
    consumeToken(b, ROUNDED);
    return true;
  }

  // ( ( ON )? SIZE ERROR StatementList )?
  private static boolean MultiplyStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiplyStatement_5")) return false;
    MultiplyStatement_5_0(b, l + 1);
    return true;
  }

  // ( ON )? SIZE ERROR StatementList
  private static boolean MultiplyStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiplyStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MultiplyStatement_5_0_0(b, l + 1);
    r = r && consumeTokens(b, 0, SIZE, ERROR);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ON )?
  private static boolean MultiplyStatement_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiplyStatement_5_0_0")) return false;
    consumeToken(b, ON);
    return true;
  }

  // ( NOT ( ON )? SIZE ERROR StatementList )?
  private static boolean MultiplyStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiplyStatement_6")) return false;
    MultiplyStatement_6_0(b, l + 1);
    return true;
  }

  // NOT ( ON )? SIZE ERROR StatementList
  private static boolean MultiplyStatement_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiplyStatement_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && MultiplyStatement_6_0_1(b, l + 1);
    r = r && consumeTokens(b, 0, SIZE, ERROR);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ON )?
  private static boolean MultiplyStatement_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiplyStatement_6_0_1")) return false;
    consumeToken(b, ON);
    return true;
  }

  // ( END_MULTIPLY )?
  private static boolean MultiplyStatement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiplyStatement_7")) return false;
    consumeToken(b, END_MULTIPLY);
    return true;
  }

  /* ********************************************************** */
  // ( IDENTIFICATION | ID ) DIVISION DOT NestedProgramIdParagraph ( IdentificationDivisionParagraph )*
  public static boolean NestedIdentificationDivision(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedIdentificationDivision")) return false;
    if (!nextTokenIs(b, "<nested identification division>", ID, IDENTIFICATION)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NESTED_IDENTIFICATION_DIVISION, "<nested identification division>");
    r = NestedIdentificationDivision_0(b, l + 1);
    r = r && consumeTokens(b, 0, DIVISION, DOT);
    r = r && NestedProgramIdParagraph(b, l + 1);
    r = r && NestedIdentificationDivision_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENTIFICATION | ID
  private static boolean NestedIdentificationDivision_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedIdentificationDivision_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFICATION);
    if (!r) r = consumeToken(b, ID);
    return r;
  }

  // ( IdentificationDivisionParagraph )*
  private static boolean NestedIdentificationDivision_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedIdentificationDivision_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NestedIdentificationDivision_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NestedIdentificationDivision_4", c)) break;
    }
    return true;
  }

  // ( IdentificationDivisionParagraph )
  private static boolean NestedIdentificationDivision_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedIdentificationDivision_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IdentificationDivisionParagraph(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PROGRAM_ID DOT ProgramName ( ( IS )? InitialOrCommon ( PROGRAM )? )? DOT
  public static boolean NestedProgramIdParagraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedProgramIdParagraph")) return false;
    if (!nextTokenIs(b, PROGRAM_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PROGRAM_ID, DOT);
    r = r && ProgramName(b, l + 1);
    r = r && NestedProgramIdParagraph_3(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, NESTED_PROGRAM_ID_PARAGRAPH, r);
    return r;
  }

  // ( ( IS )? InitialOrCommon ( PROGRAM )? )?
  private static boolean NestedProgramIdParagraph_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedProgramIdParagraph_3")) return false;
    NestedProgramIdParagraph_3_0(b, l + 1);
    return true;
  }

  // ( IS )? InitialOrCommon ( PROGRAM )?
  private static boolean NestedProgramIdParagraph_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedProgramIdParagraph_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NestedProgramIdParagraph_3_0_0(b, l + 1);
    r = r && InitialOrCommon(b, l + 1);
    r = r && NestedProgramIdParagraph_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IS )?
  private static boolean NestedProgramIdParagraph_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedProgramIdParagraph_3_0_0")) return false;
    consumeToken(b, IS);
    return true;
  }

  // ( PROGRAM )?
  private static boolean NestedProgramIdParagraph_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedProgramIdParagraph_3_0_2")) return false;
    consumeToken(b, PROGRAM);
    return true;
  }

  /* ********************************************************** */
  // NestedIdentificationDivision ( EnvironmentDivision )? ( DataDivision )? ( ProcedureDivision )?
  public static boolean NestedProgramUnit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedProgramUnit")) return false;
    if (!nextTokenIs(b, "<nested program unit>", ID, IDENTIFICATION)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NESTED_PROGRAM_UNIT, "<nested program unit>");
    r = NestedIdentificationDivision(b, l + 1);
    r = r && NestedProgramUnit_1(b, l + 1);
    r = r && NestedProgramUnit_2(b, l + 1);
    r = r && NestedProgramUnit_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( EnvironmentDivision )?
  private static boolean NestedProgramUnit_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedProgramUnit_1")) return false;
    NestedProgramUnit_1_0(b, l + 1);
    return true;
  }

  // ( EnvironmentDivision )
  private static boolean NestedProgramUnit_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedProgramUnit_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EnvironmentDivision(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( DataDivision )?
  private static boolean NestedProgramUnit_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedProgramUnit_2")) return false;
    NestedProgramUnit_2_0(b, l + 1);
    return true;
  }

  // ( DataDivision )
  private static boolean NestedProgramUnit_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedProgramUnit_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DataDivision(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ProcedureDivision )?
  private static boolean NestedProgramUnit_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedProgramUnit_3")) return false;
    NestedProgramUnit_3_0(b, l + 1);
    return true;
  }

  // ( ProcedureDivision )
  private static boolean NestedProgramUnit_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedProgramUnit_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ProcedureDivision(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( QUOTEDSTRING )+ | HEXNUMBER
  public static boolean NonNumericConstant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonNumericConstant")) return false;
    if (!nextTokenIs(b, "<non numeric constant>", HEXNUMBER, QUOTEDSTRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NON_NUMERIC_CONSTANT, "<non numeric constant>");
    r = NonNumericConstant_0(b, l + 1);
    if (!r) r = consumeToken(b, HEXNUMBER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( QUOTEDSTRING )+
  private static boolean NonNumericConstant_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonNumericConstant_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUOTEDSTRING);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, QUOTEDSTRING)) break;
      if (!empty_element_parsed_guard_(b, "NonNumericConstant_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( PLUSCHAR | MINUSCHAR )? IntegerConstant ( DOTCHAR IntegerConstant )?
  public static boolean NumericConstant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumericConstant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMERIC_CONSTANT, "<numeric constant>");
    r = NumericConstant_0(b, l + 1);
    r = r && IntegerConstant(b, l + 1);
    r = r && NumericConstant_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( PLUSCHAR | MINUSCHAR )?
  private static boolean NumericConstant_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumericConstant_0")) return false;
    NumericConstant_0_0(b, l + 1);
    return true;
  }

  // PLUSCHAR | MINUSCHAR
  private static boolean NumericConstant_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumericConstant_0_0")) return false;
    boolean r;
    r = consumeToken(b, PLUSCHAR);
    if (!r) r = consumeToken(b, MINUSCHAR);
    return r;
  }

  // ( DOTCHAR IntegerConstant )?
  private static boolean NumericConstant_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumericConstant_2")) return false;
    NumericConstant_2_0(b, l + 1);
    return true;
  }

  // DOTCHAR IntegerConstant
  private static boolean NumericConstant_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumericConstant_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOTCHAR);
    r = r && IntegerConstant(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MemorySizeClause
  // |	CollatingSequenceClause
  // |	SegmentLimitClause
  // |	CharacterSetClause
  public static boolean ObjectComputerClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectComputerClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_COMPUTER_CLAUSE, "<object computer clause>");
    r = MemorySizeClause(b, l + 1);
    if (!r) r = CollatingSequenceClause(b, l + 1);
    if (!r) r = SegmentLimitClause(b, l + 1);
    if (!r) r = CharacterSetClause(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OBJECT_COMPUTER DOT ComputerName ( ObjectComputerClause )* DOT
  public static boolean ObjectComputerParagraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectComputerParagraph")) return false;
    if (!nextTokenIs(b, OBJECT_COMPUTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OBJECT_COMPUTER, DOT);
    r = r && ComputerName(b, l + 1);
    r = r && ObjectComputerParagraph_3(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, OBJECT_COMPUTER_PARAGRAPH, r);
    return r;
  }

  // ( ObjectComputerClause )*
  private static boolean ObjectComputerParagraph_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectComputerParagraph_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ObjectComputerParagraph_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ObjectComputerParagraph_3", c)) break;
    }
    return true;
  }

  // ( ObjectComputerClause )
  private static boolean ObjectComputerParagraph_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectComputerParagraph_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ObjectComputerClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OPEN ( INPUT ( FileName ( ( REVERSED | ( WITH )? NO REWIND ) )? )+ | OUTPUT ( FileName ( ( WITH )? NO REWIND )? )+ | I_O ( FileName )+ | EXTEND ( FileName )+ )+
  public static boolean OpenStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenStatement")) return false;
    if (!nextTokenIs(b, OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN);
    r = r && OpenStatement_1(b, l + 1);
    exit_section_(b, m, OPEN_STATEMENT, r);
    return r;
  }

  // ( INPUT ( FileName ( ( REVERSED | ( WITH )? NO REWIND ) )? )+ | OUTPUT ( FileName ( ( WITH )? NO REWIND )? )+ | I_O ( FileName )+ | EXTEND ( FileName )+ )+
  private static boolean OpenStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OpenStatement_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!OpenStatement_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "OpenStatement_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // INPUT ( FileName ( ( REVERSED | ( WITH )? NO REWIND ) )? )+ | OUTPUT ( FileName ( ( WITH )? NO REWIND )? )+ | I_O ( FileName )+ | EXTEND ( FileName )+
  private static boolean OpenStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OpenStatement_1_0_0(b, l + 1);
    if (!r) r = OpenStatement_1_0_1(b, l + 1);
    if (!r) r = OpenStatement_1_0_2(b, l + 1);
    if (!r) r = OpenStatement_1_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INPUT ( FileName ( ( REVERSED | ( WITH )? NO REWIND ) )? )+
  private static boolean OpenStatement_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenStatement_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INPUT);
    r = r && OpenStatement_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FileName ( ( REVERSED | ( WITH )? NO REWIND ) )? )+
  private static boolean OpenStatement_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenStatement_1_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OpenStatement_1_0_0_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!OpenStatement_1_0_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "OpenStatement_1_0_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // FileName ( ( REVERSED | ( WITH )? NO REWIND ) )?
  private static boolean OpenStatement_1_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenStatement_1_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FileName(b, l + 1);
    r = r && OpenStatement_1_0_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( REVERSED | ( WITH )? NO REWIND ) )?
  private static boolean OpenStatement_1_0_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenStatement_1_0_0_1_0_1")) return false;
    OpenStatement_1_0_0_1_0_1_0(b, l + 1);
    return true;
  }

  // REVERSED | ( WITH )? NO REWIND
  private static boolean OpenStatement_1_0_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenStatement_1_0_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REVERSED);
    if (!r) r = OpenStatement_1_0_0_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WITH )? NO REWIND
  private static boolean OpenStatement_1_0_0_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenStatement_1_0_0_1_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OpenStatement_1_0_0_1_0_1_0_1_0(b, l + 1);
    r = r && consumeTokens(b, 0, NO, REWIND);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WITH )?
  private static boolean OpenStatement_1_0_0_1_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenStatement_1_0_0_1_0_1_0_1_0")) return false;
    consumeToken(b, WITH);
    return true;
  }

  // OUTPUT ( FileName ( ( WITH )? NO REWIND )? )+
  private static boolean OpenStatement_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenStatement_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OUTPUT);
    r = r && OpenStatement_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FileName ( ( WITH )? NO REWIND )? )+
  private static boolean OpenStatement_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenStatement_1_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OpenStatement_1_0_1_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!OpenStatement_1_0_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "OpenStatement_1_0_1_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // FileName ( ( WITH )? NO REWIND )?
  private static boolean OpenStatement_1_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenStatement_1_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FileName(b, l + 1);
    r = r && OpenStatement_1_0_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( WITH )? NO REWIND )?
  private static boolean OpenStatement_1_0_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenStatement_1_0_1_1_0_1")) return false;
    OpenStatement_1_0_1_1_0_1_0(b, l + 1);
    return true;
  }

  // ( WITH )? NO REWIND
  private static boolean OpenStatement_1_0_1_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenStatement_1_0_1_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OpenStatement_1_0_1_1_0_1_0_0(b, l + 1);
    r = r && consumeTokens(b, 0, NO, REWIND);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WITH )?
  private static boolean OpenStatement_1_0_1_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenStatement_1_0_1_1_0_1_0_0")) return false;
    consumeToken(b, WITH);
    return true;
  }

  // I_O ( FileName )+
  private static boolean OpenStatement_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenStatement_1_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, I_O);
    r = r && OpenStatement_1_0_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FileName )+
  private static boolean OpenStatement_1_0_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenStatement_1_0_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OpenStatement_1_0_2_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!OpenStatement_1_0_2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "OpenStatement_1_0_2_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FileName )
  private static boolean OpenStatement_1_0_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenStatement_1_0_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FileName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EXTEND ( FileName )+
  private static boolean OpenStatement_1_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenStatement_1_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTEND);
    r = r && OpenStatement_1_0_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FileName )+
  private static boolean OpenStatement_1_0_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenStatement_1_0_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OpenStatement_1_0_3_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!OpenStatement_1_0_3_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "OpenStatement_1_0_3_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FileName )
  private static boolean OpenStatement_1_0_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenStatement_1_0_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FileName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( ORGANIZATION )? ( IS )? ( SequentialOrganizationClause | LineSequentialOrganizationClause | RelativeOrganizationClause | IndexedOrganizationClause )
  public static boolean OrganizationClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OrganizationClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ORGANIZATION_CLAUSE, "<organization clause>");
    r = OrganizationClause_0(b, l + 1);
    r = r && OrganizationClause_1(b, l + 1);
    r = r && OrganizationClause_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ORGANIZATION )?
  private static boolean OrganizationClause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OrganizationClause_0")) return false;
    consumeToken(b, ORGANIZATION);
    return true;
  }

  // ( IS )?
  private static boolean OrganizationClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OrganizationClause_1")) return false;
    consumeToken(b, IS);
    return true;
  }

  // SequentialOrganizationClause | LineSequentialOrganizationClause | RelativeOrganizationClause | IndexedOrganizationClause
  private static boolean OrganizationClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OrganizationClause_2")) return false;
    boolean r;
    r = SequentialOrganizationClause(b, l + 1);
    if (!r) r = LineSequentialOrganizationClause(b, l + 1);
    if (!r) r = RelativeOrganizationClause(b, l + 1);
    if (!r) r = IndexedOrganizationClause(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // PADDING ( CHARACTER )? ( IS )? ( QualifiedDataName | Literal )
  public static boolean PaddingCharacterClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PaddingCharacterClause")) return false;
    if (!nextTokenIs(b, PADDING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PADDING);
    r = r && PaddingCharacterClause_1(b, l + 1);
    r = r && PaddingCharacterClause_2(b, l + 1);
    r = r && PaddingCharacterClause_3(b, l + 1);
    exit_section_(b, m, PADDING_CHARACTER_CLAUSE, r);
    return r;
  }

  // ( CHARACTER )?
  private static boolean PaddingCharacterClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PaddingCharacterClause_1")) return false;
    consumeToken(b, CHARACTER);
    return true;
  }

  // ( IS )?
  private static boolean PaddingCharacterClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PaddingCharacterClause_2")) return false;
    consumeToken(b, IS);
    return true;
  }

  // QualifiedDataName | Literal
  private static boolean PaddingCharacterClause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PaddingCharacterClause_3")) return false;
    boolean r;
    r = QualifiedDataName(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ParagraphName DOT ( ExitStatement | AlteredGoto | ( Sentence )* )
  public static boolean Paragraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Paragraph")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParagraphName(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && Paragraph_2(b, l + 1);
    exit_section_(b, m, PARAGRAPH, r);
    return r;
  }

  // ExitStatement | AlteredGoto | ( Sentence )*
  private static boolean Paragraph_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Paragraph_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExitStatement(b, l + 1);
    if (!r) r = AlteredGoto(b, l + 1);
    if (!r) r = Paragraph_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Sentence )*
  private static boolean Paragraph_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Paragraph_2_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Paragraph_2_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Paragraph_2_2", c)) break;
    }
    return true;
  }

  // ( Sentence )
  private static boolean Paragraph_2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Paragraph_2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Sentence(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CobolWord
  public static boolean ParagraphName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParagraphName")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CobolWord(b, l + 1);
    exit_section_(b, m, PARAGRAPH_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // ( Sentence )* ( Paragraph )*
  public static boolean Paragraphs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Paragraphs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAGRAPHS, "<paragraphs>");
    r = Paragraphs_0(b, l + 1);
    r = r && Paragraphs_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( Sentence )*
  private static boolean Paragraphs_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Paragraphs_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Paragraphs_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Paragraphs_0", c)) break;
    }
    return true;
  }

  // ( Sentence )
  private static boolean Paragraphs_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Paragraphs_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Sentence(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Paragraph )*
  private static boolean Paragraphs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Paragraphs_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Paragraphs_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Paragraphs_1", c)) break;
    }
    return true;
  }

  // ( Paragraph )
  private static boolean Paragraphs_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Paragraphs_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Paragraph(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PASSWORD ( IS )? DataName
  public static boolean PasswordClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PasswordClause")) return false;
    if (!nextTokenIs(b, PASSWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PASSWORD);
    r = r && PasswordClause_1(b, l + 1);
    r = r && DataName(b, l + 1);
    exit_section_(b, m, PASSWORD_CLAUSE, r);
    return r;
  }

  // ( IS )?
  private static boolean PasswordClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PasswordClause_1")) return false;
    consumeToken(b, IS);
    return true;
  }

  /* ********************************************************** */
  // PerformTimeClause
  // |	PerformUntilClause
  // |	PerformVaryingWithTestClause
  public static boolean PerformFlavour(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformFlavour")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PERFORM_FLAVOUR, "<perform flavour>");
    r = PerformTimeClause(b, l + 1);
    if (!r) r = PerformUntilClause(b, l + 1);
    if (!r) r = PerformVaryingWithTestClause(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ProcedureName ( ( THROUGH | THRU ) ProcedureName )?
  public static boolean PerformProcedureScopeClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformProcedureScopeClause")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ProcedureName(b, l + 1);
    r = r && PerformProcedureScopeClause_1(b, l + 1);
    exit_section_(b, m, PERFORM_PROCEDURE_SCOPE_CLAUSE, r);
    return r;
  }

  // ( ( THROUGH | THRU ) ProcedureName )?
  private static boolean PerformProcedureScopeClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformProcedureScopeClause_1")) return false;
    PerformProcedureScopeClause_1_0(b, l + 1);
    return true;
  }

  // ( THROUGH | THRU ) ProcedureName
  private static boolean PerformProcedureScopeClause_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformProcedureScopeClause_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PerformProcedureScopeClause_1_0_0(b, l + 1);
    r = r && ProcedureName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // THROUGH | THRU
  private static boolean PerformProcedureScopeClause_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformProcedureScopeClause_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, THROUGH);
    if (!r) r = consumeToken(b, THRU);
    return r;
  }

  /* ********************************************************** */
  // PERFORM ( PerformProcedureScopeClause ( PerformFlavour )? | PerformFlavour ( StatementList END_PERFORM | PerformProcedureScopeClause ) )
  public static boolean PerformStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformStatement")) return false;
    if (!nextTokenIs(b, PERFORM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERFORM);
    r = r && PerformStatement_1(b, l + 1);
    exit_section_(b, m, PERFORM_STATEMENT, r);
    return r;
  }

  // PerformProcedureScopeClause ( PerformFlavour )? | PerformFlavour ( StatementList END_PERFORM | PerformProcedureScopeClause )
  private static boolean PerformStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PerformStatement_1_0(b, l + 1);
    if (!r) r = PerformStatement_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PerformProcedureScopeClause ( PerformFlavour )?
  private static boolean PerformStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PerformProcedureScopeClause(b, l + 1);
    r = r && PerformStatement_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( PerformFlavour )?
  private static boolean PerformStatement_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformStatement_1_0_1")) return false;
    PerformStatement_1_0_1_0(b, l + 1);
    return true;
  }

  // ( PerformFlavour )
  private static boolean PerformStatement_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformStatement_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PerformFlavour(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PerformFlavour ( StatementList END_PERFORM | PerformProcedureScopeClause )
  private static boolean PerformStatement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformStatement_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PerformFlavour(b, l + 1);
    r = r && PerformStatement_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // StatementList END_PERFORM | PerformProcedureScopeClause
  private static boolean PerformStatement_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformStatement_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PerformStatement_1_1_1_0(b, l + 1);
    if (!r) r = PerformProcedureScopeClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // StatementList END_PERFORM
  private static boolean PerformStatement_1_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformStatement_1_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StatementList(b, l + 1);
    r = r && consumeToken(b, END_PERFORM);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( WITH )? TEST ( BEFORE | AFTER )
  public static boolean PerformTestPositionClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformTestPositionClause")) return false;
    if (!nextTokenIs(b, "<perform test position clause>", TEST, WITH)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PERFORM_TEST_POSITION_CLAUSE, "<perform test position clause>");
    r = PerformTestPositionClause_0(b, l + 1);
    r = r && consumeToken(b, TEST);
    r = r && PerformTestPositionClause_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( WITH )?
  private static boolean PerformTestPositionClause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformTestPositionClause_0")) return false;
    consumeToken(b, WITH);
    return true;
  }

  // BEFORE | AFTER
  private static boolean PerformTestPositionClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformTestPositionClause_2")) return false;
    boolean r;
    r = consumeToken(b, BEFORE);
    if (!r) r = consumeToken(b, AFTER);
    return r;
  }

  /* ********************************************************** */
  // ( QualifiedDataName | IntegerConstant ) TIMES
  public static boolean PerformTimeClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformTimeClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PERFORM_TIME_CLAUSE, "<perform time clause>");
    r = PerformTimeClause_0(b, l + 1);
    r = r && consumeToken(b, TIMES);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // QualifiedDataName | IntegerConstant
  private static boolean PerformTimeClause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformTimeClause_0")) return false;
    boolean r;
    r = QualifiedDataName(b, l + 1);
    if (!r) r = IntegerConstant(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // UNTIL Condition
  public static boolean PerformUntilClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformUntilClause")) return false;
    if (!nextTokenIs(b, UNTIL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNTIL);
    r = r && Condition(b, l + 1);
    exit_section_(b, m, PERFORM_UNTIL_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // VARYING QualifiedDataName FROM ( Identifier | Literal ) BY ( Identifier | Literal ) PerformUntilClause
  public static boolean PerformVaryingClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformVaryingClause")) return false;
    if (!nextTokenIs(b, VARYING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VARYING);
    r = r && QualifiedDataName(b, l + 1);
    r = r && consumeToken(b, FROM);
    r = r && PerformVaryingClause_3(b, l + 1);
    r = r && consumeToken(b, BY);
    r = r && PerformVaryingClause_5(b, l + 1);
    r = r && PerformUntilClause(b, l + 1);
    exit_section_(b, m, PERFORM_VARYING_CLAUSE, r);
    return r;
  }

  // Identifier | Literal
  private static boolean PerformVaryingClause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformVaryingClause_3")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  // Identifier | Literal
  private static boolean PerformVaryingClause_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformVaryingClause_5")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // PerformTestPositionClause PerformVaryingClause | PerformVaryingClause ( PerformTestPositionClause )?
  public static boolean PerformVaryingWithTestClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformVaryingWithTestClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PERFORM_VARYING_WITH_TEST_CLAUSE, "<perform varying with test clause>");
    r = PerformVaryingWithTestClause_0(b, l + 1);
    if (!r) r = PerformVaryingWithTestClause_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PerformTestPositionClause PerformVaryingClause
  private static boolean PerformVaryingWithTestClause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformVaryingWithTestClause_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PerformTestPositionClause(b, l + 1);
    r = r && PerformVaryingClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PerformVaryingClause ( PerformTestPositionClause )?
  private static boolean PerformVaryingWithTestClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformVaryingWithTestClause_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PerformVaryingClause(b, l + 1);
    r = r && PerformVaryingWithTestClause_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( PerformTestPositionClause )?
  private static boolean PerformVaryingWithTestClause_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformVaryingWithTestClause_1_1")) return false;
    PerformVaryingWithTestClause_1_1_0(b, l + 1);
    return true;
  }

  // ( PerformTestPositionClause )
  private static boolean PerformVaryingWithTestClause_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PerformVaryingWithTestClause_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PerformTestPositionClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INTEGER
  // |	COBOL_WORD
  public static boolean PictureChars(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PictureChars")) return false;
    if (!nextTokenIs(b, "<picture chars>", COBOL_WORD, INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PICTURE_CHARS, "<picture chars>");
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, COBOL_WORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DOLLARCHAR
  public static boolean PictureCurrency(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PictureCurrency")) return false;
    if (!nextTokenIs(b, DOLLARCHAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOLLARCHAR);
    exit_section_(b, m, PICTURE_CURRENCY, r);
    return r;
  }

  /* ********************************************************** */
  // SLASHCHAR
  // |	COMMACHAR
  // |	DOTCHAR
  // |	COLONCHAR
  public static boolean PicturePunctuation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PicturePunctuation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PICTURE_PUNCTUATION, "<picture punctuation>");
    r = consumeToken(b, SLASHCHAR);
    if (!r) r = consumeToken(b, COMMACHAR);
    if (!r) r = consumeToken(b, DOTCHAR);
    if (!r) r = consumeToken(b, COLONCHAR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( PictureCurrency )? ( ( PictureChars )+ ( LPARENCHAR IntegerConstant RPARENCHAR )? )+ ( PicturePunctuation ( ( PictureChars )+ ( LPARENCHAR IntegerConstant RPARENCHAR )? )+ )?
  public static boolean PictureString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PictureString")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PICTURE_STRING, "<picture string>");
    r = PictureString_0(b, l + 1);
    r = r && PictureString_1(b, l + 1);
    r = r && PictureString_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( PictureCurrency )?
  private static boolean PictureString_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PictureString_0")) return false;
    PictureString_0_0(b, l + 1);
    return true;
  }

  // ( PictureCurrency )
  private static boolean PictureString_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PictureString_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PictureCurrency(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( PictureChars )+ ( LPARENCHAR IntegerConstant RPARENCHAR )? )+
  private static boolean PictureString_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PictureString_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PictureString_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!PictureString_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PictureString_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( PictureChars )+ ( LPARENCHAR IntegerConstant RPARENCHAR )?
  private static boolean PictureString_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PictureString_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PictureString_1_0_0(b, l + 1);
    r = r && PictureString_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( PictureChars )+
  private static boolean PictureString_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PictureString_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PictureString_1_0_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!PictureString_1_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PictureString_1_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( PictureChars )
  private static boolean PictureString_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PictureString_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PictureChars(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( LPARENCHAR IntegerConstant RPARENCHAR )?
  private static boolean PictureString_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PictureString_1_0_1")) return false;
    PictureString_1_0_1_0(b, l + 1);
    return true;
  }

  // LPARENCHAR IntegerConstant RPARENCHAR
  private static boolean PictureString_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PictureString_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPARENCHAR);
    r = r && IntegerConstant(b, l + 1);
    r = r && consumeToken(b, RPARENCHAR);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( PicturePunctuation ( ( PictureChars )+ ( LPARENCHAR IntegerConstant RPARENCHAR )? )+ )?
  private static boolean PictureString_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PictureString_2")) return false;
    PictureString_2_0(b, l + 1);
    return true;
  }

  // PicturePunctuation ( ( PictureChars )+ ( LPARENCHAR IntegerConstant RPARENCHAR )? )+
  private static boolean PictureString_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PictureString_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PicturePunctuation(b, l + 1);
    r = r && PictureString_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( PictureChars )+ ( LPARENCHAR IntegerConstant RPARENCHAR )? )+
  private static boolean PictureString_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PictureString_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PictureString_2_0_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!PictureString_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PictureString_2_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( PictureChars )+ ( LPARENCHAR IntegerConstant RPARENCHAR )?
  private static boolean PictureString_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PictureString_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PictureString_2_0_1_0_0(b, l + 1);
    r = r && PictureString_2_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( PictureChars )+
  private static boolean PictureString_2_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PictureString_2_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PictureString_2_0_1_0_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!PictureString_2_0_1_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PictureString_2_0_1_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( PictureChars )
  private static boolean PictureString_2_0_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PictureString_2_0_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PictureChars(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( LPARENCHAR IntegerConstant RPARENCHAR )?
  private static boolean PictureString_2_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PictureString_2_0_1_0_1")) return false;
    PictureString_2_0_1_0_1_0(b, l + 1);
    return true;
  }

  // LPARENCHAR IntegerConstant RPARENCHAR
  private static boolean PictureString_2_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PictureString_2_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPARENCHAR);
    r = r && IntegerConstant(b, l + 1);
    r = r && consumeToken(b, RPARENCHAR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( ( PLUSCHAR | MINUSCHAR ) )? Basis ( "**" Basis )*
  public static boolean Power(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Power")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POWER, "<power>");
    r = Power_0(b, l + 1);
    r = r && Basis(b, l + 1);
    r = r && Power_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ( PLUSCHAR | MINUSCHAR ) )?
  private static boolean Power_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Power_0")) return false;
    Power_0_0(b, l + 1);
    return true;
  }

  // PLUSCHAR | MINUSCHAR
  private static boolean Power_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Power_0_0")) return false;
    boolean r;
    r = consumeToken(b, PLUSCHAR);
    if (!r) r = consumeToken(b, MINUSCHAR);
    return r;
  }

  // ( "**" Basis )*
  private static boolean Power_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Power_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Power_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Power_2", c)) break;
    }
    return true;
  }

  // "**" Basis
  private static boolean Power_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Power_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "**");
    r = r && Basis(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Paragraphs ( ProcedureSection )*
  public static boolean ProcedureBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcedureBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROCEDURE_BODY, "<procedure body>");
    r = Paragraphs(b, l + 1);
    r = r && ProcedureBody_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ProcedureSection )*
  private static boolean ProcedureBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcedureBody_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ProcedureBody_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ProcedureBody_1", c)) break;
    }
    return true;
  }

  // ( ProcedureSection )
  private static boolean ProcedureBody_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcedureBody_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ProcedureSection(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PROCEDURE DIVISION ( USING ( DataName )+ )? DOT ( Declaratives )? ProcedureBody
  public static boolean ProcedureDivision(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcedureDivision")) return false;
    if (!nextTokenIs(b, PROCEDURE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PROCEDURE, DIVISION);
    r = r && ProcedureDivision_2(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && ProcedureDivision_4(b, l + 1);
    r = r && ProcedureBody(b, l + 1);
    exit_section_(b, m, PROCEDURE_DIVISION, r);
    return r;
  }

  // ( USING ( DataName )+ )?
  private static boolean ProcedureDivision_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcedureDivision_2")) return false;
    ProcedureDivision_2_0(b, l + 1);
    return true;
  }

  // USING ( DataName )+
  private static boolean ProcedureDivision_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcedureDivision_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USING);
    r = r && ProcedureDivision_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( DataName )+
  private static boolean ProcedureDivision_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcedureDivision_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ProcedureDivision_2_0_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ProcedureDivision_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ProcedureDivision_2_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( DataName )
  private static boolean ProcedureDivision_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcedureDivision_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Declaratives )?
  private static boolean ProcedureDivision_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcedureDivision_4")) return false;
    ProcedureDivision_4_0(b, l + 1);
    return true;
  }

  // ( Declaratives )
  private static boolean ProcedureDivision_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcedureDivision_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Declaratives(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ParagraphName ( ( IN | OF ) SectionName )? | SectionName
  public static boolean ProcedureName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcedureName")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ProcedureName_0(b, l + 1);
    if (!r) r = SectionName(b, l + 1);
    exit_section_(b, m, PROCEDURE_NAME, r);
    return r;
  }

  // ParagraphName ( ( IN | OF ) SectionName )?
  private static boolean ProcedureName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcedureName_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParagraphName(b, l + 1);
    r = r && ProcedureName_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( IN | OF ) SectionName )?
  private static boolean ProcedureName_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcedureName_0_1")) return false;
    ProcedureName_0_1_0(b, l + 1);
    return true;
  }

  // ( IN | OF ) SectionName
  private static boolean ProcedureName_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcedureName_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ProcedureName_0_1_0_0(b, l + 1);
    r = r && SectionName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IN | OF
  private static boolean ProcedureName_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcedureName_0_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, OF);
    return r;
  }

  /* ********************************************************** */
  // SectionHeader DOT Paragraphs
  public static boolean ProcedureSection(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcedureSection")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SectionHeader(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && Paragraphs(b, l + 1);
    exit_section_(b, m, PROCEDURE_SECTION, r);
    return r;
  }

  /* ********************************************************** */
  // PROGRAM_ID DOT ProgramName ( ( IS )? INITIAL ( PROGRAM )? )? DOT
  public static boolean ProgramIdParagraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramIdParagraph")) return false;
    if (!nextTokenIs(b, PROGRAM_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PROGRAM_ID, DOT);
    r = r && ProgramName(b, l + 1);
    r = r && ProgramIdParagraph_3(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, PROGRAM_ID_PARAGRAPH, r);
    return r;
  }

  // ( ( IS )? INITIAL ( PROGRAM )? )?
  private static boolean ProgramIdParagraph_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramIdParagraph_3")) return false;
    ProgramIdParagraph_3_0(b, l + 1);
    return true;
  }

  // ( IS )? INITIAL ( PROGRAM )?
  private static boolean ProgramIdParagraph_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramIdParagraph_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ProgramIdParagraph_3_0_0(b, l + 1);
    r = r && consumeToken(b, INITIAL);
    r = r && ProgramIdParagraph_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IS )?
  private static boolean ProgramIdParagraph_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramIdParagraph_3_0_0")) return false;
    consumeToken(b, IS);
    return true;
  }

  // ( PROGRAM )?
  private static boolean ProgramIdParagraph_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramIdParagraph_3_0_2")) return false;
    consumeToken(b, PROGRAM);
    return true;
  }

  /* ********************************************************** */
  // CobolWord
  public static boolean ProgramName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramName")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CobolWord(b, l + 1);
    exit_section_(b, m, PROGRAM_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // IdentificationDivision ( EnvironmentDivision )? ( DataDivision )? ( ProcedureDivision )?
  public static boolean ProgramUnit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramUnit")) return false;
    if (!nextTokenIs(b, IDENTIFICATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IdentificationDivision(b, l + 1);
    r = r && ProgramUnit_1(b, l + 1);
    r = r && ProgramUnit_2(b, l + 1);
    r = r && ProgramUnit_3(b, l + 1);
    exit_section_(b, m, PROGRAM_UNIT, r);
    return r;
  }

  // ( EnvironmentDivision )?
  private static boolean ProgramUnit_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramUnit_1")) return false;
    ProgramUnit_1_0(b, l + 1);
    return true;
  }

  // ( EnvironmentDivision )
  private static boolean ProgramUnit_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramUnit_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EnvironmentDivision(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( DataDivision )?
  private static boolean ProgramUnit_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramUnit_2")) return false;
    ProgramUnit_2_0(b, l + 1);
    return true;
  }

  // ( DataDivision )
  private static boolean ProgramUnit_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramUnit_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DataDivision(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ProcedureDivision )?
  private static boolean ProgramUnit_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramUnit_3")) return false;
    ProgramUnit_3_0(b, l + 1);
    return true;
  }

  // ( ProcedureDivision )
  private static boolean ProgramUnit_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramUnit_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ProcedureDivision(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DataName ( ( IN | OF ) DataName )* ( ( IN | OF ) FileName )? | SpecialRegister
  public static boolean QualifiedDataName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedDataName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUALIFIED_DATA_NAME, "<qualified data name>");
    r = QualifiedDataName_0(b, l + 1);
    if (!r) r = SpecialRegister(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DataName ( ( IN | OF ) DataName )* ( ( IN | OF ) FileName )?
  private static boolean QualifiedDataName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedDataName_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DataName(b, l + 1);
    r = r && QualifiedDataName_0_1(b, l + 1);
    r = r && QualifiedDataName_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( IN | OF ) DataName )*
  private static boolean QualifiedDataName_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedDataName_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!QualifiedDataName_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "QualifiedDataName_0_1", c)) break;
    }
    return true;
  }

  // ( IN | OF ) DataName
  private static boolean QualifiedDataName_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedDataName_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedDataName_0_1_0_0(b, l + 1);
    r = r && DataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IN | OF
  private static boolean QualifiedDataName_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedDataName_0_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, OF);
    return r;
  }

  // ( ( IN | OF ) FileName )?
  private static boolean QualifiedDataName_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedDataName_0_2")) return false;
    QualifiedDataName_0_2_0(b, l + 1);
    return true;
  }

  // ( IN | OF ) FileName
  private static boolean QualifiedDataName_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedDataName_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedDataName_0_2_0_0(b, l + 1);
    r = r && FileName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IN | OF
  private static boolean QualifiedDataName_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedDataName_0_2_0_0")) return false;
    boolean r;
    r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, OF);
    return r;
  }

  /* ********************************************************** */
  // RANDOM ( RelativeKeyClause )?
  public static boolean RandomAccessMode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RandomAccessMode")) return false;
    if (!nextTokenIs(b, RANDOM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RANDOM);
    r = r && RandomAccessMode_1(b, l + 1);
    exit_section_(b, m, RANDOM_ACCESS_MODE, r);
    return r;
  }

  // ( RelativeKeyClause )?
  private static boolean RandomAccessMode_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RandomAccessMode_1")) return false;
    RandomAccessMode_1_0(b, l + 1);
    return true;
  }

  // ( RelativeKeyClause )
  private static boolean RandomAccessMode_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RandomAccessMode_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RelativeKeyClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // READ FileName ( NEXT )? ( RECORD )? ( INTO QualifiedDataName )? ( KEY ( IS )? QualifiedDataName )? ( INVALID ( KEY )? StatementList )? ( NOT INVALID ( KEY )? StatementList )? ( ( AT )? END StatementList )? ( NOT ( AT )? END StatementList )? ( END_READ )?
  public static boolean ReadStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReadStatement")) return false;
    if (!nextTokenIs(b, READ)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, READ);
    r = r && FileName(b, l + 1);
    r = r && ReadStatement_2(b, l + 1);
    r = r && ReadStatement_3(b, l + 1);
    r = r && ReadStatement_4(b, l + 1);
    r = r && ReadStatement_5(b, l + 1);
    r = r && ReadStatement_6(b, l + 1);
    r = r && ReadStatement_7(b, l + 1);
    r = r && ReadStatement_8(b, l + 1);
    r = r && ReadStatement_9(b, l + 1);
    r = r && ReadStatement_10(b, l + 1);
    exit_section_(b, m, READ_STATEMENT, r);
    return r;
  }

  // ( NEXT )?
  private static boolean ReadStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReadStatement_2")) return false;
    consumeToken(b, NEXT);
    return true;
  }

  // ( RECORD )?
  private static boolean ReadStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReadStatement_3")) return false;
    consumeToken(b, RECORD);
    return true;
  }

  // ( INTO QualifiedDataName )?
  private static boolean ReadStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReadStatement_4")) return false;
    ReadStatement_4_0(b, l + 1);
    return true;
  }

  // INTO QualifiedDataName
  private static boolean ReadStatement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReadStatement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTO);
    r = r && QualifiedDataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( KEY ( IS )? QualifiedDataName )?
  private static boolean ReadStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReadStatement_5")) return false;
    ReadStatement_5_0(b, l + 1);
    return true;
  }

  // KEY ( IS )? QualifiedDataName
  private static boolean ReadStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReadStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEY);
    r = r && ReadStatement_5_0_1(b, l + 1);
    r = r && QualifiedDataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IS )?
  private static boolean ReadStatement_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReadStatement_5_0_1")) return false;
    consumeToken(b, IS);
    return true;
  }

  // ( INVALID ( KEY )? StatementList )?
  private static boolean ReadStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReadStatement_6")) return false;
    ReadStatement_6_0(b, l + 1);
    return true;
  }

  // INVALID ( KEY )? StatementList
  private static boolean ReadStatement_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReadStatement_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INVALID);
    r = r && ReadStatement_6_0_1(b, l + 1);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( KEY )?
  private static boolean ReadStatement_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReadStatement_6_0_1")) return false;
    consumeToken(b, KEY);
    return true;
  }

  // ( NOT INVALID ( KEY )? StatementList )?
  private static boolean ReadStatement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReadStatement_7")) return false;
    ReadStatement_7_0(b, l + 1);
    return true;
  }

  // NOT INVALID ( KEY )? StatementList
  private static boolean ReadStatement_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReadStatement_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NOT, INVALID);
    r = r && ReadStatement_7_0_2(b, l + 1);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( KEY )?
  private static boolean ReadStatement_7_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReadStatement_7_0_2")) return false;
    consumeToken(b, KEY);
    return true;
  }

  // ( ( AT )? END StatementList )?
  private static boolean ReadStatement_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReadStatement_8")) return false;
    ReadStatement_8_0(b, l + 1);
    return true;
  }

  // ( AT )? END StatementList
  private static boolean ReadStatement_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReadStatement_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ReadStatement_8_0_0(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( AT )?
  private static boolean ReadStatement_8_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReadStatement_8_0_0")) return false;
    consumeToken(b, AT);
    return true;
  }

  // ( NOT ( AT )? END StatementList )?
  private static boolean ReadStatement_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReadStatement_9")) return false;
    ReadStatement_9_0(b, l + 1);
    return true;
  }

  // NOT ( AT )? END StatementList
  private static boolean ReadStatement_9_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReadStatement_9_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && ReadStatement_9_0_1(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( AT )?
  private static boolean ReadStatement_9_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReadStatement_9_0_1")) return false;
    consumeToken(b, AT);
    return true;
  }

  // ( END_READ )?
  private static boolean ReadStatement_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReadStatement_10")) return false;
    consumeToken(b, END_READ);
    return true;
  }

  /* ********************************************************** */
  // RECORD ( CONTAINS )? ( ( IntegerConstant TO )? IntegerConstant ( CHARACTERS )? | ( IS )? VARYING ( IN )? ( SIZE )? ( ( FROM )? IntegerConstant ( TO IntegerConstant )? CHARACTERS )? ( DEPENDING ( ON )? QualifiedDataName )? )
  public static boolean RecordContainsClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordContainsClause")) return false;
    if (!nextTokenIs(b, RECORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RECORD);
    r = r && RecordContainsClause_1(b, l + 1);
    r = r && RecordContainsClause_2(b, l + 1);
    exit_section_(b, m, RECORD_CONTAINS_CLAUSE, r);
    return r;
  }

  // ( CONTAINS )?
  private static boolean RecordContainsClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordContainsClause_1")) return false;
    consumeToken(b, CONTAINS);
    return true;
  }

  // ( IntegerConstant TO )? IntegerConstant ( CHARACTERS )? | ( IS )? VARYING ( IN )? ( SIZE )? ( ( FROM )? IntegerConstant ( TO IntegerConstant )? CHARACTERS )? ( DEPENDING ( ON )? QualifiedDataName )?
  private static boolean RecordContainsClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordContainsClause_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RecordContainsClause_2_0(b, l + 1);
    if (!r) r = RecordContainsClause_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IntegerConstant TO )? IntegerConstant ( CHARACTERS )?
  private static boolean RecordContainsClause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordContainsClause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RecordContainsClause_2_0_0(b, l + 1);
    r = r && IntegerConstant(b, l + 1);
    r = r && RecordContainsClause_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IntegerConstant TO )?
  private static boolean RecordContainsClause_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordContainsClause_2_0_0")) return false;
    RecordContainsClause_2_0_0_0(b, l + 1);
    return true;
  }

  // IntegerConstant TO
  private static boolean RecordContainsClause_2_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordContainsClause_2_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IntegerConstant(b, l + 1);
    r = r && consumeToken(b, TO);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( CHARACTERS )?
  private static boolean RecordContainsClause_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordContainsClause_2_0_2")) return false;
    consumeToken(b, CHARACTERS);
    return true;
  }

  // ( IS )? VARYING ( IN )? ( SIZE )? ( ( FROM )? IntegerConstant ( TO IntegerConstant )? CHARACTERS )? ( DEPENDING ( ON )? QualifiedDataName )?
  private static boolean RecordContainsClause_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordContainsClause_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RecordContainsClause_2_1_0(b, l + 1);
    r = r && consumeToken(b, VARYING);
    r = r && RecordContainsClause_2_1_2(b, l + 1);
    r = r && RecordContainsClause_2_1_3(b, l + 1);
    r = r && RecordContainsClause_2_1_4(b, l + 1);
    r = r && RecordContainsClause_2_1_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IS )?
  private static boolean RecordContainsClause_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordContainsClause_2_1_0")) return false;
    consumeToken(b, IS);
    return true;
  }

  // ( IN )?
  private static boolean RecordContainsClause_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordContainsClause_2_1_2")) return false;
    consumeToken(b, IN);
    return true;
  }

  // ( SIZE )?
  private static boolean RecordContainsClause_2_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordContainsClause_2_1_3")) return false;
    consumeToken(b, SIZE);
    return true;
  }

  // ( ( FROM )? IntegerConstant ( TO IntegerConstant )? CHARACTERS )?
  private static boolean RecordContainsClause_2_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordContainsClause_2_1_4")) return false;
    RecordContainsClause_2_1_4_0(b, l + 1);
    return true;
  }

  // ( FROM )? IntegerConstant ( TO IntegerConstant )? CHARACTERS
  private static boolean RecordContainsClause_2_1_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordContainsClause_2_1_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RecordContainsClause_2_1_4_0_0(b, l + 1);
    r = r && IntegerConstant(b, l + 1);
    r = r && RecordContainsClause_2_1_4_0_2(b, l + 1);
    r = r && consumeToken(b, CHARACTERS);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FROM )?
  private static boolean RecordContainsClause_2_1_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordContainsClause_2_1_4_0_0")) return false;
    consumeToken(b, FROM);
    return true;
  }

  // ( TO IntegerConstant )?
  private static boolean RecordContainsClause_2_1_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordContainsClause_2_1_4_0_2")) return false;
    RecordContainsClause_2_1_4_0_2_0(b, l + 1);
    return true;
  }

  // TO IntegerConstant
  private static boolean RecordContainsClause_2_1_4_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordContainsClause_2_1_4_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TO);
    r = r && IntegerConstant(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( DEPENDING ( ON )? QualifiedDataName )?
  private static boolean RecordContainsClause_2_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordContainsClause_2_1_5")) return false;
    RecordContainsClause_2_1_5_0(b, l + 1);
    return true;
  }

  // DEPENDING ( ON )? QualifiedDataName
  private static boolean RecordContainsClause_2_1_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordContainsClause_2_1_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEPENDING);
    r = r && RecordContainsClause_2_1_5_0_1(b, l + 1);
    r = r && QualifiedDataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ON )?
  private static boolean RecordContainsClause_2_1_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordContainsClause_2_1_5_0_1")) return false;
    consumeToken(b, ON);
    return true;
  }

  /* ********************************************************** */
  // RECORD DELIMITER ( IS )? ( STANDARD_1 | IMPLICIT | AssignmentName )
  public static boolean RecordDelimiterClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordDelimiterClause")) return false;
    if (!nextTokenIs(b, RECORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, RECORD, DELIMITER);
    r = r && RecordDelimiterClause_2(b, l + 1);
    r = r && RecordDelimiterClause_3(b, l + 1);
    exit_section_(b, m, RECORD_DELIMITER_CLAUSE, r);
    return r;
  }

  // ( IS )?
  private static boolean RecordDelimiterClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordDelimiterClause_2")) return false;
    consumeToken(b, IS);
    return true;
  }

  // STANDARD_1 | IMPLICIT | AssignmentName
  private static boolean RecordDelimiterClause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordDelimiterClause_3")) return false;
    boolean r;
    r = consumeToken(b, STANDARD_1);
    if (!r) r = consumeToken(b, IMPLICIT);
    if (!r) r = AssignmentName(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // QualifiedDataName
  public static boolean RecordName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RECORD_NAME, "<record name>");
    r = QualifiedDataName(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // RECORDING ( MODE )? ( IS )? Mode
  public static boolean RecordingModeClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordingModeClause")) return false;
    if (!nextTokenIs(b, RECORDING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RECORDING);
    r = r && RecordingModeClause_1(b, l + 1);
    r = r && RecordingModeClause_2(b, l + 1);
    r = r && Mode(b, l + 1);
    exit_section_(b, m, RECORDING_MODE_CLAUSE, r);
    return r;
  }

  // ( MODE )?
  private static boolean RecordingModeClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordingModeClause_1")) return false;
    consumeToken(b, MODE);
    return true;
  }

  // ( IS )?
  private static boolean RecordingModeClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordingModeClause_2")) return false;
    consumeToken(b, IS);
    return true;
  }

  /* ********************************************************** */
  // ArithmeticExpression ( RelationalOperator ArithmeticExpression | SignCondition )
  public static boolean RelationCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationCondition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RELATION_CONDITION, "<relation condition>");
    r = ArithmeticExpression(b, l + 1);
    r = r && RelationCondition_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RelationalOperator ArithmeticExpression | SignCondition
  private static boolean RelationCondition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationCondition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RelationCondition_1_0(b, l + 1);
    if (!r) r = SignCondition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // RelationalOperator ArithmeticExpression
  private static boolean RelationCondition_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationCondition_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RelationalOperator(b, l + 1);
    r = r && ArithmeticExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( IS )? ( ( NOT )? ( GREATER ( THAN )? | MORETHANCHAR | LESS ( THAN )? | LESSTHANCHAR | EQUAL ( TO )? | EQUALCHAR ) | GREATER ( THAN )? OR EQUAL ( TO )? | MORETHANOREQUAL | LESS ( THAN )? OR EQUAL ( TO )? | LESSTHANOREQUAL )
  public static boolean RelationalOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RELATIONAL_OPERATOR, "<relational operator>");
    r = RelationalOperator_0(b, l + 1);
    r = r && RelationalOperator_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( IS )?
  private static boolean RelationalOperator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalOperator_0")) return false;
    consumeToken(b, IS);
    return true;
  }

  // ( NOT )? ( GREATER ( THAN )? | MORETHANCHAR | LESS ( THAN )? | LESSTHANCHAR | EQUAL ( TO )? | EQUALCHAR ) | GREATER ( THAN )? OR EQUAL ( TO )? | MORETHANOREQUAL | LESS ( THAN )? OR EQUAL ( TO )? | LESSTHANOREQUAL
  private static boolean RelationalOperator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalOperator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RelationalOperator_1_0(b, l + 1);
    if (!r) r = RelationalOperator_1_1(b, l + 1);
    if (!r) r = consumeToken(b, MORETHANOREQUAL);
    if (!r) r = RelationalOperator_1_3(b, l + 1);
    if (!r) r = consumeToken(b, LESSTHANOREQUAL);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( NOT )? ( GREATER ( THAN )? | MORETHANCHAR | LESS ( THAN )? | LESSTHANCHAR | EQUAL ( TO )? | EQUALCHAR )
  private static boolean RelationalOperator_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalOperator_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RelationalOperator_1_0_0(b, l + 1);
    r = r && RelationalOperator_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( NOT )?
  private static boolean RelationalOperator_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalOperator_1_0_0")) return false;
    consumeToken(b, NOT);
    return true;
  }

  // GREATER ( THAN )? | MORETHANCHAR | LESS ( THAN )? | LESSTHANCHAR | EQUAL ( TO )? | EQUALCHAR
  private static boolean RelationalOperator_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalOperator_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RelationalOperator_1_0_1_0(b, l + 1);
    if (!r) r = consumeToken(b, MORETHANCHAR);
    if (!r) r = RelationalOperator_1_0_1_2(b, l + 1);
    if (!r) r = consumeToken(b, LESSTHANCHAR);
    if (!r) r = RelationalOperator_1_0_1_4(b, l + 1);
    if (!r) r = consumeToken(b, EQUALCHAR);
    exit_section_(b, m, null, r);
    return r;
  }

  // GREATER ( THAN )?
  private static boolean RelationalOperator_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalOperator_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GREATER);
    r = r && RelationalOperator_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( THAN )?
  private static boolean RelationalOperator_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalOperator_1_0_1_0_1")) return false;
    consumeToken(b, THAN);
    return true;
  }

  // LESS ( THAN )?
  private static boolean RelationalOperator_1_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalOperator_1_0_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LESS);
    r = r && RelationalOperator_1_0_1_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( THAN )?
  private static boolean RelationalOperator_1_0_1_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalOperator_1_0_1_2_1")) return false;
    consumeToken(b, THAN);
    return true;
  }

  // EQUAL ( TO )?
  private static boolean RelationalOperator_1_0_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalOperator_1_0_1_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUAL);
    r = r && RelationalOperator_1_0_1_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TO )?
  private static boolean RelationalOperator_1_0_1_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalOperator_1_0_1_4_1")) return false;
    consumeToken(b, TO);
    return true;
  }

  // GREATER ( THAN )? OR EQUAL ( TO )?
  private static boolean RelationalOperator_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalOperator_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GREATER);
    r = r && RelationalOperator_1_1_1(b, l + 1);
    r = r && consumeTokens(b, 0, OR, EQUAL);
    r = r && RelationalOperator_1_1_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( THAN )?
  private static boolean RelationalOperator_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalOperator_1_1_1")) return false;
    consumeToken(b, THAN);
    return true;
  }

  // ( TO )?
  private static boolean RelationalOperator_1_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalOperator_1_1_4")) return false;
    consumeToken(b, TO);
    return true;
  }

  // LESS ( THAN )? OR EQUAL ( TO )?
  private static boolean RelationalOperator_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalOperator_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LESS);
    r = r && RelationalOperator_1_3_1(b, l + 1);
    r = r && consumeTokens(b, 0, OR, EQUAL);
    r = r && RelationalOperator_1_3_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( THAN )?
  private static boolean RelationalOperator_1_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalOperator_1_3_1")) return false;
    consumeToken(b, THAN);
    return true;
  }

  // ( TO )?
  private static boolean RelationalOperator_1_3_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalOperator_1_3_4")) return false;
    consumeToken(b, TO);
    return true;
  }

  /* ********************************************************** */
  // RELATIVE ( KEY )? ( IS )? QualifiedDataName
  public static boolean RelativeKeyClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelativeKeyClause")) return false;
    if (!nextTokenIs(b, RELATIVE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RELATIVE);
    r = r && RelativeKeyClause_1(b, l + 1);
    r = r && RelativeKeyClause_2(b, l + 1);
    r = r && QualifiedDataName(b, l + 1);
    exit_section_(b, m, RELATIVE_KEY_CLAUSE, r);
    return r;
  }

  // ( KEY )?
  private static boolean RelativeKeyClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelativeKeyClause_1")) return false;
    consumeToken(b, KEY);
    return true;
  }

  // ( IS )?
  private static boolean RelativeKeyClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelativeKeyClause_2")) return false;
    consumeToken(b, IS);
    return true;
  }

  /* ********************************************************** */
  // SEQUENTIAL
  public static boolean RelativeOrganizationClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelativeOrganizationClause")) return false;
    if (!nextTokenIs(b, SEQUENTIAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEQUENTIAL);
    exit_section_(b, m, RELATIVE_ORGANIZATION_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // RELEASE RecordName ( FROM QualifiedDataName )?
  public static boolean ReleaseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReleaseStatement")) return false;
    if (!nextTokenIs(b, RELEASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RELEASE);
    r = r && RecordName(b, l + 1);
    r = r && ReleaseStatement_2(b, l + 1);
    exit_section_(b, m, RELEASE_STATEMENT, r);
    return r;
  }

  // ( FROM QualifiedDataName )?
  private static boolean ReleaseStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReleaseStatement_2")) return false;
    ReleaseStatement_2_0(b, l + 1);
    return true;
  }

  // FROM QualifiedDataName
  private static boolean ReleaseStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReleaseStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FROM);
    r = r && QualifiedDataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RENAMES QualifiedDataName ( ( THROUGH | THRU ) QualifiedDataName )?
  public static boolean RenamesClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RenamesClause")) return false;
    if (!nextTokenIs(b, RENAMES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RENAMES);
    r = r && QualifiedDataName(b, l + 1);
    r = r && RenamesClause_2(b, l + 1);
    exit_section_(b, m, RENAMES_CLAUSE, r);
    return r;
  }

  // ( ( THROUGH | THRU ) QualifiedDataName )?
  private static boolean RenamesClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RenamesClause_2")) return false;
    RenamesClause_2_0(b, l + 1);
    return true;
  }

  // ( THROUGH | THRU ) QualifiedDataName
  private static boolean RenamesClause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RenamesClause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RenamesClause_2_0_0(b, l + 1);
    r = r && QualifiedDataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // THROUGH | THRU
  private static boolean RenamesClause_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RenamesClause_2_0_0")) return false;
    boolean r;
    r = consumeToken(b, THROUGH);
    if (!r) r = consumeToken(b, THRU);
    return r;
  }

  /* ********************************************************** */
  // REPLACING ( CHARACTERS BY ( Identifier | Literal ) ( BeforeAfterPhrase )* | ( ALL | LEADING | FIRST ) ( ( Identifier | Literal ) BY ( Identifier | Literal ) ( BeforeAfterPhrase )* )+ )+
  public static boolean ReplacingPhrase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplacingPhrase")) return false;
    if (!nextTokenIs(b, REPLACING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REPLACING);
    r = r && ReplacingPhrase_1(b, l + 1);
    exit_section_(b, m, REPLACING_PHRASE, r);
    return r;
  }

  // ( CHARACTERS BY ( Identifier | Literal ) ( BeforeAfterPhrase )* | ( ALL | LEADING | FIRST ) ( ( Identifier | Literal ) BY ( Identifier | Literal ) ( BeforeAfterPhrase )* )+ )+
  private static boolean ReplacingPhrase_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplacingPhrase_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ReplacingPhrase_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ReplacingPhrase_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ReplacingPhrase_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // CHARACTERS BY ( Identifier | Literal ) ( BeforeAfterPhrase )* | ( ALL | LEADING | FIRST ) ( ( Identifier | Literal ) BY ( Identifier | Literal ) ( BeforeAfterPhrase )* )+
  private static boolean ReplacingPhrase_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplacingPhrase_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ReplacingPhrase_1_0_0(b, l + 1);
    if (!r) r = ReplacingPhrase_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CHARACTERS BY ( Identifier | Literal ) ( BeforeAfterPhrase )*
  private static boolean ReplacingPhrase_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplacingPhrase_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CHARACTERS, BY);
    r = r && ReplacingPhrase_1_0_0_2(b, l + 1);
    r = r && ReplacingPhrase_1_0_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier | Literal
  private static boolean ReplacingPhrase_1_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplacingPhrase_1_0_0_2")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  // ( BeforeAfterPhrase )*
  private static boolean ReplacingPhrase_1_0_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplacingPhrase_1_0_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ReplacingPhrase_1_0_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ReplacingPhrase_1_0_0_3", c)) break;
    }
    return true;
  }

  // ( BeforeAfterPhrase )
  private static boolean ReplacingPhrase_1_0_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplacingPhrase_1_0_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BeforeAfterPhrase(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ALL | LEADING | FIRST ) ( ( Identifier | Literal ) BY ( Identifier | Literal ) ( BeforeAfterPhrase )* )+
  private static boolean ReplacingPhrase_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplacingPhrase_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ReplacingPhrase_1_0_1_0(b, l + 1);
    r = r && ReplacingPhrase_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ALL | LEADING | FIRST
  private static boolean ReplacingPhrase_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplacingPhrase_1_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, ALL);
    if (!r) r = consumeToken(b, LEADING);
    if (!r) r = consumeToken(b, FIRST);
    return r;
  }

  // ( ( Identifier | Literal ) BY ( Identifier | Literal ) ( BeforeAfterPhrase )* )+
  private static boolean ReplacingPhrase_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplacingPhrase_1_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ReplacingPhrase_1_0_1_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ReplacingPhrase_1_0_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ReplacingPhrase_1_0_1_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Identifier | Literal ) BY ( Identifier | Literal ) ( BeforeAfterPhrase )*
  private static boolean ReplacingPhrase_1_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplacingPhrase_1_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ReplacingPhrase_1_0_1_1_0_0(b, l + 1);
    r = r && consumeToken(b, BY);
    r = r && ReplacingPhrase_1_0_1_1_0_2(b, l + 1);
    r = r && ReplacingPhrase_1_0_1_1_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier | Literal
  private static boolean ReplacingPhrase_1_0_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplacingPhrase_1_0_1_1_0_0")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  // Identifier | Literal
  private static boolean ReplacingPhrase_1_0_1_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplacingPhrase_1_0_1_1_0_2")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  // ( BeforeAfterPhrase )*
  private static boolean ReplacingPhrase_1_0_1_1_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplacingPhrase_1_0_1_1_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ReplacingPhrase_1_0_1_1_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ReplacingPhrase_1_0_1_1_0_3", c)) break;
    }
    return true;
  }

  // ( BeforeAfterPhrase )
  private static boolean ReplacingPhrase_1_0_1_1_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplacingPhrase_1_0_1_1_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BeforeAfterPhrase(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( REPORT ( IS )? | REPORTS ( ARE )? ) ( QualifiedDataName )+
  public static boolean ReportClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReportClause")) return false;
    if (!nextTokenIs(b, "<report clause>", REPORT, REPORTS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REPORT_CLAUSE, "<report clause>");
    r = ReportClause_0(b, l + 1);
    r = r && ReportClause_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // REPORT ( IS )? | REPORTS ( ARE )?
  private static boolean ReportClause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReportClause_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ReportClause_0_0(b, l + 1);
    if (!r) r = ReportClause_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // REPORT ( IS )?
  private static boolean ReportClause_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReportClause_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REPORT);
    r = r && ReportClause_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IS )?
  private static boolean ReportClause_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReportClause_0_0_1")) return false;
    consumeToken(b, IS);
    return true;
  }

  // REPORTS ( ARE )?
  private static boolean ReportClause_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReportClause_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REPORTS);
    r = r && ReportClause_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ARE )?
  private static boolean ReportClause_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReportClause_0_1_1")) return false;
    consumeToken(b, ARE);
    return true;
  }

  // ( QualifiedDataName )+
  private static boolean ReportClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReportClause_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ReportClause_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ReportClause_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ReportClause_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( QualifiedDataName )
  private static boolean ReportClause_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReportClause_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedDataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IntegerConstant RECORDS
  // |	( END )? ( OF )? ( REEL | UNIT ) OF FileName
  public static boolean Rerun2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rerun2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RERUN_2, "<rerun 2>");
    r = Rerun2_0(b, l + 1);
    if (!r) r = Rerun2_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IntegerConstant RECORDS
  private static boolean Rerun2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rerun2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IntegerConstant(b, l + 1);
    r = r && consumeToken(b, RECORDS);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( END )? ( OF )? ( REEL | UNIT ) OF FileName
  private static boolean Rerun2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rerun2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Rerun2_1_0(b, l + 1);
    r = r && Rerun2_1_1(b, l + 1);
    r = r && Rerun2_1_2(b, l + 1);
    r = r && consumeToken(b, OF);
    r = r && FileName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( END )?
  private static boolean Rerun2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rerun2_1_0")) return false;
    consumeToken(b, END);
    return true;
  }

  // ( OF )?
  private static boolean Rerun2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rerun2_1_1")) return false;
    consumeToken(b, OF);
    return true;
  }

  // REEL | UNIT
  private static boolean Rerun2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rerun2_1_2")) return false;
    boolean r;
    r = consumeToken(b, REEL);
    if (!r) r = consumeToken(b, UNIT);
    return r;
  }

  /* ********************************************************** */
  // RERUN ( ON ( AssignmentName | FileName ) )? EVERY ( Rerun2 | IntegerConstant ( CLOCK_UNITS )? )
  public static boolean RerunClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RerunClause")) return false;
    if (!nextTokenIs(b, RERUN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RERUN);
    r = r && RerunClause_1(b, l + 1);
    r = r && consumeToken(b, EVERY);
    r = r && RerunClause_3(b, l + 1);
    exit_section_(b, m, RERUN_CLAUSE, r);
    return r;
  }

  // ( ON ( AssignmentName | FileName ) )?
  private static boolean RerunClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RerunClause_1")) return false;
    RerunClause_1_0(b, l + 1);
    return true;
  }

  // ON ( AssignmentName | FileName )
  private static boolean RerunClause_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RerunClause_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ON);
    r = r && RerunClause_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AssignmentName | FileName
  private static boolean RerunClause_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RerunClause_1_0_1")) return false;
    boolean r;
    r = AssignmentName(b, l + 1);
    if (!r) r = FileName(b, l + 1);
    return r;
  }

  // Rerun2 | IntegerConstant ( CLOCK_UNITS )?
  private static boolean RerunClause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RerunClause_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Rerun2(b, l + 1);
    if (!r) r = RerunClause_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IntegerConstant ( CLOCK_UNITS )?
  private static boolean RerunClause_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RerunClause_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IntegerConstant(b, l + 1);
    r = r && RerunClause_3_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( CLOCK_UNITS )?
  private static boolean RerunClause_3_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RerunClause_3_1_1")) return false;
    consumeToken(b, CLOCK_UNITS);
    return true;
  }

  /* ********************************************************** */
  // RESERVE IntegerConstant ( AREA | AREAS )
  public static boolean ReserveClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReserveClause")) return false;
    if (!nextTokenIs(b, RESERVE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RESERVE);
    r = r && IntegerConstant(b, l + 1);
    r = r && ReserveClause_2(b, l + 1);
    exit_section_(b, m, RESERVE_CLAUSE, r);
    return r;
  }

  // AREA | AREAS
  private static boolean ReserveClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReserveClause_2")) return false;
    boolean r;
    r = consumeToken(b, AREA);
    if (!r) r = consumeToken(b, AREAS);
    return r;
  }

  /* ********************************************************** */
  // RETURN FileName ( RECORD )? ( INTO QualifiedDataName )? ( AT )? END StatementList ( NOT ( AT )? END StatementList )? ( END_RETURN )?
  public static boolean ReturnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && FileName(b, l + 1);
    r = r && ReturnStatement_2(b, l + 1);
    r = r && ReturnStatement_3(b, l + 1);
    r = r && ReturnStatement_4(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && StatementList(b, l + 1);
    r = r && ReturnStatement_7(b, l + 1);
    r = r && ReturnStatement_8(b, l + 1);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  // ( RECORD )?
  private static boolean ReturnStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_2")) return false;
    consumeToken(b, RECORD);
    return true;
  }

  // ( INTO QualifiedDataName )?
  private static boolean ReturnStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_3")) return false;
    ReturnStatement_3_0(b, l + 1);
    return true;
  }

  // INTO QualifiedDataName
  private static boolean ReturnStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTO);
    r = r && QualifiedDataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( AT )?
  private static boolean ReturnStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_4")) return false;
    consumeToken(b, AT);
    return true;
  }

  // ( NOT ( AT )? END StatementList )?
  private static boolean ReturnStatement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_7")) return false;
    ReturnStatement_7_0(b, l + 1);
    return true;
  }

  // NOT ( AT )? END StatementList
  private static boolean ReturnStatement_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && ReturnStatement_7_0_1(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( AT )?
  private static boolean ReturnStatement_7_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_7_0_1")) return false;
    consumeToken(b, AT);
    return true;
  }

  // ( END_RETURN )?
  private static boolean ReturnStatement_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_8")) return false;
    consumeToken(b, END_RETURN);
    return true;
  }

  /* ********************************************************** */
  // REWRITE RecordName ( FROM QualifiedDataName )? ( INVALID ( KEY )? StatementList )? ( NOT INVALID ( KEY )? StatementList )? ( END_REWRITE )?
  public static boolean RewriteStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RewriteStatement")) return false;
    if (!nextTokenIs(b, REWRITE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REWRITE);
    r = r && RecordName(b, l + 1);
    r = r && RewriteStatement_2(b, l + 1);
    r = r && RewriteStatement_3(b, l + 1);
    r = r && RewriteStatement_4(b, l + 1);
    r = r && RewriteStatement_5(b, l + 1);
    exit_section_(b, m, REWRITE_STATEMENT, r);
    return r;
  }

  // ( FROM QualifiedDataName )?
  private static boolean RewriteStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RewriteStatement_2")) return false;
    RewriteStatement_2_0(b, l + 1);
    return true;
  }

  // FROM QualifiedDataName
  private static boolean RewriteStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RewriteStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FROM);
    r = r && QualifiedDataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( INVALID ( KEY )? StatementList )?
  private static boolean RewriteStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RewriteStatement_3")) return false;
    RewriteStatement_3_0(b, l + 1);
    return true;
  }

  // INVALID ( KEY )? StatementList
  private static boolean RewriteStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RewriteStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INVALID);
    r = r && RewriteStatement_3_0_1(b, l + 1);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( KEY )?
  private static boolean RewriteStatement_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RewriteStatement_3_0_1")) return false;
    consumeToken(b, KEY);
    return true;
  }

  // ( NOT INVALID ( KEY )? StatementList )?
  private static boolean RewriteStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RewriteStatement_4")) return false;
    RewriteStatement_4_0(b, l + 1);
    return true;
  }

  // NOT INVALID ( KEY )? StatementList
  private static boolean RewriteStatement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RewriteStatement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NOT, INVALID);
    r = r && RewriteStatement_4_0_2(b, l + 1);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( KEY )?
  private static boolean RewriteStatement_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RewriteStatement_4_0_2")) return false;
    consumeToken(b, KEY);
    return true;
  }

  // ( END_REWRITE )?
  private static boolean RewriteStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RewriteStatement_5")) return false;
    consumeToken(b, END_REWRITE);
    return true;
  }

  /* ********************************************************** */
  // CobolWord
  public static boolean RoutineName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RoutineName")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CobolWord(b, l + 1);
    exit_section_(b, m, ROUTINE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // SAME ( RECORD | SORT | SORT_MERGE ) ( AREA )? ( FOR )? ( FileName )+
  public static boolean SameAreaClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SameAreaClause")) return false;
    if (!nextTokenIs(b, SAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SAME);
    r = r && SameAreaClause_1(b, l + 1);
    r = r && SameAreaClause_2(b, l + 1);
    r = r && SameAreaClause_3(b, l + 1);
    r = r && SameAreaClause_4(b, l + 1);
    exit_section_(b, m, SAME_AREA_CLAUSE, r);
    return r;
  }

  // RECORD | SORT | SORT_MERGE
  private static boolean SameAreaClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SameAreaClause_1")) return false;
    boolean r;
    r = consumeToken(b, RECORD);
    if (!r) r = consumeToken(b, SORT);
    if (!r) r = consumeToken(b, SORT_MERGE);
    return r;
  }

  // ( AREA )?
  private static boolean SameAreaClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SameAreaClause_2")) return false;
    consumeToken(b, AREA);
    return true;
  }

  // ( FOR )?
  private static boolean SameAreaClause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SameAreaClause_3")) return false;
    consumeToken(b, FOR);
    return true;
  }

  // ( FileName )+
  private static boolean SameAreaClause_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SameAreaClause_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SameAreaClause_4_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!SameAreaClause_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SameAreaClause_4", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FileName )
  private static boolean SameAreaClause_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SameAreaClause_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FileName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SEARCH ( ALL )? QualifiedDataName ( VARYING QualifiedDataName )? ( ( AT )? END StatementList )? ( WHEN Condition ( StatementList | NEXT SENTENCE ) )+ ( END_SEARCH )?
  public static boolean SearchStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SearchStatement")) return false;
    if (!nextTokenIs(b, SEARCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEARCH);
    r = r && SearchStatement_1(b, l + 1);
    r = r && QualifiedDataName(b, l + 1);
    r = r && SearchStatement_3(b, l + 1);
    r = r && SearchStatement_4(b, l + 1);
    r = r && SearchStatement_5(b, l + 1);
    r = r && SearchStatement_6(b, l + 1);
    exit_section_(b, m, SEARCH_STATEMENT, r);
    return r;
  }

  // ( ALL )?
  private static boolean SearchStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SearchStatement_1")) return false;
    consumeToken(b, ALL);
    return true;
  }

  // ( VARYING QualifiedDataName )?
  private static boolean SearchStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SearchStatement_3")) return false;
    SearchStatement_3_0(b, l + 1);
    return true;
  }

  // VARYING QualifiedDataName
  private static boolean SearchStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SearchStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VARYING);
    r = r && QualifiedDataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( AT )? END StatementList )?
  private static boolean SearchStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SearchStatement_4")) return false;
    SearchStatement_4_0(b, l + 1);
    return true;
  }

  // ( AT )? END StatementList
  private static boolean SearchStatement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SearchStatement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SearchStatement_4_0_0(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( AT )?
  private static boolean SearchStatement_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SearchStatement_4_0_0")) return false;
    consumeToken(b, AT);
    return true;
  }

  // ( WHEN Condition ( StatementList | NEXT SENTENCE ) )+
  private static boolean SearchStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SearchStatement_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SearchStatement_5_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!SearchStatement_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SearchStatement_5", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // WHEN Condition ( StatementList | NEXT SENTENCE )
  private static boolean SearchStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SearchStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && Condition(b, l + 1);
    r = r && SearchStatement_5_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // StatementList | NEXT SENTENCE
  private static boolean SearchStatement_5_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SearchStatement_5_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StatementList(b, l + 1);
    if (!r) r = parseTokens(b, 0, NEXT, SENTENCE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( END_SEARCH )?
  private static boolean SearchStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SearchStatement_6")) return false;
    consumeToken(b, END_SEARCH);
    return true;
  }

  /* ********************************************************** */
  // SectionName SECTION ( IntegerConstant )?
  public static boolean SectionHeader(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SectionHeader")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SectionName(b, l + 1);
    r = r && consumeToken(b, SECTION);
    r = r && SectionHeader_2(b, l + 1);
    exit_section_(b, m, SECTION_HEADER, r);
    return r;
  }

  // ( IntegerConstant )?
  private static boolean SectionHeader_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SectionHeader_2")) return false;
    SectionHeader_2_0(b, l + 1);
    return true;
  }

  // ( IntegerConstant )
  private static boolean SectionHeader_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SectionHeader_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IntegerConstant(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CobolWord
  public static boolean SectionName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SectionName")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CobolWord(b, l + 1);
    exit_section_(b, m, SECTION_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // SECURITY DOT ( CommentLine )?
  public static boolean SecurityParagraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SecurityParagraph")) return false;
    if (!nextTokenIs(b, SECURITY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SECURITY, DOT);
    r = r && SecurityParagraph_2(b, l + 1);
    exit_section_(b, m, SECURITY_PARAGRAPH, r);
    return r;
  }

  // ( CommentLine )?
  private static boolean SecurityParagraph_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SecurityParagraph_2")) return false;
    SecurityParagraph_2_0(b, l + 1);
    return true;
  }

  // ( CommentLine )
  private static boolean SecurityParagraph_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SecurityParagraph_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CommentLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SEGMENT LIMIT ( IS )? IntegerConstant
  public static boolean SegmentLimitClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SegmentLimitClause")) return false;
    if (!nextTokenIs(b, SEGMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SEGMENT, LIMIT);
    r = r && SegmentLimitClause_2(b, l + 1);
    r = r && IntegerConstant(b, l + 1);
    exit_section_(b, m, SEGMENT_LIMIT_CLAUSE, r);
    return r;
  }

  // ( IS )?
  private static boolean SegmentLimitClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SegmentLimitClause_2")) return false;
    consumeToken(b, IS);
    return true;
  }

  /* ********************************************************** */
  // SELECT ( OPTIONAL )? FileName
  public static boolean SelectClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectClause")) return false;
    if (!nextTokenIs(b, SELECT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SELECT);
    r = r && SelectClause_1(b, l + 1);
    r = r && FileName(b, l + 1);
    exit_section_(b, m, SELECT_CLAUSE, r);
    return r;
  }

  // ( OPTIONAL )?
  private static boolean SelectClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectClause_1")) return false;
    consumeToken(b, OPTIONAL);
    return true;
  }

  /* ********************************************************** */
  // StatementList DOT
  public static boolean Sentence(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Sentence")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SENTENCE, "<sentence>");
    r = StatementList(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SEQUENTIAL ( RelativeKeyClause )?
  public static boolean SequentialAccessMode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SequentialAccessMode")) return false;
    if (!nextTokenIs(b, SEQUENTIAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEQUENTIAL);
    r = r && SequentialAccessMode_1(b, l + 1);
    exit_section_(b, m, SEQUENTIAL_ACCESS_MODE, r);
    return r;
  }

  // ( RelativeKeyClause )?
  private static boolean SequentialAccessMode_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SequentialAccessMode_1")) return false;
    SequentialAccessMode_1_0(b, l + 1);
    return true;
  }

  // ( RelativeKeyClause )
  private static boolean SequentialAccessMode_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SequentialAccessMode_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RelativeKeyClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SEQUENTIAL
  public static boolean SequentialOrganizationClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SequentialOrganizationClause")) return false;
    if (!nextTokenIs(b, SEQUENTIAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEQUENTIAL);
    exit_section_(b, m, SEQUENTIAL_ORGANIZATION_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // SET QualifiedDataName ( TO ( Identifier | TRUE | FALSE | ON | OFF | Literal ) | ( UP | DOWN ) ( BY )? ( Identifier | Literal ) )
  public static boolean SetStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetStatement")) return false;
    if (!nextTokenIs(b, SET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SET);
    r = r && QualifiedDataName(b, l + 1);
    r = r && SetStatement_2(b, l + 1);
    exit_section_(b, m, SET_STATEMENT, r);
    return r;
  }

  // TO ( Identifier | TRUE | FALSE | ON | OFF | Literal ) | ( UP | DOWN ) ( BY )? ( Identifier | Literal )
  private static boolean SetStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SetStatement_2_0(b, l + 1);
    if (!r) r = SetStatement_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TO ( Identifier | TRUE | FALSE | ON | OFF | Literal )
  private static boolean SetStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TO);
    r = r && SetStatement_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier | TRUE | FALSE | ON | OFF | Literal
  private static boolean SetStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetStatement_2_0_1")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, ON);
    if (!r) r = consumeToken(b, OFF);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  // ( UP | DOWN ) ( BY )? ( Identifier | Literal )
  private static boolean SetStatement_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetStatement_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SetStatement_2_1_0(b, l + 1);
    r = r && SetStatement_2_1_1(b, l + 1);
    r = r && SetStatement_2_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // UP | DOWN
  private static boolean SetStatement_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetStatement_2_1_0")) return false;
    boolean r;
    r = consumeToken(b, UP);
    if (!r) r = consumeToken(b, DOWN);
    return r;
  }

  // ( BY )?
  private static boolean SetStatement_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetStatement_2_1_1")) return false;
    consumeToken(b, BY);
    return true;
  }

  // Identifier | Literal
  private static boolean SetStatement_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetStatement_2_1_2")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ( IS )? ( NOT )? ( POSITIVE | NEGATIVE | ZERO )
  public static boolean SignCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SignCondition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGN_CONDITION, "<sign condition>");
    r = SignCondition_0(b, l + 1);
    r = r && SignCondition_1(b, l + 1);
    r = r && SignCondition_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( IS )?
  private static boolean SignCondition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SignCondition_0")) return false;
    consumeToken(b, IS);
    return true;
  }

  // ( NOT )?
  private static boolean SignCondition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SignCondition_1")) return false;
    consumeToken(b, NOT);
    return true;
  }

  // POSITIVE | NEGATIVE | ZERO
  private static boolean SignCondition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SignCondition_2")) return false;
    boolean r;
    r = consumeToken(b, POSITIVE);
    if (!r) r = consumeToken(b, NEGATIVE);
    if (!r) r = consumeToken(b, ZERO);
    return r;
  }

  /* ********************************************************** */
  // LPARENCHAR Condition RPARENCHAR | RelationCondition | ClassCondition | ConditionNameCondition
  public static boolean SimpleCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleCondition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_CONDITION, "<simple condition>");
    r = SimpleCondition_0(b, l + 1);
    if (!r) r = RelationCondition(b, l + 1);
    if (!r) r = ClassCondition(b, l + 1);
    if (!r) r = ConditionNameCondition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LPARENCHAR Condition RPARENCHAR
  private static boolean SimpleCondition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleCondition_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPARENCHAR);
    r = r && Condition(b, l + 1);
    r = r && consumeToken(b, RPARENCHAR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SORT FileName ( ( ON )? ( ASCENDING | DESCENDING ) ( KEY )? ( QualifiedDataName )+ )+ ( ( WITH )? DUPLICATES ( IN )? ( ORDER )? )? ( ( COLLATING )? SEQUENCE ( IS )? AlphabetName )? ( USING ( FileName )+ | INPUT PROCEDURE ( IS )? ProcedureName ( ( THROUGH | THRU ) ProcedureName )? ) ( GIVING ( FileName )+ | OUTPUT PROCEDURE ( IS )? ProcedureName ( ( THROUGH | THRU ) ProcedureName )? )
  public static boolean SortStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement")) return false;
    if (!nextTokenIs(b, SORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SORT);
    r = r && FileName(b, l + 1);
    r = r && SortStatement_2(b, l + 1);
    r = r && SortStatement_3(b, l + 1);
    r = r && SortStatement_4(b, l + 1);
    r = r && SortStatement_5(b, l + 1);
    r = r && SortStatement_6(b, l + 1);
    exit_section_(b, m, SORT_STATEMENT, r);
    return r;
  }

  // ( ( ON )? ( ASCENDING | DESCENDING ) ( KEY )? ( QualifiedDataName )+ )+
  private static boolean SortStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SortStatement_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!SortStatement_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SortStatement_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ON )? ( ASCENDING | DESCENDING ) ( KEY )? ( QualifiedDataName )+
  private static boolean SortStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SortStatement_2_0_0(b, l + 1);
    r = r && SortStatement_2_0_1(b, l + 1);
    r = r && SortStatement_2_0_2(b, l + 1);
    r = r && SortStatement_2_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ON )?
  private static boolean SortStatement_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_2_0_0")) return false;
    consumeToken(b, ON);
    return true;
  }

  // ASCENDING | DESCENDING
  private static boolean SortStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_2_0_1")) return false;
    boolean r;
    r = consumeToken(b, ASCENDING);
    if (!r) r = consumeToken(b, DESCENDING);
    return r;
  }

  // ( KEY )?
  private static boolean SortStatement_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_2_0_2")) return false;
    consumeToken(b, KEY);
    return true;
  }

  // ( QualifiedDataName )+
  private static boolean SortStatement_2_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_2_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SortStatement_2_0_3_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!SortStatement_2_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SortStatement_2_0_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( QualifiedDataName )
  private static boolean SortStatement_2_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_2_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedDataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( WITH )? DUPLICATES ( IN )? ( ORDER )? )?
  private static boolean SortStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_3")) return false;
    SortStatement_3_0(b, l + 1);
    return true;
  }

  // ( WITH )? DUPLICATES ( IN )? ( ORDER )?
  private static boolean SortStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SortStatement_3_0_0(b, l + 1);
    r = r && consumeToken(b, DUPLICATES);
    r = r && SortStatement_3_0_2(b, l + 1);
    r = r && SortStatement_3_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WITH )?
  private static boolean SortStatement_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_3_0_0")) return false;
    consumeToken(b, WITH);
    return true;
  }

  // ( IN )?
  private static boolean SortStatement_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_3_0_2")) return false;
    consumeToken(b, IN);
    return true;
  }

  // ( ORDER )?
  private static boolean SortStatement_3_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_3_0_3")) return false;
    consumeToken(b, ORDER);
    return true;
  }

  // ( ( COLLATING )? SEQUENCE ( IS )? AlphabetName )?
  private static boolean SortStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_4")) return false;
    SortStatement_4_0(b, l + 1);
    return true;
  }

  // ( COLLATING )? SEQUENCE ( IS )? AlphabetName
  private static boolean SortStatement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SortStatement_4_0_0(b, l + 1);
    r = r && consumeToken(b, SEQUENCE);
    r = r && SortStatement_4_0_2(b, l + 1);
    r = r && AlphabetName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( COLLATING )?
  private static boolean SortStatement_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_4_0_0")) return false;
    consumeToken(b, COLLATING);
    return true;
  }

  // ( IS )?
  private static boolean SortStatement_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_4_0_2")) return false;
    consumeToken(b, IS);
    return true;
  }

  // USING ( FileName )+ | INPUT PROCEDURE ( IS )? ProcedureName ( ( THROUGH | THRU ) ProcedureName )?
  private static boolean SortStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SortStatement_5_0(b, l + 1);
    if (!r) r = SortStatement_5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // USING ( FileName )+
  private static boolean SortStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USING);
    r = r && SortStatement_5_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FileName )+
  private static boolean SortStatement_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_5_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SortStatement_5_0_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!SortStatement_5_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SortStatement_5_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FileName )
  private static boolean SortStatement_5_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_5_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FileName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INPUT PROCEDURE ( IS )? ProcedureName ( ( THROUGH | THRU ) ProcedureName )?
  private static boolean SortStatement_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_5_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INPUT, PROCEDURE);
    r = r && SortStatement_5_1_2(b, l + 1);
    r = r && ProcedureName(b, l + 1);
    r = r && SortStatement_5_1_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IS )?
  private static boolean SortStatement_5_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_5_1_2")) return false;
    consumeToken(b, IS);
    return true;
  }

  // ( ( THROUGH | THRU ) ProcedureName )?
  private static boolean SortStatement_5_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_5_1_4")) return false;
    SortStatement_5_1_4_0(b, l + 1);
    return true;
  }

  // ( THROUGH | THRU ) ProcedureName
  private static boolean SortStatement_5_1_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_5_1_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SortStatement_5_1_4_0_0(b, l + 1);
    r = r && ProcedureName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // THROUGH | THRU
  private static boolean SortStatement_5_1_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_5_1_4_0_0")) return false;
    boolean r;
    r = consumeToken(b, THROUGH);
    if (!r) r = consumeToken(b, THRU);
    return r;
  }

  // GIVING ( FileName )+ | OUTPUT PROCEDURE ( IS )? ProcedureName ( ( THROUGH | THRU ) ProcedureName )?
  private static boolean SortStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SortStatement_6_0(b, l + 1);
    if (!r) r = SortStatement_6_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // GIVING ( FileName )+
  private static boolean SortStatement_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GIVING);
    r = r && SortStatement_6_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FileName )+
  private static boolean SortStatement_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_6_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SortStatement_6_0_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!SortStatement_6_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SortStatement_6_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FileName )
  private static boolean SortStatement_6_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_6_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FileName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OUTPUT PROCEDURE ( IS )? ProcedureName ( ( THROUGH | THRU ) ProcedureName )?
  private static boolean SortStatement_6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_6_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OUTPUT, PROCEDURE);
    r = r && SortStatement_6_1_2(b, l + 1);
    r = r && ProcedureName(b, l + 1);
    r = r && SortStatement_6_1_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IS )?
  private static boolean SortStatement_6_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_6_1_2")) return false;
    consumeToken(b, IS);
    return true;
  }

  // ( ( THROUGH | THRU ) ProcedureName )?
  private static boolean SortStatement_6_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_6_1_4")) return false;
    SortStatement_6_1_4_0(b, l + 1);
    return true;
  }

  // ( THROUGH | THRU ) ProcedureName
  private static boolean SortStatement_6_1_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_6_1_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SortStatement_6_1_4_0_0(b, l + 1);
    r = r && ProcedureName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // THROUGH | THRU
  private static boolean SortStatement_6_1_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortStatement_6_1_4_0_0")) return false;
    boolean r;
    r = consumeToken(b, THROUGH);
    if (!r) r = consumeToken(b, THRU);
    return r;
  }

  /* ********************************************************** */
  // SOURCE_COMPUTER DOT ComputerName ( ( WITH )? DEBUGGING MODE )? DOT
  public static boolean SourceComputerParagraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SourceComputerParagraph")) return false;
    if (!nextTokenIs(b, SOURCE_COMPUTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SOURCE_COMPUTER, DOT);
    r = r && ComputerName(b, l + 1);
    r = r && SourceComputerParagraph_3(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, SOURCE_COMPUTER_PARAGRAPH, r);
    return r;
  }

  // ( ( WITH )? DEBUGGING MODE )?
  private static boolean SourceComputerParagraph_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SourceComputerParagraph_3")) return false;
    SourceComputerParagraph_3_0(b, l + 1);
    return true;
  }

  // ( WITH )? DEBUGGING MODE
  private static boolean SourceComputerParagraph_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SourceComputerParagraph_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SourceComputerParagraph_3_0_0(b, l + 1);
    r = r && consumeTokens(b, 0, DEBUGGING, MODE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WITH )?
  private static boolean SourceComputerParagraph_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SourceComputerParagraph_3_0_0")) return false;
    consumeToken(b, WITH);
    return true;
  }

  /* ********************************************************** */
  // AlphabetClause
  // |	ClassClause
  // |	CurrencySignClause
  // |	DecimalPointClause
  // |	SymbolicCharactersClause
  // |	EnvironmentNameIsMnemonicNameClause
  public static boolean SpecialNameClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialNameClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SPECIAL_NAME_CLAUSE, "<special name clause>");
    r = AlphabetClause(b, l + 1);
    if (!r) r = ClassClause(b, l + 1);
    if (!r) r = CurrencySignClause(b, l + 1);
    if (!r) r = DecimalPointClause(b, l + 1);
    if (!r) r = SymbolicCharactersClause(b, l + 1);
    if (!r) r = EnvironmentNameIsMnemonicNameClause(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SPECIAL_NAMES DOT ( SpecialNameClause ( SpecialNameClause )* DOT )?
  public static boolean SpecialNamesParagraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialNamesParagraph")) return false;
    if (!nextTokenIs(b, SPECIAL_NAMES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SPECIAL_NAMES, DOT);
    r = r && SpecialNamesParagraph_2(b, l + 1);
    exit_section_(b, m, SPECIAL_NAMES_PARAGRAPH, r);
    return r;
  }

  // ( SpecialNameClause ( SpecialNameClause )* DOT )?
  private static boolean SpecialNamesParagraph_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialNamesParagraph_2")) return false;
    SpecialNamesParagraph_2_0(b, l + 1);
    return true;
  }

  // SpecialNameClause ( SpecialNameClause )* DOT
  private static boolean SpecialNamesParagraph_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialNamesParagraph_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SpecialNameClause(b, l + 1);
    r = r && SpecialNamesParagraph_2_0_1(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( SpecialNameClause )*
  private static boolean SpecialNamesParagraph_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialNamesParagraph_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SpecialNamesParagraph_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SpecialNamesParagraph_2_0_1", c)) break;
    }
    return true;
  }

  // ( SpecialNameClause )
  private static boolean SpecialNamesParagraph_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialNamesParagraph_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SpecialNameClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ON ( STATUS )? ( IS )? Condition ( OFF ( STATUS )? ( IS )? Condition )? | OFF ( STATUS )? ( IS )? Condition ( ON ( STATUS )? ( IS )? Condition )?
  public static boolean SpecialNamesParagraphStatusPhrase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialNamesParagraphStatusPhrase")) return false;
    if (!nextTokenIs(b, "<special names paragraph status phrase>", OFF, ON)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SPECIAL_NAMES_PARAGRAPH_STATUS_PHRASE, "<special names paragraph status phrase>");
    r = SpecialNamesParagraphStatusPhrase_0(b, l + 1);
    if (!r) r = SpecialNamesParagraphStatusPhrase_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ON ( STATUS )? ( IS )? Condition ( OFF ( STATUS )? ( IS )? Condition )?
  private static boolean SpecialNamesParagraphStatusPhrase_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialNamesParagraphStatusPhrase_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ON);
    r = r && SpecialNamesParagraphStatusPhrase_0_1(b, l + 1);
    r = r && SpecialNamesParagraphStatusPhrase_0_2(b, l + 1);
    r = r && Condition(b, l + 1);
    r = r && SpecialNamesParagraphStatusPhrase_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( STATUS )?
  private static boolean SpecialNamesParagraphStatusPhrase_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialNamesParagraphStatusPhrase_0_1")) return false;
    consumeToken(b, STATUS);
    return true;
  }

  // ( IS )?
  private static boolean SpecialNamesParagraphStatusPhrase_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialNamesParagraphStatusPhrase_0_2")) return false;
    consumeToken(b, IS);
    return true;
  }

  // ( OFF ( STATUS )? ( IS )? Condition )?
  private static boolean SpecialNamesParagraphStatusPhrase_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialNamesParagraphStatusPhrase_0_4")) return false;
    SpecialNamesParagraphStatusPhrase_0_4_0(b, l + 1);
    return true;
  }

  // OFF ( STATUS )? ( IS )? Condition
  private static boolean SpecialNamesParagraphStatusPhrase_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialNamesParagraphStatusPhrase_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OFF);
    r = r && SpecialNamesParagraphStatusPhrase_0_4_0_1(b, l + 1);
    r = r && SpecialNamesParagraphStatusPhrase_0_4_0_2(b, l + 1);
    r = r && Condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( STATUS )?
  private static boolean SpecialNamesParagraphStatusPhrase_0_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialNamesParagraphStatusPhrase_0_4_0_1")) return false;
    consumeToken(b, STATUS);
    return true;
  }

  // ( IS )?
  private static boolean SpecialNamesParagraphStatusPhrase_0_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialNamesParagraphStatusPhrase_0_4_0_2")) return false;
    consumeToken(b, IS);
    return true;
  }

  // OFF ( STATUS )? ( IS )? Condition ( ON ( STATUS )? ( IS )? Condition )?
  private static boolean SpecialNamesParagraphStatusPhrase_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialNamesParagraphStatusPhrase_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OFF);
    r = r && SpecialNamesParagraphStatusPhrase_1_1(b, l + 1);
    r = r && SpecialNamesParagraphStatusPhrase_1_2(b, l + 1);
    r = r && Condition(b, l + 1);
    r = r && SpecialNamesParagraphStatusPhrase_1_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( STATUS )?
  private static boolean SpecialNamesParagraphStatusPhrase_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialNamesParagraphStatusPhrase_1_1")) return false;
    consumeToken(b, STATUS);
    return true;
  }

  // ( IS )?
  private static boolean SpecialNamesParagraphStatusPhrase_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialNamesParagraphStatusPhrase_1_2")) return false;
    consumeToken(b, IS);
    return true;
  }

  // ( ON ( STATUS )? ( IS )? Condition )?
  private static boolean SpecialNamesParagraphStatusPhrase_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialNamesParagraphStatusPhrase_1_4")) return false;
    SpecialNamesParagraphStatusPhrase_1_4_0(b, l + 1);
    return true;
  }

  // ON ( STATUS )? ( IS )? Condition
  private static boolean SpecialNamesParagraphStatusPhrase_1_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialNamesParagraphStatusPhrase_1_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ON);
    r = r && SpecialNamesParagraphStatusPhrase_1_4_0_1(b, l + 1);
    r = r && SpecialNamesParagraphStatusPhrase_1_4_0_2(b, l + 1);
    r = r && Condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( STATUS )?
  private static boolean SpecialNamesParagraphStatusPhrase_1_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialNamesParagraphStatusPhrase_1_4_0_1")) return false;
    consumeToken(b, STATUS);
    return true;
  }

  // ( IS )?
  private static boolean SpecialNamesParagraphStatusPhrase_1_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialNamesParagraphStatusPhrase_1_4_0_2")) return false;
    consumeToken(b, IS);
    return true;
  }

  /* ********************************************************** */
  // ADDRESS OF DataName | DEBUG_ITEM | LENGTH OF Identifier | RETURN_CODE | SHIFT_OUT | SHIFT_IN | SORT_CONTROL | SORT_CORE_SIZE | SORT_FILE_SIZE | SORT_MESSAGE | SORT_MODE_SIZE | SORT_RETURN | TALLY | WHEN_COMPILED
  public static boolean SpecialRegister(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialRegister")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SPECIAL_REGISTER, "<special register>");
    r = SpecialRegister_0(b, l + 1);
    if (!r) r = consumeToken(b, DEBUG_ITEM);
    if (!r) r = SpecialRegister_2(b, l + 1);
    if (!r) r = consumeToken(b, RETURN_CODE);
    if (!r) r = consumeToken(b, SHIFT_OUT);
    if (!r) r = consumeToken(b, SHIFT_IN);
    if (!r) r = consumeToken(b, SORT_CONTROL);
    if (!r) r = consumeToken(b, SORT_CORE_SIZE);
    if (!r) r = consumeToken(b, SORT_FILE_SIZE);
    if (!r) r = consumeToken(b, SORT_MESSAGE);
    if (!r) r = consumeToken(b, SORT_MODE_SIZE);
    if (!r) r = consumeToken(b, SORT_RETURN);
    if (!r) r = consumeToken(b, TALLY);
    if (!r) r = consumeToken(b, WHEN_COMPILED);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ADDRESS OF DataName
  private static boolean SpecialRegister_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialRegister_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ADDRESS, OF);
    r = r && DataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LENGTH OF Identifier
  private static boolean SpecialRegister_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialRegister_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LENGTH, OF);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // START FileName ( KEY ( IS )? ( EQUAL ( TO )? | EQUALCHAR | GREATER ( THAN )? | MORETHANCHAR | NOT LESS ( THAN )? | NOT LESSTHANCHAR | GREATER ( THAN )? OR EQUAL ( TO )? | MORETHANOREQUAL ) QualifiedDataName )? ( INVALID ( KEY )? StatementList )? ( NOT INVALID ( KEY )? StatementList )? ( END_START )?
  public static boolean StartStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartStatement")) return false;
    if (!nextTokenIs(b, START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, START);
    r = r && FileName(b, l + 1);
    r = r && StartStatement_2(b, l + 1);
    r = r && StartStatement_3(b, l + 1);
    r = r && StartStatement_4(b, l + 1);
    r = r && StartStatement_5(b, l + 1);
    exit_section_(b, m, START_STATEMENT, r);
    return r;
  }

  // ( KEY ( IS )? ( EQUAL ( TO )? | EQUALCHAR | GREATER ( THAN )? | MORETHANCHAR | NOT LESS ( THAN )? | NOT LESSTHANCHAR | GREATER ( THAN )? OR EQUAL ( TO )? | MORETHANOREQUAL ) QualifiedDataName )?
  private static boolean StartStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartStatement_2")) return false;
    StartStatement_2_0(b, l + 1);
    return true;
  }

  // KEY ( IS )? ( EQUAL ( TO )? | EQUALCHAR | GREATER ( THAN )? | MORETHANCHAR | NOT LESS ( THAN )? | NOT LESSTHANCHAR | GREATER ( THAN )? OR EQUAL ( TO )? | MORETHANOREQUAL ) QualifiedDataName
  private static boolean StartStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEY);
    r = r && StartStatement_2_0_1(b, l + 1);
    r = r && StartStatement_2_0_2(b, l + 1);
    r = r && QualifiedDataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IS )?
  private static boolean StartStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartStatement_2_0_1")) return false;
    consumeToken(b, IS);
    return true;
  }

  // EQUAL ( TO )? | EQUALCHAR | GREATER ( THAN )? | MORETHANCHAR | NOT LESS ( THAN )? | NOT LESSTHANCHAR | GREATER ( THAN )? OR EQUAL ( TO )? | MORETHANOREQUAL
  private static boolean StartStatement_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartStatement_2_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StartStatement_2_0_2_0(b, l + 1);
    if (!r) r = consumeToken(b, EQUALCHAR);
    if (!r) r = StartStatement_2_0_2_2(b, l + 1);
    if (!r) r = consumeToken(b, MORETHANCHAR);
    if (!r) r = StartStatement_2_0_2_4(b, l + 1);
    if (!r) r = parseTokens(b, 0, NOT, LESSTHANCHAR);
    if (!r) r = StartStatement_2_0_2_6(b, l + 1);
    if (!r) r = consumeToken(b, MORETHANOREQUAL);
    exit_section_(b, m, null, r);
    return r;
  }

  // EQUAL ( TO )?
  private static boolean StartStatement_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartStatement_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUAL);
    r = r && StartStatement_2_0_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TO )?
  private static boolean StartStatement_2_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartStatement_2_0_2_0_1")) return false;
    consumeToken(b, TO);
    return true;
  }

  // GREATER ( THAN )?
  private static boolean StartStatement_2_0_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartStatement_2_0_2_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GREATER);
    r = r && StartStatement_2_0_2_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( THAN )?
  private static boolean StartStatement_2_0_2_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartStatement_2_0_2_2_1")) return false;
    consumeToken(b, THAN);
    return true;
  }

  // NOT LESS ( THAN )?
  private static boolean StartStatement_2_0_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartStatement_2_0_2_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NOT, LESS);
    r = r && StartStatement_2_0_2_4_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( THAN )?
  private static boolean StartStatement_2_0_2_4_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartStatement_2_0_2_4_2")) return false;
    consumeToken(b, THAN);
    return true;
  }

  // GREATER ( THAN )? OR EQUAL ( TO )?
  private static boolean StartStatement_2_0_2_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartStatement_2_0_2_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GREATER);
    r = r && StartStatement_2_0_2_6_1(b, l + 1);
    r = r && consumeTokens(b, 0, OR, EQUAL);
    r = r && StartStatement_2_0_2_6_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( THAN )?
  private static boolean StartStatement_2_0_2_6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartStatement_2_0_2_6_1")) return false;
    consumeToken(b, THAN);
    return true;
  }

  // ( TO )?
  private static boolean StartStatement_2_0_2_6_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartStatement_2_0_2_6_4")) return false;
    consumeToken(b, TO);
    return true;
  }

  // ( INVALID ( KEY )? StatementList )?
  private static boolean StartStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartStatement_3")) return false;
    StartStatement_3_0(b, l + 1);
    return true;
  }

  // INVALID ( KEY )? StatementList
  private static boolean StartStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INVALID);
    r = r && StartStatement_3_0_1(b, l + 1);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( KEY )?
  private static boolean StartStatement_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartStatement_3_0_1")) return false;
    consumeToken(b, KEY);
    return true;
  }

  // ( NOT INVALID ( KEY )? StatementList )?
  private static boolean StartStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartStatement_4")) return false;
    StartStatement_4_0(b, l + 1);
    return true;
  }

  // NOT INVALID ( KEY )? StatementList
  private static boolean StartStatement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartStatement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NOT, INVALID);
    r = r && StartStatement_4_0_2(b, l + 1);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( KEY )?
  private static boolean StartStatement_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartStatement_4_0_2")) return false;
    consumeToken(b, KEY);
    return true;
  }

  // ( END_START )?
  private static boolean StartStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartStatement_5")) return false;
    consumeToken(b, END_START);
    return true;
  }

  /* ********************************************************** */
  // AcceptStatement | AddStatement | AlterStatement | CallStatement | CancelStatement | CloseStatement | ComputeStatement | ContinueStatement | DeleteStatement | DisplayStatement | DivideStatement | EntryStatement | EvaluateStatement | ExitProgramStatement | GobackStatement | GotoStatement | IfStatement | InitializeStatement | InspectStatement | MergeStatement | MoveStatement | MultiplyStatement | OpenStatement | PerformStatement | ReadStatement | ReleaseStatement | ReturnStatement | RewriteStatement | SearchStatement | SetStatement | SortStatement | StartStatement | StopStatement | StringStatement | SubtractStatement | UnstringStatement | WriteStatement
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = AcceptStatement(b, l + 1);
    if (!r) r = AddStatement(b, l + 1);
    if (!r) r = AlterStatement(b, l + 1);
    if (!r) r = CallStatement(b, l + 1);
    if (!r) r = CancelStatement(b, l + 1);
    if (!r) r = CloseStatement(b, l + 1);
    if (!r) r = ComputeStatement(b, l + 1);
    if (!r) r = ContinueStatement(b, l + 1);
    if (!r) r = DeleteStatement(b, l + 1);
    if (!r) r = DisplayStatement(b, l + 1);
    if (!r) r = DivideStatement(b, l + 1);
    if (!r) r = EntryStatement(b, l + 1);
    if (!r) r = EvaluateStatement(b, l + 1);
    if (!r) r = ExitProgramStatement(b, l + 1);
    if (!r) r = GobackStatement(b, l + 1);
    if (!r) r = GotoStatement(b, l + 1);
    if (!r) r = IfStatement(b, l + 1);
    if (!r) r = InitializeStatement(b, l + 1);
    if (!r) r = InspectStatement(b, l + 1);
    if (!r) r = MergeStatement(b, l + 1);
    if (!r) r = MoveStatement(b, l + 1);
    if (!r) r = MultiplyStatement(b, l + 1);
    if (!r) r = OpenStatement(b, l + 1);
    if (!r) r = PerformStatement(b, l + 1);
    if (!r) r = ReadStatement(b, l + 1);
    if (!r) r = ReleaseStatement(b, l + 1);
    if (!r) r = ReturnStatement(b, l + 1);
    if (!r) r = RewriteStatement(b, l + 1);
    if (!r) r = SearchStatement(b, l + 1);
    if (!r) r = SetStatement(b, l + 1);
    if (!r) r = SortStatement(b, l + 1);
    if (!r) r = StartStatement(b, l + 1);
    if (!r) r = StopStatement(b, l + 1);
    if (!r) r = StringStatement(b, l + 1);
    if (!r) r = SubtractStatement(b, l + 1);
    if (!r) r = UnstringStatement(b, l + 1);
    if (!r) r = WriteStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( Statement )+
  public static boolean StatementList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_LIST, "<statement list>");
    r = StatementList_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!StatementList_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StatementList", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( Statement )
  private static boolean StatementList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STOP ( RUN | Literal )
  public static boolean StopStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StopStatement")) return false;
    if (!nextTokenIs(b, STOP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STOP);
    r = r && StopStatement_1(b, l + 1);
    exit_section_(b, m, STOP_STATEMENT, r);
    return r;
  }

  // RUN | Literal
  private static boolean StopStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StopStatement_1")) return false;
    boolean r;
    r = consumeToken(b, RUN);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // STRING ( ( QualifiedDataName | Literal )+ DELIMITED ( BY )? ( Identifier | Literal | SIZE ) )+ INTO Identifier ( ( WITH )? POINTER QualifiedDataName )? ( ( ON )? OVERFLOW StatementList )? ( NOT ( ON )? OVERFLOW StatementList )? ( END_STRING )?
  public static boolean StringStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringStatement")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    r = r && StringStatement_1(b, l + 1);
    r = r && consumeToken(b, INTO);
    r = r && Identifier(b, l + 1);
    r = r && StringStatement_4(b, l + 1);
    r = r && StringStatement_5(b, l + 1);
    r = r && StringStatement_6(b, l + 1);
    r = r && StringStatement_7(b, l + 1);
    exit_section_(b, m, STRING_STATEMENT, r);
    return r;
  }

  // ( ( QualifiedDataName | Literal )+ DELIMITED ( BY )? ( Identifier | Literal | SIZE ) )+
  private static boolean StringStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StringStatement_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!StringStatement_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StringStatement_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( QualifiedDataName | Literal )+ DELIMITED ( BY )? ( Identifier | Literal | SIZE )
  private static boolean StringStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StringStatement_1_0_0(b, l + 1);
    r = r && consumeToken(b, DELIMITED);
    r = r && StringStatement_1_0_2(b, l + 1);
    r = r && StringStatement_1_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( QualifiedDataName | Literal )+
  private static boolean StringStatement_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringStatement_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StringStatement_1_0_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!StringStatement_1_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StringStatement_1_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // QualifiedDataName | Literal
  private static boolean StringStatement_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringStatement_1_0_0_0")) return false;
    boolean r;
    r = QualifiedDataName(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  // ( BY )?
  private static boolean StringStatement_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringStatement_1_0_2")) return false;
    consumeToken(b, BY);
    return true;
  }

  // Identifier | Literal | SIZE
  private static boolean StringStatement_1_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringStatement_1_0_3")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    if (!r) r = consumeToken(b, SIZE);
    return r;
  }

  // ( ( WITH )? POINTER QualifiedDataName )?
  private static boolean StringStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringStatement_4")) return false;
    StringStatement_4_0(b, l + 1);
    return true;
  }

  // ( WITH )? POINTER QualifiedDataName
  private static boolean StringStatement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringStatement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StringStatement_4_0_0(b, l + 1);
    r = r && consumeToken(b, POINTER);
    r = r && QualifiedDataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WITH )?
  private static boolean StringStatement_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringStatement_4_0_0")) return false;
    consumeToken(b, WITH);
    return true;
  }

  // ( ( ON )? OVERFLOW StatementList )?
  private static boolean StringStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringStatement_5")) return false;
    StringStatement_5_0(b, l + 1);
    return true;
  }

  // ( ON )? OVERFLOW StatementList
  private static boolean StringStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StringStatement_5_0_0(b, l + 1);
    r = r && consumeToken(b, OVERFLOW);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ON )?
  private static boolean StringStatement_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringStatement_5_0_0")) return false;
    consumeToken(b, ON);
    return true;
  }

  // ( NOT ( ON )? OVERFLOW StatementList )?
  private static boolean StringStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringStatement_6")) return false;
    StringStatement_6_0(b, l + 1);
    return true;
  }

  // NOT ( ON )? OVERFLOW StatementList
  private static boolean StringStatement_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringStatement_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && StringStatement_6_0_1(b, l + 1);
    r = r && consumeToken(b, OVERFLOW);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ON )?
  private static boolean StringStatement_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringStatement_6_0_1")) return false;
    consumeToken(b, ON);
    return true;
  }

  // ( END_STRING )?
  private static boolean StringStatement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringStatement_7")) return false;
    consumeToken(b, END_STRING);
    return true;
  }

  /* ********************************************************** */
  // ( IntegerConstant | QualifiedDataName ( ( PLUSCHAR | MINUSCHAR ) IntegerConstant )? | IndexName ( ( PLUSCHAR | MINUSCHAR ) IntegerConstant )? )+
  public static boolean Subscript(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Subscript")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBSCRIPT, "<subscript>");
    r = Subscript_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Subscript_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Subscript", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IntegerConstant | QualifiedDataName ( ( PLUSCHAR | MINUSCHAR ) IntegerConstant )? | IndexName ( ( PLUSCHAR | MINUSCHAR ) IntegerConstant )?
  private static boolean Subscript_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Subscript_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IntegerConstant(b, l + 1);
    if (!r) r = Subscript_0_1(b, l + 1);
    if (!r) r = Subscript_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // QualifiedDataName ( ( PLUSCHAR | MINUSCHAR ) IntegerConstant )?
  private static boolean Subscript_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Subscript_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedDataName(b, l + 1);
    r = r && Subscript_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( PLUSCHAR | MINUSCHAR ) IntegerConstant )?
  private static boolean Subscript_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Subscript_0_1_1")) return false;
    Subscript_0_1_1_0(b, l + 1);
    return true;
  }

  // ( PLUSCHAR | MINUSCHAR ) IntegerConstant
  private static boolean Subscript_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Subscript_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Subscript_0_1_1_0_0(b, l + 1);
    r = r && IntegerConstant(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PLUSCHAR | MINUSCHAR
  private static boolean Subscript_0_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Subscript_0_1_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, PLUSCHAR);
    if (!r) r = consumeToken(b, MINUSCHAR);
    return r;
  }

  // IndexName ( ( PLUSCHAR | MINUSCHAR ) IntegerConstant )?
  private static boolean Subscript_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Subscript_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IndexName(b, l + 1);
    r = r && Subscript_0_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( PLUSCHAR | MINUSCHAR ) IntegerConstant )?
  private static boolean Subscript_0_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Subscript_0_2_1")) return false;
    Subscript_0_2_1_0(b, l + 1);
    return true;
  }

  // ( PLUSCHAR | MINUSCHAR ) IntegerConstant
  private static boolean Subscript_0_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Subscript_0_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Subscript_0_2_1_0_0(b, l + 1);
    r = r && IntegerConstant(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PLUSCHAR | MINUSCHAR
  private static boolean Subscript_0_2_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Subscript_0_2_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, PLUSCHAR);
    if (!r) r = consumeToken(b, MINUSCHAR);
    return r;
  }

  /* ********************************************************** */
  // SUBTRACT ( ( Identifier | Literal )+ FROM ( Identifier ( ROUNDED )? )+ | ( Identifier | Literal ) FROM Identifier ( ROUNDED )? GIVING Identifier | ( CORRESPONDING | CORR ) QualifiedDataName FROM QualifiedDataName ) ( ( ON )? SIZE ERROR StatementList )? ( NOT ( ON )? SIZE ERROR StatementList )? ( END_SUBTRACT )?
  public static boolean SubtractStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubtractStatement")) return false;
    if (!nextTokenIs(b, SUBTRACT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SUBTRACT);
    r = r && SubtractStatement_1(b, l + 1);
    r = r && SubtractStatement_2(b, l + 1);
    r = r && SubtractStatement_3(b, l + 1);
    r = r && SubtractStatement_4(b, l + 1);
    exit_section_(b, m, SUBTRACT_STATEMENT, r);
    return r;
  }

  // ( Identifier | Literal )+ FROM ( Identifier ( ROUNDED )? )+ | ( Identifier | Literal ) FROM Identifier ( ROUNDED )? GIVING Identifier | ( CORRESPONDING | CORR ) QualifiedDataName FROM QualifiedDataName
  private static boolean SubtractStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubtractStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SubtractStatement_1_0(b, l + 1);
    if (!r) r = SubtractStatement_1_1(b, l + 1);
    if (!r) r = SubtractStatement_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Identifier | Literal )+ FROM ( Identifier ( ROUNDED )? )+
  private static boolean SubtractStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubtractStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SubtractStatement_1_0_0(b, l + 1);
    r = r && consumeToken(b, FROM);
    r = r && SubtractStatement_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Identifier | Literal )+
  private static boolean SubtractStatement_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubtractStatement_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SubtractStatement_1_0_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!SubtractStatement_1_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SubtractStatement_1_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier | Literal
  private static boolean SubtractStatement_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubtractStatement_1_0_0_0")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  // ( Identifier ( ROUNDED )? )+
  private static boolean SubtractStatement_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubtractStatement_1_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SubtractStatement_1_0_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!SubtractStatement_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SubtractStatement_1_0_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier ( ROUNDED )?
  private static boolean SubtractStatement_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubtractStatement_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && SubtractStatement_1_0_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ROUNDED )?
  private static boolean SubtractStatement_1_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubtractStatement_1_0_2_0_1")) return false;
    consumeToken(b, ROUNDED);
    return true;
  }

  // ( Identifier | Literal ) FROM Identifier ( ROUNDED )? GIVING Identifier
  private static boolean SubtractStatement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubtractStatement_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SubtractStatement_1_1_0(b, l + 1);
    r = r && consumeToken(b, FROM);
    r = r && Identifier(b, l + 1);
    r = r && SubtractStatement_1_1_3(b, l + 1);
    r = r && consumeToken(b, GIVING);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier | Literal
  private static boolean SubtractStatement_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubtractStatement_1_1_0")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  // ( ROUNDED )?
  private static boolean SubtractStatement_1_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubtractStatement_1_1_3")) return false;
    consumeToken(b, ROUNDED);
    return true;
  }

  // ( CORRESPONDING | CORR ) QualifiedDataName FROM QualifiedDataName
  private static boolean SubtractStatement_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubtractStatement_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SubtractStatement_1_2_0(b, l + 1);
    r = r && QualifiedDataName(b, l + 1);
    r = r && consumeToken(b, FROM);
    r = r && QualifiedDataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CORRESPONDING | CORR
  private static boolean SubtractStatement_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubtractStatement_1_2_0")) return false;
    boolean r;
    r = consumeToken(b, CORRESPONDING);
    if (!r) r = consumeToken(b, CORR);
    return r;
  }

  // ( ( ON )? SIZE ERROR StatementList )?
  private static boolean SubtractStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubtractStatement_2")) return false;
    SubtractStatement_2_0(b, l + 1);
    return true;
  }

  // ( ON )? SIZE ERROR StatementList
  private static boolean SubtractStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubtractStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SubtractStatement_2_0_0(b, l + 1);
    r = r && consumeTokens(b, 0, SIZE, ERROR);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ON )?
  private static boolean SubtractStatement_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubtractStatement_2_0_0")) return false;
    consumeToken(b, ON);
    return true;
  }

  // ( NOT ( ON )? SIZE ERROR StatementList )?
  private static boolean SubtractStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubtractStatement_3")) return false;
    SubtractStatement_3_0(b, l + 1);
    return true;
  }

  // NOT ( ON )? SIZE ERROR StatementList
  private static boolean SubtractStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubtractStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && SubtractStatement_3_0_1(b, l + 1);
    r = r && consumeTokens(b, 0, SIZE, ERROR);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ON )?
  private static boolean SubtractStatement_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubtractStatement_3_0_1")) return false;
    consumeToken(b, ON);
    return true;
  }

  // ( END_SUBTRACT )?
  private static boolean SubtractStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubtractStatement_4")) return false;
    consumeToken(b, END_SUBTRACT);
    return true;
  }

  /* ********************************************************** */
  // CobolWord
  public static boolean SymbolicCharacter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolicCharacter")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CobolWord(b, l + 1);
    exit_section_(b, m, SYMBOLIC_CHARACTER, r);
    return r;
  }

  /* ********************************************************** */
  // SYMBOLIC ( CHARACTERS )? ( ( SymbolicCharacter )+ ( ( ARE | IS ) )? ( IntegerConstant )+ )+ ( IN AlphabetName )?
  public static boolean SymbolicCharactersClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolicCharactersClause")) return false;
    if (!nextTokenIs(b, SYMBOLIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOLIC);
    r = r && SymbolicCharactersClause_1(b, l + 1);
    r = r && SymbolicCharactersClause_2(b, l + 1);
    r = r && SymbolicCharactersClause_3(b, l + 1);
    exit_section_(b, m, SYMBOLIC_CHARACTERS_CLAUSE, r);
    return r;
  }

  // ( CHARACTERS )?
  private static boolean SymbolicCharactersClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolicCharactersClause_1")) return false;
    consumeToken(b, CHARACTERS);
    return true;
  }

  // ( ( SymbolicCharacter )+ ( ( ARE | IS ) )? ( IntegerConstant )+ )+
  private static boolean SymbolicCharactersClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolicCharactersClause_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SymbolicCharactersClause_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!SymbolicCharactersClause_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SymbolicCharactersClause_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( SymbolicCharacter )+ ( ( ARE | IS ) )? ( IntegerConstant )+
  private static boolean SymbolicCharactersClause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolicCharactersClause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SymbolicCharactersClause_2_0_0(b, l + 1);
    r = r && SymbolicCharactersClause_2_0_1(b, l + 1);
    r = r && SymbolicCharactersClause_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( SymbolicCharacter )+
  private static boolean SymbolicCharactersClause_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolicCharactersClause_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SymbolicCharactersClause_2_0_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!SymbolicCharactersClause_2_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SymbolicCharactersClause_2_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( SymbolicCharacter )
  private static boolean SymbolicCharactersClause_2_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolicCharactersClause_2_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SymbolicCharacter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( ARE | IS ) )?
  private static boolean SymbolicCharactersClause_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolicCharactersClause_2_0_1")) return false;
    SymbolicCharactersClause_2_0_1_0(b, l + 1);
    return true;
  }

  // ARE | IS
  private static boolean SymbolicCharactersClause_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolicCharactersClause_2_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, ARE);
    if (!r) r = consumeToken(b, IS);
    return r;
  }

  // ( IntegerConstant )+
  private static boolean SymbolicCharactersClause_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolicCharactersClause_2_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SymbolicCharactersClause_2_0_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!SymbolicCharactersClause_2_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SymbolicCharactersClause_2_0_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IntegerConstant )
  private static boolean SymbolicCharactersClause_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolicCharactersClause_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IntegerConstant(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IN AlphabetName )?
  private static boolean SymbolicCharactersClause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolicCharactersClause_3")) return false;
    SymbolicCharactersClause_3_0(b, l + 1);
    return true;
  }

  // IN AlphabetName
  private static boolean SymbolicCharactersClause_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolicCharactersClause_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IN);
    r = r && AlphabetName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CobolWord
  public static boolean SystemName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SystemName")) return false;
    if (!nextTokenIs(b, COBOL_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CobolWord(b, l + 1);
    exit_section_(b, m, SYSTEM_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // TALLYING ( Identifier FOR ( CHARACTERS ( BeforeAfterPhrase )* | ( ALL | LEADING ) ( ( Identifier | Literal ) ( BeforeAfterPhrase )* )+ )+ )+ ( ReplacingPhrase )?
  public static boolean TallyingPhrase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TallyingPhrase")) return false;
    if (!nextTokenIs(b, TALLYING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TALLYING);
    r = r && TallyingPhrase_1(b, l + 1);
    r = r && TallyingPhrase_2(b, l + 1);
    exit_section_(b, m, TALLYING_PHRASE, r);
    return r;
  }

  // ( Identifier FOR ( CHARACTERS ( BeforeAfterPhrase )* | ( ALL | LEADING ) ( ( Identifier | Literal ) ( BeforeAfterPhrase )* )+ )+ )+
  private static boolean TallyingPhrase_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TallyingPhrase_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TallyingPhrase_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!TallyingPhrase_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TallyingPhrase_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier FOR ( CHARACTERS ( BeforeAfterPhrase )* | ( ALL | LEADING ) ( ( Identifier | Literal ) ( BeforeAfterPhrase )* )+ )+
  private static boolean TallyingPhrase_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TallyingPhrase_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, FOR);
    r = r && TallyingPhrase_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( CHARACTERS ( BeforeAfterPhrase )* | ( ALL | LEADING ) ( ( Identifier | Literal ) ( BeforeAfterPhrase )* )+ )+
  private static boolean TallyingPhrase_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TallyingPhrase_1_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TallyingPhrase_1_0_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!TallyingPhrase_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TallyingPhrase_1_0_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // CHARACTERS ( BeforeAfterPhrase )* | ( ALL | LEADING ) ( ( Identifier | Literal ) ( BeforeAfterPhrase )* )+
  private static boolean TallyingPhrase_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TallyingPhrase_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TallyingPhrase_1_0_2_0_0(b, l + 1);
    if (!r) r = TallyingPhrase_1_0_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CHARACTERS ( BeforeAfterPhrase )*
  private static boolean TallyingPhrase_1_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TallyingPhrase_1_0_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CHARACTERS);
    r = r && TallyingPhrase_1_0_2_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( BeforeAfterPhrase )*
  private static boolean TallyingPhrase_1_0_2_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TallyingPhrase_1_0_2_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TallyingPhrase_1_0_2_0_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TallyingPhrase_1_0_2_0_0_1", c)) break;
    }
    return true;
  }

  // ( BeforeAfterPhrase )
  private static boolean TallyingPhrase_1_0_2_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TallyingPhrase_1_0_2_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BeforeAfterPhrase(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ALL | LEADING ) ( ( Identifier | Literal ) ( BeforeAfterPhrase )* )+
  private static boolean TallyingPhrase_1_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TallyingPhrase_1_0_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TallyingPhrase_1_0_2_0_1_0(b, l + 1);
    r = r && TallyingPhrase_1_0_2_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ALL | LEADING
  private static boolean TallyingPhrase_1_0_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TallyingPhrase_1_0_2_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, ALL);
    if (!r) r = consumeToken(b, LEADING);
    return r;
  }

  // ( ( Identifier | Literal ) ( BeforeAfterPhrase )* )+
  private static boolean TallyingPhrase_1_0_2_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TallyingPhrase_1_0_2_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TallyingPhrase_1_0_2_0_1_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!TallyingPhrase_1_0_2_0_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TallyingPhrase_1_0_2_0_1_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Identifier | Literal ) ( BeforeAfterPhrase )*
  private static boolean TallyingPhrase_1_0_2_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TallyingPhrase_1_0_2_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TallyingPhrase_1_0_2_0_1_1_0_0(b, l + 1);
    r = r && TallyingPhrase_1_0_2_0_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier | Literal
  private static boolean TallyingPhrase_1_0_2_0_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TallyingPhrase_1_0_2_0_1_1_0_0")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  // ( BeforeAfterPhrase )*
  private static boolean TallyingPhrase_1_0_2_0_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TallyingPhrase_1_0_2_0_1_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TallyingPhrase_1_0_2_0_1_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TallyingPhrase_1_0_2_0_1_1_0_1", c)) break;
    }
    return true;
  }

  // ( BeforeAfterPhrase )
  private static boolean TallyingPhrase_1_0_2_0_1_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TallyingPhrase_1_0_2_0_1_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BeforeAfterPhrase(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ReplacingPhrase )?
  private static boolean TallyingPhrase_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TallyingPhrase_2")) return false;
    TallyingPhrase_2_0(b, l + 1);
    return true;
  }

  // ( ReplacingPhrase )
  private static boolean TallyingPhrase_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TallyingPhrase_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ReplacingPhrase(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Power ( ( ASTERISKCHAR | SLASHCHAR ) Power )*
  public static boolean TimesDiv(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TimesDiv")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TIMES_DIV, "<times div>");
    r = Power(b, l + 1);
    r = r && TimesDiv_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ( ASTERISKCHAR | SLASHCHAR ) Power )*
  private static boolean TimesDiv_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TimesDiv_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TimesDiv_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TimesDiv_1", c)) break;
    }
    return true;
  }

  // ( ASTERISKCHAR | SLASHCHAR ) Power
  private static boolean TimesDiv_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TimesDiv_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TimesDiv_1_0_0(b, l + 1);
    r = r && Power(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ASTERISKCHAR | SLASHCHAR
  private static boolean TimesDiv_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TimesDiv_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, ASTERISKCHAR);
    if (!r) r = consumeToken(b, SLASHCHAR);
    return r;
  }

  /* ********************************************************** */
  // UNSTRING QualifiedDataName ( DELIMITED ( BY )? ( ALL )? ( Identifier | Literal ) ( OR ( ALL )? ( Identifier | Literal ) )* )? INTO ( Identifier ( DELIMITER ( IN )? Identifier )? ( COUNT ( IN )? Identifier )? )+ ( ( WITH )? POINTER QualifiedDataName )? ( TALLYING ( IN )? QualifiedDataName )? ( ( ON )? OVERFLOW StatementList )? ( NOT ( ON )? OVERFLOW StatementList )? ( END_UNSTRING )?
  public static boolean UnstringStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement")) return false;
    if (!nextTokenIs(b, UNSTRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNSTRING);
    r = r && QualifiedDataName(b, l + 1);
    r = r && UnstringStatement_2(b, l + 1);
    r = r && consumeToken(b, INTO);
    r = r && UnstringStatement_4(b, l + 1);
    r = r && UnstringStatement_5(b, l + 1);
    r = r && UnstringStatement_6(b, l + 1);
    r = r && UnstringStatement_7(b, l + 1);
    r = r && UnstringStatement_8(b, l + 1);
    r = r && UnstringStatement_9(b, l + 1);
    exit_section_(b, m, UNSTRING_STATEMENT, r);
    return r;
  }

  // ( DELIMITED ( BY )? ( ALL )? ( Identifier | Literal ) ( OR ( ALL )? ( Identifier | Literal ) )* )?
  private static boolean UnstringStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_2")) return false;
    UnstringStatement_2_0(b, l + 1);
    return true;
  }

  // DELIMITED ( BY )? ( ALL )? ( Identifier | Literal ) ( OR ( ALL )? ( Identifier | Literal ) )*
  private static boolean UnstringStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DELIMITED);
    r = r && UnstringStatement_2_0_1(b, l + 1);
    r = r && UnstringStatement_2_0_2(b, l + 1);
    r = r && UnstringStatement_2_0_3(b, l + 1);
    r = r && UnstringStatement_2_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( BY )?
  private static boolean UnstringStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_2_0_1")) return false;
    consumeToken(b, BY);
    return true;
  }

  // ( ALL )?
  private static boolean UnstringStatement_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_2_0_2")) return false;
    consumeToken(b, ALL);
    return true;
  }

  // Identifier | Literal
  private static boolean UnstringStatement_2_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_2_0_3")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  // ( OR ( ALL )? ( Identifier | Literal ) )*
  private static boolean UnstringStatement_2_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_2_0_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!UnstringStatement_2_0_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UnstringStatement_2_0_4", c)) break;
    }
    return true;
  }

  // OR ( ALL )? ( Identifier | Literal )
  private static boolean UnstringStatement_2_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_2_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OR);
    r = r && UnstringStatement_2_0_4_0_1(b, l + 1);
    r = r && UnstringStatement_2_0_4_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ALL )?
  private static boolean UnstringStatement_2_0_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_2_0_4_0_1")) return false;
    consumeToken(b, ALL);
    return true;
  }

  // Identifier | Literal
  private static boolean UnstringStatement_2_0_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_2_0_4_0_2")) return false;
    boolean r;
    r = Identifier(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  // ( Identifier ( DELIMITER ( IN )? Identifier )? ( COUNT ( IN )? Identifier )? )+
  private static boolean UnstringStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnstringStatement_4_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!UnstringStatement_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UnstringStatement_4", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier ( DELIMITER ( IN )? Identifier )? ( COUNT ( IN )? Identifier )?
  private static boolean UnstringStatement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && UnstringStatement_4_0_1(b, l + 1);
    r = r && UnstringStatement_4_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( DELIMITER ( IN )? Identifier )?
  private static boolean UnstringStatement_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_4_0_1")) return false;
    UnstringStatement_4_0_1_0(b, l + 1);
    return true;
  }

  // DELIMITER ( IN )? Identifier
  private static boolean UnstringStatement_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_4_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DELIMITER);
    r = r && UnstringStatement_4_0_1_0_1(b, l + 1);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IN )?
  private static boolean UnstringStatement_4_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_4_0_1_0_1")) return false;
    consumeToken(b, IN);
    return true;
  }

  // ( COUNT ( IN )? Identifier )?
  private static boolean UnstringStatement_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_4_0_2")) return false;
    UnstringStatement_4_0_2_0(b, l + 1);
    return true;
  }

  // COUNT ( IN )? Identifier
  private static boolean UnstringStatement_4_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_4_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COUNT);
    r = r && UnstringStatement_4_0_2_0_1(b, l + 1);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IN )?
  private static boolean UnstringStatement_4_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_4_0_2_0_1")) return false;
    consumeToken(b, IN);
    return true;
  }

  // ( ( WITH )? POINTER QualifiedDataName )?
  private static boolean UnstringStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_5")) return false;
    UnstringStatement_5_0(b, l + 1);
    return true;
  }

  // ( WITH )? POINTER QualifiedDataName
  private static boolean UnstringStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnstringStatement_5_0_0(b, l + 1);
    r = r && consumeToken(b, POINTER);
    r = r && QualifiedDataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WITH )?
  private static boolean UnstringStatement_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_5_0_0")) return false;
    consumeToken(b, WITH);
    return true;
  }

  // ( TALLYING ( IN )? QualifiedDataName )?
  private static boolean UnstringStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_6")) return false;
    UnstringStatement_6_0(b, l + 1);
    return true;
  }

  // TALLYING ( IN )? QualifiedDataName
  private static boolean UnstringStatement_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TALLYING);
    r = r && UnstringStatement_6_0_1(b, l + 1);
    r = r && QualifiedDataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IN )?
  private static boolean UnstringStatement_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_6_0_1")) return false;
    consumeToken(b, IN);
    return true;
  }

  // ( ( ON )? OVERFLOW StatementList )?
  private static boolean UnstringStatement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_7")) return false;
    UnstringStatement_7_0(b, l + 1);
    return true;
  }

  // ( ON )? OVERFLOW StatementList
  private static boolean UnstringStatement_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnstringStatement_7_0_0(b, l + 1);
    r = r && consumeToken(b, OVERFLOW);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ON )?
  private static boolean UnstringStatement_7_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_7_0_0")) return false;
    consumeToken(b, ON);
    return true;
  }

  // ( NOT ( ON )? OVERFLOW StatementList )?
  private static boolean UnstringStatement_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_8")) return false;
    UnstringStatement_8_0(b, l + 1);
    return true;
  }

  // NOT ( ON )? OVERFLOW StatementList
  private static boolean UnstringStatement_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && UnstringStatement_8_0_1(b, l + 1);
    r = r && consumeToken(b, OVERFLOW);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ON )?
  private static boolean UnstringStatement_8_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_8_0_1")) return false;
    consumeToken(b, ON);
    return true;
  }

  // ( END_UNSTRING )?
  private static boolean UnstringStatement_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnstringStatement_9")) return false;
    consumeToken(b, END_UNSTRING);
    return true;
  }

  /* ********************************************************** */
  // USE ( ( FOR )? DEBUGGING ( ON )? ( ( ProcedureName )+ | ALL PROCEDURES ) | ( GLOBAL )? AFTER ( STANDARD )? ( ( EXCEPTION | ERROR ) | ( ( BEGINNING | ENDING ) )? ( ( FILE | REEL | UNIT ) )? LABEL ) PROCEDURE ( ON )? ( ( FileName )+ | INPUT | OUTPUT | I_O | EXTEND ) )
  public static boolean UseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement")) return false;
    if (!nextTokenIs(b, USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USE);
    r = r && UseStatement_1(b, l + 1);
    exit_section_(b, m, USE_STATEMENT, r);
    return r;
  }

  // ( FOR )? DEBUGGING ( ON )? ( ( ProcedureName )+ | ALL PROCEDURES ) | ( GLOBAL )? AFTER ( STANDARD )? ( ( EXCEPTION | ERROR ) | ( ( BEGINNING | ENDING ) )? ( ( FILE | REEL | UNIT ) )? LABEL ) PROCEDURE ( ON )? ( ( FileName )+ | INPUT | OUTPUT | I_O | EXTEND )
  private static boolean UseStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UseStatement_1_0(b, l + 1);
    if (!r) r = UseStatement_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FOR )? DEBUGGING ( ON )? ( ( ProcedureName )+ | ALL PROCEDURES )
  private static boolean UseStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UseStatement_1_0_0(b, l + 1);
    r = r && consumeToken(b, DEBUGGING);
    r = r && UseStatement_1_0_2(b, l + 1);
    r = r && UseStatement_1_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FOR )?
  private static boolean UseStatement_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement_1_0_0")) return false;
    consumeToken(b, FOR);
    return true;
  }

  // ( ON )?
  private static boolean UseStatement_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement_1_0_2")) return false;
    consumeToken(b, ON);
    return true;
  }

  // ( ProcedureName )+ | ALL PROCEDURES
  private static boolean UseStatement_1_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement_1_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UseStatement_1_0_3_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, ALL, PROCEDURES);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ProcedureName )+
  private static boolean UseStatement_1_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement_1_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UseStatement_1_0_3_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!UseStatement_1_0_3_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UseStatement_1_0_3_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ProcedureName )
  private static boolean UseStatement_1_0_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement_1_0_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ProcedureName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( GLOBAL )? AFTER ( STANDARD )? ( ( EXCEPTION | ERROR ) | ( ( BEGINNING | ENDING ) )? ( ( FILE | REEL | UNIT ) )? LABEL ) PROCEDURE ( ON )? ( ( FileName )+ | INPUT | OUTPUT | I_O | EXTEND )
  private static boolean UseStatement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UseStatement_1_1_0(b, l + 1);
    r = r && consumeToken(b, AFTER);
    r = r && UseStatement_1_1_2(b, l + 1);
    r = r && UseStatement_1_1_3(b, l + 1);
    r = r && consumeToken(b, PROCEDURE);
    r = r && UseStatement_1_1_5(b, l + 1);
    r = r && UseStatement_1_1_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( GLOBAL )?
  private static boolean UseStatement_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement_1_1_0")) return false;
    consumeToken(b, GLOBAL);
    return true;
  }

  // ( STANDARD )?
  private static boolean UseStatement_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement_1_1_2")) return false;
    consumeToken(b, STANDARD);
    return true;
  }

  // ( EXCEPTION | ERROR ) | ( ( BEGINNING | ENDING ) )? ( ( FILE | REEL | UNIT ) )? LABEL
  private static boolean UseStatement_1_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement_1_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UseStatement_1_1_3_0(b, l + 1);
    if (!r) r = UseStatement_1_1_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EXCEPTION | ERROR
  private static boolean UseStatement_1_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement_1_1_3_0")) return false;
    boolean r;
    r = consumeToken(b, EXCEPTION);
    if (!r) r = consumeToken(b, ERROR);
    return r;
  }

  // ( ( BEGINNING | ENDING ) )? ( ( FILE | REEL | UNIT ) )? LABEL
  private static boolean UseStatement_1_1_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement_1_1_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UseStatement_1_1_3_1_0(b, l + 1);
    r = r && UseStatement_1_1_3_1_1(b, l + 1);
    r = r && consumeToken(b, LABEL);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( BEGINNING | ENDING ) )?
  private static boolean UseStatement_1_1_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement_1_1_3_1_0")) return false;
    UseStatement_1_1_3_1_0_0(b, l + 1);
    return true;
  }

  // BEGINNING | ENDING
  private static boolean UseStatement_1_1_3_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement_1_1_3_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, BEGINNING);
    if (!r) r = consumeToken(b, ENDING);
    return r;
  }

  // ( ( FILE | REEL | UNIT ) )?
  private static boolean UseStatement_1_1_3_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement_1_1_3_1_1")) return false;
    UseStatement_1_1_3_1_1_0(b, l + 1);
    return true;
  }

  // FILE | REEL | UNIT
  private static boolean UseStatement_1_1_3_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement_1_1_3_1_1_0")) return false;
    boolean r;
    r = consumeToken(b, FILE);
    if (!r) r = consumeToken(b, REEL);
    if (!r) r = consumeToken(b, UNIT);
    return r;
  }

  // ( ON )?
  private static boolean UseStatement_1_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement_1_1_5")) return false;
    consumeToken(b, ON);
    return true;
  }

  // ( FileName )+ | INPUT | OUTPUT | I_O | EXTEND
  private static boolean UseStatement_1_1_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement_1_1_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UseStatement_1_1_6_0(b, l + 1);
    if (!r) r = consumeToken(b, INPUT);
    if (!r) r = consumeToken(b, OUTPUT);
    if (!r) r = consumeToken(b, I_O);
    if (!r) r = consumeToken(b, EXTEND);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FileName )+
  private static boolean UseStatement_1_1_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement_1_1_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UseStatement_1_1_6_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!UseStatement_1_1_6_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UseStatement_1_1_6_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FileName )
  private static boolean UseStatement_1_1_6_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement_1_1_6_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FileName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VALUE OF ( SystemName IS ( QualifiedDataName | Literal ) )+
  public static boolean ValueOfClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValueOfClause")) return false;
    if (!nextTokenIs(b, VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VALUE, OF);
    r = r && ValueOfClause_2(b, l + 1);
    exit_section_(b, m, VALUE_OF_CLAUSE, r);
    return r;
  }

  // ( SystemName IS ( QualifiedDataName | Literal ) )+
  private static boolean ValueOfClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValueOfClause_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ValueOfClause_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ValueOfClause_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ValueOfClause_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // SystemName IS ( QualifiedDataName | Literal )
  private static boolean ValueOfClause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValueOfClause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SystemName(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && ValueOfClause_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // QualifiedDataName | Literal
  private static boolean ValueOfClause_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValueOfClause_2_0_2")) return false;
    boolean r;
    r = QualifiedDataName(b, l + 1);
    if (!r) r = Literal(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // WORKING_STORAGE SECTION DOT ( DataDescriptionEntry )*
  public static boolean WorkingStorageSection(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WorkingStorageSection")) return false;
    if (!nextTokenIs(b, WORKING_STORAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WORKING_STORAGE, SECTION, DOT);
    r = r && WorkingStorageSection_3(b, l + 1);
    exit_section_(b, m, WORKING_STORAGE_SECTION, r);
    return r;
  }

  // ( DataDescriptionEntry )*
  private static boolean WorkingStorageSection_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WorkingStorageSection_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!WorkingStorageSection_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "WorkingStorageSection_3", c)) break;
    }
    return true;
  }

  // ( DataDescriptionEntry )
  private static boolean WorkingStorageSection_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WorkingStorageSection_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DataDescriptionEntry(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // WRITE RecordName ( FROM QualifiedDataName )? ( AdvancingPhrase )? ( ( AT )? ( END_OF_PAGE | EOP ) StatementList )? ( NOT ( AT )? ( END_OF_PAGE | EOP ) StatementList )? ( INVALID ( KEY )? StatementList )? ( NOT INVALID ( KEY )? StatementList )? ( END_WRITE )?
  public static boolean WriteStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WriteStatement")) return false;
    if (!nextTokenIs(b, WRITE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WRITE);
    r = r && RecordName(b, l + 1);
    r = r && WriteStatement_2(b, l + 1);
    r = r && WriteStatement_3(b, l + 1);
    r = r && WriteStatement_4(b, l + 1);
    r = r && WriteStatement_5(b, l + 1);
    r = r && WriteStatement_6(b, l + 1);
    r = r && WriteStatement_7(b, l + 1);
    r = r && WriteStatement_8(b, l + 1);
    exit_section_(b, m, WRITE_STATEMENT, r);
    return r;
  }

  // ( FROM QualifiedDataName )?
  private static boolean WriteStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WriteStatement_2")) return false;
    WriteStatement_2_0(b, l + 1);
    return true;
  }

  // FROM QualifiedDataName
  private static boolean WriteStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WriteStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FROM);
    r = r && QualifiedDataName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( AdvancingPhrase )?
  private static boolean WriteStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WriteStatement_3")) return false;
    WriteStatement_3_0(b, l + 1);
    return true;
  }

  // ( AdvancingPhrase )
  private static boolean WriteStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WriteStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AdvancingPhrase(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( AT )? ( END_OF_PAGE | EOP ) StatementList )?
  private static boolean WriteStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WriteStatement_4")) return false;
    WriteStatement_4_0(b, l + 1);
    return true;
  }

  // ( AT )? ( END_OF_PAGE | EOP ) StatementList
  private static boolean WriteStatement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WriteStatement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WriteStatement_4_0_0(b, l + 1);
    r = r && WriteStatement_4_0_1(b, l + 1);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( AT )?
  private static boolean WriteStatement_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WriteStatement_4_0_0")) return false;
    consumeToken(b, AT);
    return true;
  }

  // END_OF_PAGE | EOP
  private static boolean WriteStatement_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WriteStatement_4_0_1")) return false;
    boolean r;
    r = consumeToken(b, END_OF_PAGE);
    if (!r) r = consumeToken(b, EOP);
    return r;
  }

  // ( NOT ( AT )? ( END_OF_PAGE | EOP ) StatementList )?
  private static boolean WriteStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WriteStatement_5")) return false;
    WriteStatement_5_0(b, l + 1);
    return true;
  }

  // NOT ( AT )? ( END_OF_PAGE | EOP ) StatementList
  private static boolean WriteStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WriteStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && WriteStatement_5_0_1(b, l + 1);
    r = r && WriteStatement_5_0_2(b, l + 1);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( AT )?
  private static boolean WriteStatement_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WriteStatement_5_0_1")) return false;
    consumeToken(b, AT);
    return true;
  }

  // END_OF_PAGE | EOP
  private static boolean WriteStatement_5_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WriteStatement_5_0_2")) return false;
    boolean r;
    r = consumeToken(b, END_OF_PAGE);
    if (!r) r = consumeToken(b, EOP);
    return r;
  }

  // ( INVALID ( KEY )? StatementList )?
  private static boolean WriteStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WriteStatement_6")) return false;
    WriteStatement_6_0(b, l + 1);
    return true;
  }

  // INVALID ( KEY )? StatementList
  private static boolean WriteStatement_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WriteStatement_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INVALID);
    r = r && WriteStatement_6_0_1(b, l + 1);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( KEY )?
  private static boolean WriteStatement_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WriteStatement_6_0_1")) return false;
    consumeToken(b, KEY);
    return true;
  }

  // ( NOT INVALID ( KEY )? StatementList )?
  private static boolean WriteStatement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WriteStatement_7")) return false;
    WriteStatement_7_0(b, l + 1);
    return true;
  }

  // NOT INVALID ( KEY )? StatementList
  private static boolean WriteStatement_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WriteStatement_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NOT, INVALID);
    r = r && WriteStatement_7_0_2(b, l + 1);
    r = r && StatementList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( KEY )?
  private static boolean WriteStatement_7_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WriteStatement_7_0_2")) return false;
    consumeToken(b, KEY);
    return true;
  }

  // ( END_WRITE )?
  private static boolean WriteStatement_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WriteStatement_8")) return false;
    consumeToken(b, END_WRITE);
    return true;
  }

}
